create database bank;
create table employee( id int auto_increment primary key not null,name varchar(30),Bank_Branch varchar(30) references bank_branch(Location));
create table bank_branch(Location varchar(60),E_Mail varchar(60));
create table clients(cus_id int auto_increment primary key not null ,cus_name varchar(60),cus_acc double,cus_num int,loc varchar(60) references bank_branch(Location));
create table process(emp_name varchar(30) references employee(name),loc varchar(60) references bank_branchا(Location),timing varchar(50),process varchar(50));
insert into bank_branch(bank_branch.Location,bank_branch.E_Mail )values("Cairo","bank_cairo@eg.com"),("Alexandria","bank_alex@eg.com"),("Giza","bank_giza@eg.com");
insert into employee(employee.name,employee.Bank_Branch)values("Adel", "Cairo"),("Mayada","Giza"),("Salwa","Alexandria"),("Fadia","Cairo"),("Ahmed","Alexandria"),("kareem","Alexandria"),("fatma","Cairo"),("fady","Giza");
insert into clients(clients.cus_name,clients.cus_acc,clients.cus_num,clients.loc)values("Karim",85.450000,01212576148,"Alexandria"),("Emad",5000000,01032392337,"Cairo"),("Omran",450000,01789654978,"Alexandria"),("Harb",8,0126548952,"Giza"),("Mrawan",376,45646544,"Giza"),("Elshazly",5968754,0124543486,"Alexandria"),("Selman",5646546456,124856054,"Alexandria");
insert into process(process.emp_name,process.loc,process.timing,process.process)values("","","","");
select *from process;
select *from employee;
select *from bank_branch;
select*from clients;

