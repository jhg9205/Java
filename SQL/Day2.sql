create table tb_profile (
    pro_idx bigint,
    pro_age int,
    pro_height int,
    pro_weight double,
    pro_mbti varchar(20),
    foreign key(pro_idx) references tb_member(mem_idx)
);
use aiclass;
select * from tb_profile;
select * from tb_member;
desc tb_profile;

-- 취미가 null인 데이터 검색
select mem_idx, mem_userid, mem_name, mem_hobby from tb_member where mem_hobby = 'null'; -- x
select mem_idx, mem_userid, mem_name, mem_hobby from tb_member where mem_hobby = null; -- x
select mem_idx, mem_userid, mem_name, mem_hobby from tb_member where mem_hobby is null;
select mem_idx, mem_userid, mem_name, mem_hobby from tb_member where mem_hobby is not null;

-- 포인트가 500이상 1000이하를 검색
select mem_idx, mem_userid, mem_name, mem_point from tb_member where mem_point >= 500 and mem_point <= 1000;
select mem_idx, mem_userid, mem_name, mem_point from tb_member where mem_point between 500 and 1000;

-- 김사과, 오렌지, 배애리의 정보를 검색
select mem_idx, mem_userid, mem_name, mem_hp from tb_member where mem_name='김사과'or mem_name = '오렌지' or mem_name = '배애리';
select mem_idx, mem_userid, mem_name, mem_hp from tb_member where mem_name in('김사과', '오렌지', '배애리');

-- 프로필 테이블 데이터 삽입
insert into tb_profile values(1, 20, 160, 50, 'estj');
insert into tb_profile values(2, 23, 162, 55, 'infp');
insert into tb_profile values(4, 27, 170, 70, 'enfp');
-- insert into tb_profile values(8, 24, 165, 75, 'infj'); -- 외래키 제약조건 때문에 삽입이 불가능

-- inner join
select mem_idx, mem_userid, mem_name, mem_hp, mem_gender, pro_age, pro_mbti
from tb_member inner join tb_profile on tb_member.mem_idx = tb_profile.pro_idx;

-- left join
select mem_idx, mem_userid, mem_name, mem_hp, mem_gender, pro_age, pro_mbti
from tb_member left join tb_profile on tb_member.mem_idx = tb_profile.pro_idx;

-- right join
select mem_idx, mem_userid, mem_name, mem_hp, mem_gender, pro_age, pro_mbti
from tb_member right join tb_profile on tb_member.mem_idx = tb_profile.pro_idx;

select mem_idx, mem_userid, mem_name, mem_hp from tb_member;

select mem_idx, mem_userid, mem_name, mem_hp from tb_member where mem_userid like '%a%';