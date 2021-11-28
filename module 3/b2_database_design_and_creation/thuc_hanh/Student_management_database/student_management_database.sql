create database QuanLySinhVien;
use QuanLySinhVien;

create table class(
ClassID int not null auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
`Status` bit
);

create table Student(
StudentId int not null auto_increment primary key,
StudentName varchar(30) not null,
Address     VARCHAR(50),
Phone       VARCHAR(20),
`Status`     BIT,
ClassId     INT         NOT NULL,
FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);

CREATE TABLE Subject
(
SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
SubName VARCHAR(30) NOT NULL,
Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
`Status`  BIT                  DEFAULT 1
);

CREATE TABLE Mark
(
MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
SubId     INT NOT NULL,
StudentId INT NOT NULL,
Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
ExamTimes TINYINT DEFAULT 1,
UNIQUE (SubId, StudentId),
FOREIGN KEY (SubId) REFERENCES Subject (SubId),
FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);