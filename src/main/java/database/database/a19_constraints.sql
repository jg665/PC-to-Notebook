/*
# check
특정한 데이터를 조건이나 범위를 지정해서, 해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
2. 형식
	 컬럼명 데이터유형 constraint 제약명 check (조건문-where에 들어가는 sql문장) 
	 컬럼명 데이터유형 check (조건문-where에 들어가는 sql문장) 
 */
CREATE TABLE student05(
	gender varchar2(1) check( gender IN ('F','M'))
);
INSERT INTO student05 values('F');
INSERT INTO student05 values('M');
INSERT INTO student05 values('K');
-- org.jkiss.dbeaver.model.sql.DBSQLException: 
-- SQL Error [2290] [23000]: ORA-02290: check constraint (SCOTT.SYS_C007031) violated
INSERT INTO student05 values(null);
INSERT INTO student05 values('M');
SELECT * FROM student05;
-- studnet07 테이블만들고, 이름, 학년(1~4년 제약조건), 국어(1~100 제약조건설정)
DROP TABLE student07;
CREATE TABLE student07 (
	sname varchar(10),
	sgrade NUMBER(1) CONSTRAINT student07_grade_ck CHECK(sgrade BETWEEN 1 AND 4),
	kor	NUMBER(3) CHECK(kor BETWEEN 1 AND 100)
);
SELECT * FROM student07;
INSERT INTO student07 VALUES ('홍길동',1,100);
INSERT INTO student07 VALUES ('김길동',2,100);
INSERT INTO student07 VALUES ('일길동',3,1);
INSERT INTO student07 VALUES ('손길동',5,100);
-- 데이터유형은 ''(문자열입력시), 25(숫자입력시)
-- org.jkiss.dbeaver.model.sql.DBSQLException: SQL Error [2290] [23000]: ORA-02290: 
-- check constraint (SCOTT.SYS_C007036) violated
INSERT INTO student07 VALUES ('손길동',3,null);
INSERT INTO student07 VALUES ('손길동',3,101);
-- org.jkiss.dbeaver.model.sql.DBSQLException: SQL Error [2290] [23000]: ORA-02290:
-- check constraint (SCOTT.SYS_C007035) violated
/*
# 왜래 키 설정 관계(foreign key)
1. 연관관계에 있는 두 테이블에 대하여, 한쪽 테이블에 있는 데이터 기준으로 다른쪽 테이블의
데이터를 입력할 수 있게 하는 것을 말한다.
2. 기본 형식
	컬럼명 데이터유형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)
*/
-- 교수테이블 생성..
CREATE table teacher01(
	tno NUMBER PRIMARY KEY
);
INSERT INTO teacher01 values(10);
INSERT INTO teacher01 values(11);
INSERT INTO teacher01 values(12);
SELECT * FROM teacher01;
SELECT * FROM student08;
CREATE table student08(
	name varchar2(50),
	tno NUMBER constraint student08_tno_fk REFERENCES teacher01(tno)
);
INSERT INTO student08 values('홍길동',10);
INSERT INTO student08 values('신길동',11);
INSERT INTO student08 values('마길동',13); --13번 테이블이 없어서 에러
-- integrity constraint (SCOTT.STUDENT08_TNO_FK) violated - parent key not found
INSERT INTO student08 values('오길동',12);
-- ex) 물건테이블(물건번호, 물건명, 가격, 재고량)
--	   구매테이블(구매번호, 구매수량, 물건번호-외래키설정) [1조]
DROP table product;
DROP table purchase;

CREATE TABLE product(
	pno NUMBER PRIMARY key ,
	pname varchar2(20) ,
	price number(6) ,
	rcnt NUMBER(6) -- 재고량과 구매수량을 컬럼명을 구분해서 설정을 할 수 있도록 한다.
);
INSERT INTO product VALUES(1,'사과',1500,10);
INSERT INTO product VALUES(2,'오렌지',2500,50);
INSERT INTO product VALUES(3,'자몽',5000,20);
SELECT * FROM product;

CREATE TABLE pbuy (
	bno NUMBER,
	bcnt NUMBER(10),
	pno NUMBER CONSTRAINT pbuy_pno_fk REFERENCES product(pno)
);
INSERT INTO pbuy values(10,2,1);
INSERT INTO pbuy values(20,4,2);
INSERT INTO pbuy values(30,1,4); -- 에러 발생 // 4번물건번호 존재X
SELECT * FROM product;
SELECT * FROM pbuy;
-- 구매한 물건정보 
SELECT pname, price "판매가격", bcnt "구매갯수", price*bcnt "총계", rcnt-bcnt "현재고량"
FROM product p, pbuy b 
WHERE p.pno = b.pno;