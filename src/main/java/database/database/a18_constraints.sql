/*
# 데이터 무결성 제약조건의 개념
1. 데이터의 정확성과 일관성을 보장.
2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함
	1) student테이블세어 학년 데이터는 1,2,3,4, 중의 하나만 입력
	2) 모든 학번은 유일하게 처리.
	3) student테이블의 지도교수 번호는 professor 테이블의
		교수번호 중의 하나와 반드시 일치.
3. 데이터 무결성 제약조건의 장점
	1) 테이블 생성시 무결성 제약조건을 정의 가능
		- 생성후 제약조건 설정도 가능.
	2) 테이블에 대해 정의, 데이터 딕셔너리에 저장되므로
		응용프로그램에서 입력된 모든 데이터에 대해 동일하게 적용
	3) 제약조건을 활성화, 비활성화 할 수 있는 융통성이 있다.
4. 무결성 제약조건의 종류
	1) NOT NULL :열이 null을 포함할 수 없음..
	2) UNIQUE KEY : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열조함
		을 지정해야 한다. ex) 학번,주민번호, 사원번호를 중복되지 않아야 한다.
		ps) null은 입력이 가능하고, 여러가지 null은 중복이 가능..
	3) PRIMARY KEY : 해당 컬럼 값은 반드시 존재해야 하며 유일해야 한다.
		NOT null과 unique가 결합된 형태
		주로 테이블에서 식별해야할 컬럼 즉 key를 설정할 때, 사용된다.
		ex) emp테이블의 empno, dept테이블의 deptno
	4) FOREIGN KEY : 한 열과 참조된 테이블의 열간에 외래 키 관계를 설정하고 시행
		ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호이어야 한다.
	5) CHECK : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리.
		ex) student테이블의 학년을 1,2,3,4 만 데이터로 넣을 수 있다.
5. 설정 형식
	1) 컬럼명 데이터타입 CONSTRAINT 제약조건명 제약조건.
		제약조건명 : 테이블명_컬럼명_제약조건종류
	2) PRIMARY KEY 지정..
	ex) CREATE TABLE student(
		stuno number constraint student_stuno_pk primary key
		);
		제약조건 이름 : 테이블명_컬럼명_제약조건종류
			제약조건종류 : pk, ukm nn, fk 
			
	ps)SYS.ALL_CONSTRAINTS : db시스템에 있는 제약정보의 메타테이블.
*/
SELECT * 
FROM sys.all_constraints
WHERE table_name LIKE 'EMP%';
SELECT * 
FROM sys.all_constraints;

-- not null 
CREATE TABLE student01(
	name varchar2(30) CONSTRAINT student01_name_nn NOT null	 -- 열이 null을 포함할 수 없음
);
INSERT INTO student01 VALUES ('홍길동');
INSERT INTO student01 VALUES ('김길동');
INSERT INTO student01 VALUES (null);
SELECT * FROM student01;
-- org.jkiss.dbeaver.model.sql.DBSQLException: 
-- SQL Error [1400] [23000]: ORA-01400: cannot insert NULL into 
-- ("SCOTT"."STUDENT01"."NAME")
-- ex) student02 테이블에 학생번호와 이름, 국어 점수를 입력할 컬럼을 지정하되,
--		학생번호는 제약조건으로 not null을 설정하고, 데이터 입력을 통해서 확인하세요.
--	3조
DROP TABLE student02;
CREATE TABLE student02(
	stuno NUMBER(8) CONSTRAINT student02_stuno_nn NOT NULL,
	name varchar2(30),
	kor NUMBER
);
SELECT * FROM student02;
INSERT INTO student02 VALUES (12345678, '김이박', null);
INSERT INTO student02 VALUES (12345678, NULL , null);
INSERT INTO student02 VALUES (null, '김이박', null);
-- cannot insert NULL into ("SCOTT"."STUDENT02"."STUNO")
-- unique : 다른 데이터와 식별되게 입력, 동일한 데이터 입력시 에러 발생..
CREATE TABLE student03(
	sno number(5) CONSTRAINT student03_sno_uq UNIQUE
);
INSERT INTO student03 values(1);
INSERT INTO student03 values(2);
INSERT INTO student03 values(null);
INSERT INTO student03 values(3);
INSERT INTO student03 values(null);
INSERT INTO student03 values(1);
-- SQL Error [1] [23000]: ORA-00001: 
--unique constraint (SCOTT.STUDENT03_SNO_UQ) violated
-- unique 제약조건은 null은 2중이상으로 입력이 가능하지만, 동일한 데이터는 입력을 할
--	수 없게 처리하였다..
SELECT * FROM student03;
-- ex) employee04 에 사원번호, 사원명, 급여를 설정하고,
--		사원번호는 unique, 사원명은 not null로 하여 제약조건을 설정하고, 데이터 입력을
--		통해 확인하세요.. 4조
DROP TABLE employee04;
CREATE TABLE employee04(
	empno number(4) CONSTRAINT employee04_empno_uq UNIQUE,
	ename varchar(20) CONSTRAINT employee04_ename_nn NOT NULL, 
	sal NUMBER(5));
INSERT INTO employee04 values(1,'홍길동',2000);
INSERT INTO employee04 values(2,'홍길동',2000);
INSERT INTO employee04 values(3,'박길동',2000);
INSERT INTO employee04 values(3,'김길동',3000); -- unqiue 에러발생
INSERT INTO employee04 values(4,'null',4000);  -- NULL 에러 발생
SELECT * from employee04;
-- 일반적으로 테이블의 각 행단위 식별할 수 있는 식별자 보통 key로 사용하는 컬럼이 존재한다.
-- 키로 사용되는 컬럼은 유일해야되고, null을 입력하지 않아야 하는 위에 선언한 두가지 
-- 제약조건이 다 필요하다.
-- 이 떄, 사용하는 제약조건이 primary key로 설정하는 것이 있다.
SELECT * FROM EMP;
SELECT * FROM dept;
CREATE TABLE employee05(
	empno NUMBER(4) PRIMARY KEY -- 제약조건의 이름이 지정이 안된다.
);
CREATE TABLE employee06(
	empno NUMBER(4) CONSTRAINT  employee06_empno_pk PRIMARY KEY -- 제약조건의 이름이 지정
);
INSERT INTO employee06 VALUES(1000);
INSERT INTO employee06 VALUES(1001);
INSERT INTO employee06 VALUES(1002);
INSERT INTO employee06 VALUES(null);
-- org.jkiss.dbeaver.model.sql.DBSQLException: SQL Error [1400] [23000]: ORA-01400: 
-- cannot insert NULL into ("SCOTT"."EMPLOYEE06"."EMPNO")
INSERT INTO employee06 VALUES(1001);
-- org.jkiss.dbeaver.model.sql.DBSQLException: SQL Error [1] [23000]: ORA-00001: 
-- unique constraint (SCOTT.EMPLOYEE06_EMPNO_PK) violated
-- ex) student04 학번(primary key), 이름(not null), 국어, 영어, 수학 점수로 테이블을
--	구성하고 데이터입력을 통해서 확인하세요. 5조
DROP TABLE student04;
CREATE TABLE student04(
	stuno number(8) CONSTRAINT student04_stuno_pk PRIMARY KEY,
	name varchar2(20) CONSTRAINT student04_name_nn NOT NULL,
	kor NUMBER,
	eng NUMBER,
	math NUMBER
);
INSERT INTO student04 values(12345678,'홍길동',80,90,100);
INSERT INTO student04 values(12345678,'김길동',80,90,100);
-- org.jkiss.dbeaver.model.sql.DBSQLException: SQL Error [1] [23000]: ORA-00001: 
-- unique constraint (SCOTT.STUDENT04_STUNO_PK) violated
INSERT INTO student04 values(12345679,null,80,90,100);
--  SQL Error [1400] [23000]: ORA-01400: cannot insert NULL into ("SCOTT"."STUDENT04"."NAME")
INSERT INTO student04 values(null,'영길동',80,90,100);
-- SQL Error [1400] [23000]: ORA-01400: cannot insert NULL into ("SCOTT"."STUDENT04"."STUNO")
