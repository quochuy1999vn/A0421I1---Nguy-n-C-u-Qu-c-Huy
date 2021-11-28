use quanlyorrder;

insert into customer (cID, cName, cAge)
value (1, 'Minh Quan', 10),
	(2, 'Ngoc Oanh', 20),
	(3, 'Hong Ha', 50);

insert into `order` (oID, cID, oDate, oTotalPrice)
value (1, 1, 3/21/2006, null),
	(2, 2, 3/23/2006, null),
	(3, 1, 3/16/2006, null);
    
insert into product (pID, pName, cPrice)
value (1, 'May Giat', 3),
	(2, 'Tu Lanh', 5),
	(3, 'Dieu Hoa', 7),
	(4, 'Quat', 1),
	(5, 'Bep Dien', 2);
    
alter table orderdetail
add odQTY int;
insert into orderdetail (oID, pID, odQTY)
value (1, 1, 3),
	(1, 3, 7),
	(1, 4, 2),
	(2, 1, 1),
	(3, 1, 8),
	(2, 5, 4),
	(2, 3, 3);
    
    
-- Hiển thị các thông tin  gồm oID, oDate, 
-- oPrice của tất cả các hóa đơn trong bảng Order
select * from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cName, p.pName from customer as c  
join `order` as o on c.cID = o.oID 
join product as p on o.oID = p.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.cName from customer as c 
left join `order` as o on c.cID = o.oID 
where o.cID is null;