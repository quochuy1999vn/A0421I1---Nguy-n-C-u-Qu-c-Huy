create database casestudy_jsp_and_servlet;
use casestudy_jsp_and_servlet;

insert into customer_type
value
(1, 'Normal'),
(2, 'Silver'),
(3, 'Gold'),
(4, 'Platinum'),
(5, 'Diamond');

insert into customer
values
(1,	'KH-1001','Nguyễn Quốc Huy','1989-02-12','1',	'234345345'	,'090543454','nguyenhuy@gmail.com','Hai Phong',2),
(2,	'KH-1002',	'Nguyễn Vũ',	'1991-12-01',	'1',	'223445398',	'095643457'	,'nguyenvu@gmail.com'	,'Quảng Bình',	3),
(3,	'KH-1003',	'Lê Nhân',	'1990-02-11',	'1',	'342345456',	'0906456756'	,'nhan@gmail.com'	,'Hai Dương'	,1),
(4,	'KH-1004',	'Đoàn Thịnh',	'1978-02-05',	'1'	,'234345665'	,'0935678767'	,'thinh@gmail.com',	'Đà Nẵng',	4),
(5,	'KH-1005',	'Tô Nhi',	'1995-02-12','2',	'323454345',	'090542546'	,'tonhi@gmail.com'	,'Hà Nội',	5),
(6,'KH-1006',	'Tran Thị Trân',	'2000-07-22','2','24211211894'	,'0965184565',	'tran@gmail.com'	,'Da Nang',	1);

select * from customer;