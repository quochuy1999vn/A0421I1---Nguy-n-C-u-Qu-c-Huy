create database furama_resort_manager;
use furama_resort_manager;

create table NhanVien(
	IDNhanVien int not null primary key,
    hoten varchar(45),
    IDVitri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh date,
    SoCMND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    EMAIL varchar(45),
    DiaChi varchar(45),
    foreign key(IDViTri) references ViTri(IDViTri),
    foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
    foreign key(IDBoPhan) references BoPhan(IDBoPhan)
);

create table ViTri(
	IDViTri int not null primary key,
    TenViTri varchar(45)
);

create table TrinhDo(
	IDTrinhDo int not null primary key,
    TrinhDo varchar(45)
);

create table BoPhan(
	IDBoPhan int not null primary key,
    TenBoPhan varchar(45)
);

create table HopDong(
	IDHopDong int not null primary key,
    IDNhanVIen int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    foreign key(IDKhachHang) references KhachHang(IDKhachHang),
    foreign key(IDDichVu) references DichVu(IDDichVu),
    foreign key(IDNhanVIen) references NhanVIen(IDNhanVIen)
);

create table HopDongChiTiet(
	IDHopDongChiTiet int not null primary key,
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    foreign key(IDHopDong) references HopDong(IDHopDong),
    foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);

create table DichVuDiKem(
	IDDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);

create table DichVu (
	IDDichVu int not null primary key,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
    IDKieuThue int,
    IDLoaiDichVu int,
    TrangThai varchar(45),
    foreign key(IDKieuThue) references KieuThue(IDKieuThue),
    foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);

create table KieuThue (
	IDKieuThue int not null primary key,
    TenKieuThue varchar(45),
    Gia int
);

create table LoaiDichVu (
	IDLoaiDichVu int not null primary key,
    TenLoaiDichVu varchar(45)
);

create table KhachHang (
	IDKhachHang int not null primary key,
    IDLoaiKhachHang int,
    HoTen varchar(45),
    NgaySinh date,
    SoCMND varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key(IDLoaiKhachHang) references LoaiKhach(IDLoaiKhach)
);

create table LoaiKhach (
	IDLoaiKhach int not null primary key,
    TenLoaiKhach varchar(45)
);