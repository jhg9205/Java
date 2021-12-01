create table tb_class(
mem_no bigint auto_increment primary key, mem_num varchar(20) unique not null, mem_name varchar(20) not null, mem_email varchar(20), mem_regist datetime default now());
select * from tb_class;
insert into tb_class (mem_num, mem_name, mem_email) values ( '14717044', '정승훈', 'jhg9205@nate.com');
insert into tb_class (mem_num, mem_name, mem_email) values ( '17156576', '김혁', 'jhg9205@nate.com');
insert into tb_class (mem_num, mem_name, mem_email) values ( '15730145', '이서영', 'jhg9205@nate.com');
insert into tb_class (mem_num, mem_name, mem_email) values ( '14717036', '박성욱', 'jhg9205@nate.com');
delete from tb_class where mem_no = 7;
alter table tb_class add mem_point int default 0;
update tb_class set mem_point = mem_point + 30 where mem_no = 1;
update tb_class set mem_point = mem_point + 100;
delete from tb_class where mem_no = 2; 
select mem_no, mem_num, mem_name from tb_class where mem_no > 2 order by mem_num;
use tb_class;