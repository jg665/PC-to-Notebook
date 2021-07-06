/*1. 무결성 제약 조건 5가지의 기본개념과 형식을 기술하세요.
	 1)not null : 열이 null을 포함할 수 없음
	 2)unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열조합
	 		을 지정해야 함 ex) 학번, 주민번호, 사원번호를 중복되지 않게 함
	 3)primary key : 해당 컬럼 값은 반드시 존재해야 하며 유일해야 한다.
	 		not null과 nuique가 결합된 형태
	 4)foreign key: 한 열과 참도죈 테이블의 열간에 외래 키 관계를 설정하고 시행
	 		ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호
	 5)check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리.
	 		ex) student테이블의 학년을 1,2,3,4 만 데이터로 넣을 수 있다.


2. 학생테이블과 학과정보테이블을 활용해 위 무결성 제약 조건을 설정해보세요.
    학생테이블(학생번호,이름,학년,주민번호,학과정보번호)
		학생번호 : primary key
		이름	: not null
		학년 : check
		주민번호 : unique
		학과정보번호 : foreign key
    학과정보테이블(학과정보번호,학과명,학과위치)
		학과정보번호 : primary key
*/	-- 학과 정보테이블
	CREATE table department (
		dno NUMBER PRIMARY KEY,
		dname varchar2(50),
		loc varchar2(100)
	);
	-- 학생테이블
	CREATE TABLE student10(
		sno NUMBER PRIMARY KEY,
		name varchar2(50) NOT NULL,
		grade NUMBER check(grade BETWEEN 1 AND 4),
		citynum char(13) UNIQUE,
		dno NUMBER REFERENCES department(dno)
	);

SELECT * FROM student06;

--3. 시퀀스를 9999~1001 범위로 작성하세요.
CREATE SEQUENCE seq_05
	INCREMENT -1
	START WITH 9999
	MINVALUE 1001
	MAXVALUE 9999;
