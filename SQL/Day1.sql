-- 데이터베이스 확인
show databases;
-- 데이터베이스 생성
create database aiclass;
-- 데이터베이스 삭제
drop database aiclass;
-- 데이터베이스 사용
use aiclass;
-- 테이블 생성
create table tb_member (
mem_idx bigint auto_increment primary key,
mem_userid varchar(20) unique not null,
mem_userpw varchar(20) not null,
mem_name varchar(20) not null,
mem_hp varchar(20) not null,
mem_email varchar(100) not null,
mem_hobby varchar(100),
mem_ssn1 varchar(6) not null,
mem_ssn2 varchar(7) not null,
mem_zipcode varchar(5),
mem_address1 varchar(100),
mem_address2 varchar(100),
mem_address3 varchar(100),
mem_regist datetime default now()
);
-- 테이블 구조 확인
desc tb_member;
-- 테이블 삭제
drop table tb_member;
-- 테이블 컬럼 추가
alter table tb_member add mem_point int default 0;
-- 테이블 컬럼 수정
alter table tb_member modify column mem_point double default 0;
-- 테이블 컬럼 삭제
alter table tb_member drop mem_point;
-- 테이블 자료 확인
select * from tb_member;
-- 데이터 삽입
insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('apple', '1111', '김사과', '010-1111-1111', 'apple@naver.com', '드라이브', '001011', '4068518', '12345',
'서울 서초구 양재동', '11-11', '11111');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email, mem_ssn1, mem_ssn2)
values ('banana', '2222', '반하나', '010-2222-2222', 'banana@naver.com', '951220', '1692815');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('orange', '3333', '오렌지', '010-3333-3333', 'orange@naver.com', '골프', '546987', '4068518', '12345',
'서울 서초구 반포동', '33-33', '33333');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('melon', '4444', '이메론', '010-4444-4444', 'melon@naver.com', '음식', '546987', '4068518', '12345',
'서울 강남구 강남동', '44-44', '44444');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('berry', '5555', '배애리', '010-5555-5555', 'berry@naver.com', '잠자기', '546987', '4068518', '12345',
'용인시 처인구 역북동', '55-55', '55555');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('grape', '6666', '박포도', '010-6666-6666', 'grape@naver.com', '여행', '546987', '4068518', '45825',
'수원시 권선구 권선동', '66-66', '66666');

insert into tb_member (mem_userid, mem_userpw, mem_name, mem_hp, mem_email,
mem_hobby, mem_ssn1, mem_ssn2, mem_zipcode, mem_address1, mem_address2, mem_address3)
values ('avocado', '7777', '안가도', '010-7777-7777', 'avocado@naver.com', '채집', '546987', '4068518', '12345',
'서울 서초구 반포동', '33-33', '33333');
select * from tb_member;
-- 모든 데이터 수정
update tb_member set mem_point = 500;
update tb_member set mem_point = mem_point + 200 where mem_idx = 1;
update tb_member set mem_point = mem_point + 300 where mem_idx = 2;
update tb_member set mem_point = mem_point - 200 where mem_idx = 4;
update tb_member set mem_point = mem_point + 500 where mem_idx = 5;
update tb_member set mem_point = mem_point + 100 where mem_idx = 6;
-- 모든 사용자에게 100포인트 추가
update tb_member set mem_point = mem_point + 100;
-- 데이터 삭제
delete from tb_member where mem_idx = 7;

-- 데이터 검색
select mem_idx, mem_userid from tb_member;
select mem_idx, mem_name, mem_userid from tb_member where mem_idx = 3;
-- 로그인 쿼리
select mem_idx from tb_member where mem_userid = 'apple' and mem_userpw = '1111';
select mem_idx, mem_name, mem_userid, mem_point from tb_member order by mem_point desc;
update tb_member set mem_point = mem_point + 100 where mem_idx = 1;
select * from tb_member;
select mem_idx, mem_name, mem_userid, mem_point from tb_member order by mem_point desc, mem_idx desc;
-- 문제
-- tb_member 테이블에서 mem_point가 500 이상인 회원을 가입순(mem_idx)으로 내림차순 출력
select mem_idx, mem_name, mem_userid, mem_point from tb_member where mem_point >= 500 order by mem_idx desc;
alter table tb_member add mem_gender enum('남자', '여자');
select mem_gender, count(mem_idx) from tb_member group by mem_gender;
select mem_gender, sum(mem_point) from tb_member group by mem_gender;
-- 별명 생성
select mem_gender, count(mem_idx) as tot from tb_member group by mem_gender;
