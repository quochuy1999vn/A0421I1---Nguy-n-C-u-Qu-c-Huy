create database `student-management`
use `student-management`;
create table Class(
id int,
`name` nvarchar(50)
);

create table Teacher(
id int,
`name` nvarchar(50),
age int,
country nvarchar(50)
);

select * from `student-management`.teacher;