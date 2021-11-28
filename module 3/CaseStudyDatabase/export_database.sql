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
   
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 thángcuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hp.IDHopDong, nv.HoTen, kh.HoTen, kh.SDT, dichvu.TenDichVu, count(hdct.IDDichVuDiKem) as "Số lượng dịch vụ đi kèm", sum(hd.TienDatCoc)
from hopdong
left join nv on nv.IDNhanVien = hp.IDNhanVien
left join kh on kh.IDKhachHang = hp.IDKhachHang
left join dv on dv.IDDichVu = hp.IDDichVu
left join hdct on hdct.IDHopDong = hp.IDHopDong
left join dvdk on dvdk.IDDichVuDiKem = hdct.IDDichVuDiKem
where not exists(select hp.IDHopDong where hp.NgayLamHopDong between '2019-01-01' and '2019-06-31')
and exists(select hp.IDHopDong where hp.NgayLamHopDong between '2019-10-01' and '2019-12-31')
group by hp.IDHopDong;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
create temporary table temp
select dichvudikem.IDDichVuDiKem, TenDichVuDiKem, DonVi, Gia , count(hopdongchitiet.IDDichVuDiKem)
from dichvudikem
 left join hopdongchitiet on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
 group by hopdongchitiet.IDDichVuDiKem;
 select*from temp;
 
 -- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
 select hopdongchitiet.IDHopDong, dichvudikem.TenDichVuDiKem, count(dichvudikem.IDDichVuDiKem) as so_lan_su_dung
 from dichvudikem
	left join hopdongchitiet on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
 group by hopdongchitiet.IDDichVuDiKem
 having so_lan_su_dung = 1;
 
 -- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
 
 select nhanvien.IDNhanVien, hoten, trinhdo.trinhdo, bophan.TenBoPhan, SDT, DiaChi, count(IDHopDong) as so_hop_dong
 from nhanvien
	left join hopdong on hopdong.IDNhanVien = nhanvien.IDNhanVien
    inner join trinhdo on trinhdo.IDTrinhDo = nhanvien.IDTrinhDo
    inner join bophan on bophan.IDBoPhan = nhanvien.IDBoPhan
    where year(hopdong.NgayLamHopDong)>=2018 and year(hopdong.NgayLamHopDong)<=2018
    group by IDNhanVien
    having so_hop_dong <=3;
    
-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.;
delete from nhanvien
where IDNhanVien not in (
 select hopdong.IDNhanVien
 from hopdong
 where IDNhanVien is not null and (year(hopdong.NgayLamHopDong)>=2017 and year(hopdong.NgayLamHopDong)<=2019)
 group by hopdong.IDNhanVien);
 
 -- 17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
update khachhang , (select hopdong.IDKhachHang as id, sum(hopdong.TongTien) as tong_tien from hopdong
where year(hopdong.NgayLamHopDong) = 2019
group by hopdong.IDKhachHang
having TongTien >= 10000) as temp
set khachhang.IDKhachHang = (select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Diamond")
where khachhang.IDLoaiKhach = (select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach = "Platinium")
and temp.id = khachhang.IDKhachHang;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).
delete from hopdong
where year(hopdong.NgayLamHopDong)>2016;

-- 19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi
update dichvudikem , (select hopdongchitiet.IDDichVuDiKem as id, count(hopdongchitiet.IDDichVuDiKem) as so_lan from hopdongchitiet
group by hopdongchitiet.IDDichVuDiKem
having so_lan>10)as temp
set dichvudikem.Gia = dichvudikem.Gia*2
where temp.id = dichvudikem.IDDichVuDiKem;

-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select nhanvien.IDNhanVien as id, nhanvien.HoTen as HoTen, nhanvien.email as email, nhanvien.SDT as SDT, nhanvien.NgaySinh as ngay_sinh, nhanvien.DiaChi as dia_chi
from nhanvien
union all
select khachhang.IDKhachHang as id, khachhang.HoTen as HoTen, khachhang.email as email, khachhang.SDT as SDT, khachhang.NgaySinh as ngay_sinh, khachhang.DiaChi as dia_chi
from khachhang;