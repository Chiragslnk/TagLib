use app_two_db;
drop table if exists employee_details;
drop table if exists employee;
drop view if exists employee_view;
create table employee
(
employee_id char(10) primary key,
first_name char(25) not null,
last_name char(25) not null,
gender char(1) not null,
is_indian bool not null,
pan_number char(15) not null unique
);
create table employee_details
(
employee_id char(10) primary key,
address varchar(200) not null,
contact_number char(50) not null, 
foreign key (employee_id) references employee(employee_id)
);
create view employee_view
as select employee.employee_id,employee.first_name,employee.last_name, if(employee.gender='M',"Male","Female") as gender,if(employee.is_indian=1,"Yes","No") as is_indian,
employee.pan_number,employee_details.address, employee_details.contact_number from employee inner join employee_details on employee.employee_id=employee_details.employee_id order by first_name,last_name;
insert into employee values
('E001','Ramesh','Solanki','M',true,'27ABCDEFGH'),
('E002','Gopal','Jain','M',true,'02ABCDEFGH'),
('E003','Lalita','Joshi','F',false,'05ABCDEFGH'),
('E004','Ramesh','Sigh','F',true,'01ABCDEFGH4'),
('E005','Nanu','sharma','F',true,'01ABCDEFGH5'),
('E006','Giru','Gupta','F',true,'01ABCDEFGH6'),
('E007','Fizan','Khan','M',true,'01ABCDEFGH7'),
('E008','Atib','Gutti','M',true,'01ABCDEFGH8'),
('E009','lalit','Pawar','F',true,'01ABCDEFGH9'),
('E010','Tina 10','Gupta','F',true,'01ABCDEFGH10'),
('E011','Tina 11','Gupta','F',true,'01ABCDEFGH11'),
('E012','Tina 12','Gupta','F',true,'01ABCDEFGH12'),
('E013','Tina 13','Gupta','F',true,'01ABCDEFGH13'),
('E014','Tina 14','Gupta','F',true,'01ABCDEFGH14'),
('E015','Tina 15','Gupta','F',true,'01ABCDEFGH15'),
('E016','Tina 16','Gupta','F',true,'01ABCDEFGH16'),
('E017','Tina 17','Gupta','F',true,'01ABCDEFGH17'),
('E018','Tina 18','Gupta','F',true,'01ABCDEFGH18'),
('E019','Tina 19','Gupta','F',true,'01ABCDEFGH19'),
('E020','Tina 20','Gupta','F',true,'01ABCDEFGH20'),
('E021','Tina 21','Gupta','F',true,'01ABCDEFGH21');
insert into employee_details values
('E001','1Somewhere, Ujjain','1231454242'),
('E002','2Somewhere, Indore','1231454242'),
('E003','3Somewhere, Dewas','1231454242'),
('E004','4Somewhere, Indore','1231454242'),
('E005','5Somewhere, Indore','1231454242'),
('E006','6Somewhere, Indore','1231454242'),
('E007','7Somewhere, Indore','1231454242'),
('E008','8Somewhere, Indore','1231454242'),
('E009','9omewhere, Indore','1231454242'),
('E010','10Somewhere, Indore','1231454242'),
('E011','11Somewhere, Indore','1231454242'),
('E012','12Somewhere, Indore','1231454242'),
('E013','13Somewhere, Indore','1231454242'),
('E014','14Somewhere, Indore','1231454242'),
('E015','15Somewhere, Indore','1231454242'),
('E016','16Somewhere, Indore','1231454242'),
('E017','17Somewhere, Indore','1231454242'),
('E018','18Somewhere, Indore','1231454242'),
('E019','19Somewhere, Indore','1231454242'),
('E020','20Somewhere, Indore','1231454242'),
('E021','21Somewhere, Indore','1231454242');