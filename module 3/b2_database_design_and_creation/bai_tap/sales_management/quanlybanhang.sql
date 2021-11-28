create database quanlybanhang;
use quanlybanhang;

create table PHIEUXUAT(
	SoPX int not null primary key,
	NgayXuat datetime
);

create table phieuxuat_vattu(
	DGXuat int,
    SLxuat int,
    SoPX int,
    MaVTU int,
    primary key(SoPX, MaVTU),
    foreign key (SoPX) references PHIEUXUAT(SoPX),
    foreign key (MaVTU) references VATTU(MaVTU)
);

create table VATTU(
	MaVTU int not null primary key,
    TenVTU varchar(50) not null
);

create table vattu_phieunhap(
	MaVTU int,
    SoPN int,
    DGNhap int,
    SLNhap int,
    primary key(MaVTU, SoPN),
    foreign key (MaVTU) references VATTU(MaVTU),
    foreign key (SoPN) references PHIEUNHAP(SoPN)
);

create table PHIEUNHAP(
	SoPN int not null primary key,
    NgayNhap datetime
);
create table vattu_dondh(
    MaVTU int,
    SoDH int,
    primary key(MaVTU, SoDH),
    foreign key (MaVTU) references VATTU(MaVTU),
    foreign key (SoDH) references DONDH(SoDH)
);
create table DONDH(
	SoDH int not null primary key,
	NgayDH datetime
);

create table NHACC(
	MaNCC int not null primary key,
	TenNCC varchar(50),
	DiaChi varchar(50),
    SDT int,
    SoDH int,
    foreign key (SoDH) references DONDH(SoDH)
);