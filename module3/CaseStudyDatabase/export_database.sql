use furama_resort_manager;

-- task 2 Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select hoten from NhanVien
where hoten like 'T%' or hoten like 'H%' or hoten like 'K%' and (length(hoten) >= 15);

-- task 3 Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select*
from KhachHang
where   ((year(curdate())-year(NgaySinh)) >=18) 
and ((year(curdate())-year(NgaySinh))<= 50) 
and (DiaChi="Đà nẵng" or DiaChi="Quảng trị");

-- task 4 Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select loaikhach.IDLoaiKhach, khachhang.IDKhachHang, khachhang.hoten, count(hopdong.IDKhachHang) 'count'
from khachhang 
	join hopdong  on khachhang.IDKhachHang = hopdong.IDKhachHang
    join loaikhach on khachhang.IDLoaiKhachHang = loaikhach.IDLoaiKhach
    where loaikhach.TenLoaiKhach = 'Diamond'
    group by hopdong.IDKhachHang
    order by count ;

-- task 5 Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select hopdong.IDKhachHang, khachhang.HoTen, loaikhach.TenLoaiKhach, hopdong.IDHopDong, dichvu.TenDichVu, NgayLamHopDong, NgayKetThuc, sum(ChiPhiThue + (SoLuong*Gia))  'Tổng Tiền' 
from khachhang
left join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
left join dichvu on dichvu.IDDichVu = hopdong.IDDichVu
left join loaikhach on khachhang.IDLoaiKhachHang = loaikhach.IDLoaiKhach
left join HopDongChiTiet on hopdong.IDHopDong = HopDongChiTiet.IDHopDong
right join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
group by IDKhachHang;

-- task 6 Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
from dichvu 
left join loaidichvu on  loaidichvu.IDLoaiDichVu = dichvu.IDLoaiDichVu
where dichvu.IDDichVu not in(
	select IDDichVu
    from hopdong
    where IDDichVu is not null and month(hopdong.NgayLamHopDong) >= 1 and month(hopdong.NgayLamHopDong) <= 3
);

-- task 7 Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu
from DichVu
	left join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = dichvu.IDLoaiDichVu
 where dichvu.IDLoaiDichVu not in (
     select IDDichVu
     from hopdong
     where IDDichVu is not null and year((hopdong.NgayLamHopDong))=2019)
     and  dichvu.IDDichVu in (
     select IDDichVu
     from hopdong
     where IDDichVu is not null and year((hopdong.NgayLamHopDong))=2018);

-- task 8 Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau. Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct HoTen from khachhang;

select HoTen from khachhang
group by HoTen;

select HoTen from khachhang
where HoTen not in(
	select HoTen from khachhang
    where HoTen is not null
    group by HoTen
    having count(HoTen)>1
);

-- task 9 Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select t.month, count(hopdong.NgayLamHopDong) as SoLuongDangKy, sum(hopdong.tongTien)
from(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as t
left join hopdong on month(hopdong.NgayLamHopDong) = t.month
where hopdong.IDKhachHang in(
	select IDKhachHang from hopdong
    where IDKhachHang is not null
) and year(NgayLamHopDong) = 2019 or year(NgayLamHopDong) is null or  month(NgayLamHopDong) is null
group by t.month;
select month(NgayLamHopDong), count(hopdong.NgayLamHopDong)
from hopdong
	where IDKhachHang in(
    select IDKhachHang
    from hopdong
    where IDKhachHang is not null) and year(NgayLamHopDong)=2019
    group by hopdong.NgayLamHopDong;

-- task 10 Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.IDHopDong, NgayLamHopDong , NgayKetThuc, TienDatCoc, count(HopDongChiTiet.IDDichVuDiKem) as 'Số lần sử dụng dich vụ đi kèm'
from hopdong
join HopDongChiTiet on HopDongChiTiet.IDHopDong = hopdong.IDHopDong;

-- task 11 	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dichvudikem.IDDichVuDiKem, TenDichVuDiKem, DonVi, Gia, TrangThaiKhaDung, HoTen, ten_loai_khach, khach_hang.dia_chi
from dichvudikem
	left join hopdongchitiet on hopdongchitiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
    left join hopdong on hopdong.IDHopDong = hopdongchitiet.id_hop_dong
    left join khach_hang on khach_hang.IDKhachHang = hop_dong.IDKhachHang
    left join loai_khach on loai_khach.IDLoaiKhach = khach_hang.IDLoaiKhachHang
   where loai_khach.ten_loai_khach = 'Diamond' and (khach_hang.dia_chi='Vinh' or khach_hang.dia_chi = 'Quảng ngãi');