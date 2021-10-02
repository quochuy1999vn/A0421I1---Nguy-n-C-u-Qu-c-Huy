create database quanlyOrrder;
use quanlyOrrder;

create table Customer(
	cID int not null primary key,
    cName varchar(50),
    cAge int
);

create table `Order`(
	oID int not null primary key,
    cID int,
    oDate datetime,
    oTotalPrice int,
    foreign key (cID) references Customer(cID)
);

create table Product(
	pID int not null primary key,
    pName varchar(50),
    cPrice int
);

create table OrderDetail(
	oID int,
    pID int,
    primary key(oID, pID),
    foreign key (oID) references `Order`(oID),
    foreign key (pID) references Product(pID)
);