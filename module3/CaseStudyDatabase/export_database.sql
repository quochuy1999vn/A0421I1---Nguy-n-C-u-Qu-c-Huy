use furama_resort_manager;

-- task 2
select hoten from NhanVien
where hoten like 'T%' or hoten like 'H%' or hoten like 'K%' and (length(hoten) >= 15);

-- task 3
select*
from KhachHang
where   ((year(curdate())-year(NgaySinh)) >=18) 
and ((year(curdate())-year(NgaySinh))<= 50) 
and (DiaChi="Đà nẵng" or DiaChi="Quảng trị");

-- task 4
select loaikhach.IDLoaiKhach, khachhang.IDKhachHang, khachhang.hoten, count(hopdong.IDKhachHang) 'count'
from khachhang 
	join hopdong  on khachhang.IDKhachHang = hopdong.IDKhachHang
    join loaikhach on khachhang.IDLoaiKhachHang = loaikhach.IDLoaiKhach
    where loaikhach.TenLoaiKhach = 'Diamond'
    group by hopdong.IDKhachHang
    order by count ;

-- task 5
select hopdong.IDKhachHang, khachhang.HoTen, loaikhach.TenLoaiKhach, hopdong.IDHopDong, dichvu.TenDichVu, NgayLamHopDong, NgayKetThuc, sum(ChiPhiThue + (SoLuong*Gia))  'Tổng Tiền' 
from khachhang
left join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
left join dichvu on dichvu.IDDichVu = hopdong.IDDichVu
left join loaikhach on khachhang.IDLoaiKhachHang = loaikhach.IDLoaiKhach
left join HopDongChiTiet on hopdong.IDHopDong = HopDongChiTiet.IDHopDong
right join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
group by IDKhachHang;

-- task 6
select IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu
from dichvu 
left join loaidichvu on  loaidichvu.IDLoaiDichVu = dichvu.IDLoaiDichVu
where dichvu.IDDichVu not in(
	select IDDichVu
    from hopdong
    where IDDichVu is not null and month(hopdong.NgayLamHopDong) >= 1 and month(hopdong.NgayLamHopDong) <= 3
);

-- task 7
select 



