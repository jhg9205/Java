create table tb_vocabulary(
	vo_idx bigint auto_increment primary key,
    vo_eng varchar(100) not null,
    vo_kor varchar(50) not null,
    vo_level int not null,
    vo_regdate datetime default now()
);
select * from tb_vocabulary;