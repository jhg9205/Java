create table tb_student(
	st_idx int auto_increment primary key,
    st_num int unique not null,
    st_name varchar(20) not null,
    st_hp varchar(20) not null,
    st_mail varchar(20),
    st_address varchar(20),
    st_regdate datetime default now(),
    foreign key(st_num) references tb_grades (gr_num)
);
create table tb_grades(
	gr_num int primary key,
    gr_java int,
    gr_python int,
    gr_c int
);
select * from tb_student;
select * from tb_grades;