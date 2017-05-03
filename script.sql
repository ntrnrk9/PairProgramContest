create database consult;
use consult;
create table pets( id int,name varchar(50),type int, Primary Key(id),foreign key(type) references animals(id));
create table animals(id int not null,type varchar(50),primary key(id));

insert into animals values (401,'dog');
insert into animals values (402,'bird');
insert into pets values(101,'spooky',401);
insert into pets values(102,'bolt',401);
insert into pets values(103,'messy',401);