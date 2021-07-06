--1. sal+comm으로 연산하는 경우 comm null인 경우, 문제가 발생한다.
--	어떤 문제이고 이것을 해결하려면 어떤 처리를 하는지 정리하세요.
-- comm이 null인 경우에 숫자가 안되기에 연산이 되지 않는다. 
-- nvl을 활용하여 해당 내용에 대한 연산이 가능하다.
SELECT sal, comm, sal+comm "값", -- null이 빈값이라 값이 안나옴.
		sal + nvl(comm,0) "합산값"
FROM emp;

--2. 오라클에서 사용하는 주요 데이터 타입의 종류를 예시와 함께 기술하세요.
-- char(size) : 고정형 문자 데이터 타입 ,ex)주민번호, 사번, 학번
CREATE TABLE collegenum(
			studentnum char(8)
);
-- varchar2(size) : 가변형 문자 제이터 타입. 
CREATE TABLE collegesite( 
	id varchar(20),
	pass varchar(20),
);

--3. 문자열을 저장하는 데이터 중, 고정형과 가변형이 있다. 두 데이터 유형의 차이점을 기술하세요.
-- char(size) : 고정형 문자 데이터 타입 ,ex)주민번호, 사번, 학번
CREATE TABLE collegenum(
			studentnum char(8)
);
-- varchar2(size) : 가변형 문자 제이터 타입. 
CREATE TABLE collegesite( 
	id varchar(20),
	pass varchar(20),
);

--4. 데이터 유형을 확인하고, 학생테이블(번호, 이름, 국어, 영어, 수학)을 만들고 데이터를 입력하세요.
CREATE TABLE student(
	num varchar(20),
	name varchar(20),
	kor NUMBER,
	eng NUMBER,
	math NUMBER
);
INSERT INTO student values('10','홍길동',90,80,100);
SELECT * FROM student;

--5. 스포츠 스타의 이름 소속사 올해 성적을 입력하는 테이블을 만들고 데이터를 입력하고 조회하세요.
CREATE TABLE sport(
	name varchar2(20),
	tname varchar2(20),
	vic number,
	def NUMBER,
	eq number
);
	INSERT INTO sport values('주민규','제주',15,10,2);
	SELECT name 이름, tname 소속사,vic 승, def 패,
			vic/(vic+def) 성적
		FROM sport;

--6. select에서 쓰이는 컬럼과 where 조건의 비교 연산자에 쓰이는 컬럼은 어떤 차이가 있는가?
-- select는 테이블에 저장된 데이터를 검색하기 위한 명령문.
-- where는 행 단위로 나타나는 데이터를 필터링 처리.
	
--7. where 조건에 쓰이는 비교 연산자의 종류와 논리 연산자의 종류를 기술하세요.
/*
1.	질의에서 필요한 관계대수(=,>=,<=,>,<)로 select의 컬럼에 대하여
	row단위로 조건에 해당한다.
2.	관계대수를 연결하는 and, or, subquery(중첩질의)를 통해서 row단위
	를 filtering한다.
 */

--8. between, in 구문의 기본형식을 선언하고, 기본 예제를 기술하세요.
-- 컬럼명 between A and B
-- sal가 2500에서 5000 사이 데이터 출력
SELECT * FROM emp
WHERE sal BETWEEN 2500 AND 5000;
	

--9. 부서 10과 30에 속하는 모든 사원의 이름과 부서번호를 이름과 알파벳 순으로 정렬되도록 질의문을 만드세요.
SELECT * FROM emp;

SELECT ename, deptno
FROM emp 
WHERE deptno in(10,30)
ORDER BY ename ASC;

--10. 1982년도에 입사한 모든 사원의 이름과 입사일을 출력하세요(like %활용).
SELECT * 
FROM emp 
WHERE hiredate LIKE '82%';
 
SELECT hiredate FROM emp;

--11. 보너스가 급여의 20%이상이고 부서번호가 30인 모든 사원에 대하여 이름, 급여, 그리고 보너스를 출력하세요.
--		급여(sal), 보너스(comm)
SELECT  ename "이름", sal "급여", comm "보너스" ,deptno "사원번호", sal*0.2 "보너스"
FROM emp
WHERE deptno = 30;

--12. like 키워드에서 %, _ 의미를 기술하고 간단한 예제를 만드세요.
/*
	1) 위치 상관없이 검색 : 컬럼명 like '%A%'
	2) A로 시작하면 검색 : 컬럼명 like 'A%'
	3) N로 끝나는 검색 : 컬럼명 like '%N'
	4) 자릿수 위치에 맞는 데이터 검색 세번째자리에
		A나오는 데이터 검색 : 검색컬럼 like '__A%'
		*/
	SELECT *
	FROM emp 
	WHERE ename LIKE '%A%';

--13. 가장 최근에 입사한 사원의 이름과 입사일을 출력하세요(in subquery구문 활용)
-- subquery : 수행된 결과값을 기준으로 다시 조회 조건을 처리하는 구문.

SELECT * 
FROM emp 
WHERE empno in(
	SELECT empno
	FROM emp 
	WHERE deptno = 30);
);

SELECT ename, hiredate
FROM emp 
ORDER BY hiredate desc;
-- 서브쿼리 구문으로 활용을 못하겠습니다.

SELECT * 
FROM emp 
WHERE ename in(
	SELECT hiredate 
	FROM emp 
	ORDER BY hiredate DESC
);





