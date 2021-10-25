use quanlysinhvien;

-- Hiển thị danh sách tất cả các học viên
select * from student;
-- Hiển thị danh sách các học viên đang theo học.
select * from student
where `Status` = true;
-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select * from `subject`
where Credit <= 10;
-- Hiển thị danh sách học viên lớp A1
select S.studentId, S.studentName, C.className
from student S join class C on S.classId = C.classId
where C.ClassName = 'A1';
-- Hiển thị điểm môn CF của các học viên.
select S.studentId, S.studentName, Sub.subName, M.mark
from student S join mark M on S.StudentId = M.StudentId join subject Sub on M.SubId = Sub.SubId
where SubName = 'CF';