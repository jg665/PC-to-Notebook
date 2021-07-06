/*
# 인덱스란?
1. sql명령문 중에 주로 조회성 데이터의 처리 속도를 향상시키기 위해
	컬럼에 대해 생성하는 객체
2.	인덱스는 포인트를 이용하여 테이블에 저장된 데이터를 랜덤 액세스
	하기 위한 목적으로 사용된다.
3.	인덱스가 필요한 경우
	 1) where 절이나 join 조건절이 자주 사용되는 컬럼
	 2) 전체 데이터 중에서 10~15%이내의 데이터를 검색하는 경우 활용
	 3) 두 개 이상의 컬럼이 where절이나 조인 조건에서 자주 사용되는 경우
	 4) 테이블에 저장된 데이터의 변경(입력, 수정, 삭제)가 드문 경우
	 	- index 구조도 함께 변경되기에 입력/수정/삭제 속도 문제 발생..
	 5) 열에 null값이 많이 포함된 경우, 열에 광범위한 값이 포함된 경우
4. 형식
	create index 인덱스명
	on table명(컬럼명) 
*/
DROP TABLE emp33;
CREATE TABLE emp33 
AS SELECT * FROM emp;
SELECT * FROM emp33;
/* 데이터 딕셔너리를 통해서 index 정보 확인 user_ind_columns*/
SELECT * 
FROM user_ind_columns
WHERE table_name = 'EMP';
SELECT * 
FROM user_ind_columns 
WHERE TABLE_name = 'dept';
/*
# 인덱스 생성
CREATE INDEX 인덱스명 ON 테이블(컬럼)
*/
CREATE INDEX idx_empno_emp33
ON emp33(empno);
-- ex) emp34 테이블에 empno를 index를 만든 후, 데이터 딕션너리를 통해서 확인하세요 [5]
CREATE TABLE emp34 
AS SELECT * FROM emp; 
CREATE INDEX idx_empno_emp34 
ON emp34(empno);
SELECT * 
FROM user_ind_columns
WHERE table_name = 'emp34';
/*
1. 일반 인덱스 : 데이터의 중복가능 인덱스.
2. 고유 인덱스 : 유일한 값을 가지는 컬럼에 대해 생성하는 인덱스로 모든 인덱스 키는 테이블의 하나의 행과
	연결되어 있다.
	1) 기본 형식
	create unique index 인덱스명
	on 테이블(컬럼명)
3. 제약조건 가운데 primary key는 자동으로 index도 함께 생성이 된다.

*/
CREATE TABLE dept10 
AS SELECT * FROM dept; 
CREATE UNIQUE INDEX idx_dept10_deptno
ON dept10(deptno);
SELECT * 
FROM user_ind_columns
where table_name = 'DEPT10';
-- EX) dept11테이블을 복사테이블로 생성하고, dname을 고유인덱스로 생성하고, 확인하세요. 6조
CREATE TABLE dept11 
AS SELECT * FROM dept;
CREATE UNIQUE INDEX idx_dept11_dnameno 
ON dept10(deptno);
SELECT * 
FROM USER_ind_columns
therer TABLE_name = dept11;
/*
단일인 덱스: 하나의 컴럼으로만 구성된 인덱수
4. 결합 인덱스 : 두 개 이상의 컬럼을 결합하여 생성되는 인덱스.
	create index 인덱스면
	on 테이블명(컬럼명1,컬럼2)
*/
CREATE TABLE = emp35 
AS SELECT ename, job, deptno, sal , hiredate FROM emp;
SELECT * FROM emp35; 
CREATE INDEX idx_emp35_ename_deptno
ON emp35(ename,deptno);
SELECT *
FROM USER_ind_columns 
WHERE TABLE_name = 'EMP35';
-- ex) 사원봉와 부서정보가 조인된 테이블에서 empno와 depno를 제외한 복사테이블
--		emp36을 만들고, ename,dname 이 결합된 결핪 인덱스를 생성하고 확인하세요.
DROP TABLE emp36;
CREATE TABLE emp36 
AS SELECT ename, job, mgr, hiredate, sal, comm, dname, loc 
FROM emp e, dept d 
WHERE e.deptno=d.deptno;
SELECT * FROM emp36;
CREATE INDEX idx_emp36_ename_dname
ON emp36(ename, dname);
SELECT * 
FROM USER_ind_columns
WHERE table_name='EMP36';
/*
# descending index
1. 검색시, 특정한 컬럼의 정렬 기준으로 뒤쪽에서부터 주로 처리되는 경우
	활용된다.
	컬럼별로 정렬 순서를 별도로 지정하여 결합 인덱스를 생성하기 위한 방법을 말한다.
2. 형식
	create index 인덱스명 on 테이블명(컬럼명1 desc, 컬럼2 asc);
 */
CREATE TABLE emp37 
AS SELECT * FROM emp;
CREATE INDEX idx_emp37_depno_ename
ON emp37(deptno DESC, ename ASC);
-- desc로 인덱스를 하면, 정렬의 우선순위로 먼저 데이터 찾아준다.
SELECT * 
FROM user_ind_columns 
WHERE table_name='EMP37';
-- ex) emp38을 depno와 empno를 없애고 만들되 ename 역순위로, job도 역순위로 해서 
--		인덱스를 만드세요.
-- deptno와 empno가 없는 emp38 테이블 생성
-- 두개의 컬럼을 제외한 테이블 생성.
CREATE TABLE emp38 
AS SELECT ename, job, mgr, hiredate, sal, comm FROM emp;
-- ename과 job을 역순위로 인덱스 생성
CREATE INDEX idx_emp38_ename_job
ON emp38(ename DESC, job DESC); 
-- 데이터 딕셔너리에서 확인
SELECT * 
FROM user_ind_columns
WHERE table_name = 'EMP38';
/*
# 함수기반 인덱스
1. 컬럼에 대한 연산이나 함수의 계산 결과를 인덱스로 생성하는 것을 말한다.
2. 함수 기반 인덱스는 insert, update시에 새로운 값을 인덱스에 추가한다.
3. 기본 형식
	create index 인덱스명 on 테이블(함수(컬럼));
*/
CREATE TABLE emp39
AS SELECT * FROM emp;
CREATE INDEX uppcase_idx ON emp39(lower(ename));
SELECT * 
FROM USER_ind_columns
WHERE table_name = 'EMP39';
SELECT * 
FROM emp39
WHERE lower(ename) = 'king';
-- ex) emp40 테이블을 만들고, 문자열로 검색되는 모든 컬럼을 upper() 함수가 적용된
--		함수기반 index로 만드세요.
CREATE TABLE emp40
AS SELECT * FROM emp; 

CREATE INDEX uppercase_idx2 ON emp40(upper(ename));
CREATE INDEX uppercase_idx2 ON emp40(upper(job));

SELECT * FROM emp40;
SELECT * 
FROM emp40 
WHERE upper(ename)='SMITH';
SELECT * 
FROM emp40 
WHERE upper(job)='SALESMAN';
SELECT * 
FROM USER_IND_COLUMNS 
WHERE table_name = 'EMP40';