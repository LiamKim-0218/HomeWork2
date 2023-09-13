package c230913;

public class OracleSqlDeveloper {

/*
    
C:\Users\KGA>sqlplus

사용자명 입력: java
비밀번호 입력:
마지막 성공한 로그인 시간: 화 9월  12 2023 13:40:45 +09:00

다음에 접속됨:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0

SQL> exit
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0에서 분리되었습니다.

C:\Users\KGA>sqlplus

SQL*Plus: Release 21.0.0.0.0 - Production on 수 9월 13 10:08:08 2023
Version 21.3.0.0.0

Copyright (c) 1982, 2021, Oracle.  All rights reserved.

사용자명 입력: java
비밀번호 입력:
마지막 성공한 로그인 시간: 수 9월  13 2023 10:07:49 +09:00

다음에 접속됨:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0

SQL> create table test(
  2  id number(10,0),
  3  name varchar2(10),
  4  score number(10,5)
  5  );

테이블이 생성되었습니다.

SQL> insert into test (id) values (1);

1 개의 행이 만들어졌습니다.

SQL> select id from test;

        ID
----------
         1

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         1

SQL> commit;

커밋이 완료되었습니다.

SQL> update test set name= '강아지',score=90 where id = 1;

1 행이 업데이트되었습니다.

SQL> commit;

커밋이 완료되었습니다.

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         1 강아지                       90

Oracle SQL DEVELOPER에서도 수정할수있다.
밑에는 SQL DEVELOPER에서 수정하고 cmd에 추가된 내용

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         2 고양이                       95
         1 강아지                       90

SQL> delete from test where id = 1;

1 행이 삭제되었습니다.

SQL> commit;

커밋이 완료되었습니다.

SQL> select * from test;

        ID NAME                      SCORE
---------- -------------------- ----------
         2 고양이                       95

SQL>  create table test2(
  2   id number(10,0) CONSTRAINT pk_id PRIMARY KEY,
  3   name varchar2(10) NOT NULL,
  4   score number(10,5) DEFAULT 0,
  5   address varchar2(20)
  6   );

테이블이 생성되었습니다.

SQL> insert into test2 values(1, '강아지', 78, '서울시 강서구');

1 개의 행이 만들어졌습니다.

SQL> commit;

커밋이 완료되었습니다.

SQL> select * from test2;

        ID NAME                      SCORE
---------- -------------------- ----------
ADDRESS
----------------------------------------
         1 강아지                       78
서울시 강서구



SQL> insert into test2 values(4, '고양이', 27, '근방');

1 개의 행이 만들어졌습니다.

SQL> commit;

커밋이 완료되었습니다.

SQL> exit
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0에서 분리되었습니다.



C:\Users\KGA>sqlplus

SQL*Plus: Release 21.0.0.0.0 - Production on 수 9월 13 12:04:04 2023
Version 21.3.0.0.0

Copyright (c) 1982, 2021, Oracle.  All rights reserved.

사용자명 입력: java
비밀번호 입력:
마지막 성공한 로그인 시간: 수 9월  13 2023 11:30:47 +09:00

다음에 접속됨:
Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0


SQL> create table student(
  2  student_id number(8,0) constraint pk_student_id PRIMARY KEY,
  3  name varchar2(10),
  4  nickname varchar2(10),
  5  password varchar2(10),
  6  age number(2),
  7  git_address varchar2(100)
  8  );

테이블이 생성되었습니다.

SQL> drop table student;

테이블이 삭제되었습니다.

SQL> create table student(
  2  student_id number(8,0) constraint pk_student_id PRIMARY KEY,
  3  name varchar2(10),
  4  nickname varchar2(10),
  5  password varchar2(10),
  6  age number(2),
  7  git_address varchar2(100)
  8  );

테이블이 생성되었습니다.

SQL> insert into student values(1,'김동선','KDS','qwer',29,'https://github.com/KDS01');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(2,'이민규','qq752','1234',23,'https://github.com/LEEMINGYU28/Java4.git');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(3, '권원준', 'oooonx', 'may', 22,'https://github.com/KWWWJ/just1.git');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(4, '박정완', 'pjw', 'qwer', 27, 'https://github.com/pjw222');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(5,'한상윤','hsy','qwer1234',37,'https://github.com/Natseol');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(6,'임현규','TLM','486',27,'https://github.com/mabiTLM/Java4');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(7,'김남균','knk','1234',27,'https://github.com/LiamKim-0218/HomeWork2');

1 개의 행이 만들어졌습니다.

SQL> insert into student values(8,'임주한','LJH','3232',32,'https://github.com/Juhan008/java-D');

1 개의 행이 만들어졌습니다.

SQL> commit;

커밋이 완료되었습니다.

SQL> select * from student where name like '김%';

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------




SQL> select * from student order by age asc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         4 박정완               pjw                  qwer
        27
https://github.com/pjw222

         7 김남균               knk                  1234
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/LiamKim-0218/HomeWork2

         6 임현규               TLM                  486
        27
https://github.com/mabiTLM/Java4

         1 김동선               KDS                  qwer

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        29
https://github.com/KDS01

         8 임주한               LJH                  3232
        32
https://github.com/Juhan008/java-D


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol


8 행이 선택되었습니다.



SQL> select * from student order by age desc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol

         8 임주한               LJH                  3232
        32
https://github.com/Juhan008/java-D

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         4 박정완               pjw                  qwer
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

         6 임현규               TLM                  486

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        27
https://github.com/mabiTLM/Java4

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git


8 행이 선택되었습니다.



SQL> select * from student order by name asc;

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         3 권원준               oooonx               may
        22
https://github.com/KWWWJ/just1.git

         7 김남균               knk                  1234
        27
https://github.com/LiamKim-0218/HomeWork2

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------

         1 김동선               KDS                  qwer
        29
https://github.com/KDS01

         4 박정완               pjw                  qwer
        27

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
https://github.com/pjw222

         2 이민규               qq752                1234
        23
https://github.com/LEEMINGYU28/Java4.git

         8 임주한               LJH                  3232

STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
        32
https://github.com/Juhan008/java-D

         6 임현규               TLM                  486
        27
https://github.com/mabiTLM/Java4


STUDENT_ID NAME                 NICKNAME             PASSWORD
---------- -------------------- -------------------- --------------------
       AGE
----------
GIT_ADDRESS
--------------------------------------------------------------------------------
         5 한상윤               hsy                  qwer1234
        37
https://github.com/Natseol


8 행이 선택되었습니다.



SQL> create table hobby(
  2  hobby_id number(2,0) constraint pk_hobby_id PRIMARY KEY,
  3  hobby_name varchar2(20),
  4  hobby_explain varchar2(200),
  5  created_at timestamp default to_char(sysdate,'yyyy/mm/dd hh:mi:ss'),
  6  average_time  varchar2(12),
  7  location varchar2(100)
  8  );

테이블이 생성되었습니다.

SQL> insert into hobby (hobby_id, hobby_name, hobby_explain,average_time,location) values(1,'헬스','유산소와 웨이트 트레이닝을 기구를 활용하여 시간을 보낼 수 있는 곳','2시간','천호');

1 개의 행이 만들어졌습니다.

SQL> commit;

커밋이 완료되었습니다.
*/
   
    
}
