SELECT * FROM emp;
-- ctrl + enter : 실행
-- 복사테이블 만들기
/* 
create tavle 테이블명
as select * from 복사할테이블명;
 */
CREATE TABLE emp01
AS SELECT * FROM emp;
SELECT * FROM emp01;
-- 로딩할 특정 컬럼 지정		select 컬럼명1, 컬럼명2 ...
SELECT empno, ename, job
FROM emp01;
-- 커서가 있는 곳까지 실행이 진행된다.
/*
# select 명령문
1. 테이블에 저장된 데이터를 검색하기 위한 명령문
2. select 명령문에서 select 절과 from 절이 필수적
3. 사용법
	select
	* : 테이블에 있는 전체 컬럼을 지정
	컬럼명1, 컬럼명2 : 해당 컬럼을 지정할 때
	distinct 컬럼명 : 중복하는 데이터를 삭제
	
	from 테이블명
	where 조건;
 *  */
-- ex1) emp, dept, salgrade, bonus 이용해서
--	    테이블 전체 내용 검색
-- ex2) emp 테이블에 ename, job, hiredate, deptno 컬럼 검색처리
SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT * FROM SALGRADE;
SELECT * FROM BONUS;	   
SELECT ename, job, hiredate, deptno
FROM emp;
-- 중복 배제 : 1개 칼럼이 같지 않게 처리
SELECT DISTINCT deptno FROM emp;
-- 중복 배제 : 2개 칼럼dptj 같지 않게 처리
SELECT DISTINCT mgr, deptno FROM emp;

/*
2. 컬럼명 별칭 처리하기
1) 기본 형식
SELECT 컬럼명 AS 별칭명,
	컬럼명 AS 별칭명,
	컬럼명 별칭명,
	컬럼명 " 안 녕 하 세 요 "
FROM 테이블
- 해당 테이블 구조 안에 있는 컬럼명이 별칭명으로 호출하여 출력한다.
- 별칭명은 공백으로 처리도 가능하다.
- 별칭명에 공백이나 특수문자(한글포함)가 필요할 때 " " 사이에
  입력해준다.
* */
SELECT empno AS NO, ename AS name,
		job job01,
		HIREDATE "입사일 입니다"
FROM emp;
-- ex) alias 형식으로 사원번호(empno), 사원명(ename), 관리자번호(mgr)
--	   으로 출력 처리하세요.
SELECT empno "사원번호 (empno)",
	   ename "사원명 (ename)",
	   mgr "관리자번호 (mgr)"
FROM emp;
-- empno : 사원번호, ename : 사원명, job : 직책명, mgr : 관리자번호
-- hiredate : 입사일, sal : 급여, comm : 보너스, deptno : 부서번호
SELECT * FROM emp;
-- deptno: 부서번호, dname : 부서명, loc : 부서위치
SELECT * FROM dept;
/*
# 데이터와 산술연산자와 concatnate(문자열 연결)처리
1. 컬럼에 있는 숫자형 데이터는 사칙연산자 처리가 가능하다(+,-,*,/)
2. 문자열 연결은 DB에서는 '문자열1'||'문자열2'
   로 문자열 데이터를 표시하고 연결 처리를 한다.
  
 * */
SELECT empno, empno+1000 "empno+1000",
		empno*20 "empno*20",
		ename || '님은 회사원입니다!' msg,
		sal, comm, sal+comm "sal+comm"
FROM emp;
-- ex1) 사원의 이름은 @@@ 입니다, 부서번호는 @@@ 입니다.
SELECT '사원의 이름은 '||ename||' 입니다, 부서번호는 '
	   ||deptno||' 입니다.' show
FROM emp;
-- ex2) 사원명(부서번호), 금여의 10% 표시, 금여의 10%와 급여의 함산 출력
SELECT ename||' ( '||deptno||' ) ' "사원명(부서번호)",
	   sal*0.1 "급여의 10%", (sal*0.1)+sal "합산액"
FROM emp;
-- ex3) 사원번호 empno이고, 급여는 연봉으로 sal 만원입니다. alias 명 "소개"
SELECT '사원번호 '||empno||'이고, 급여는 연봉으로 '||sal||' 만원 입니다.' "소개"
FROM emp;
/*
# sql 명령문의 표준 형식
select *|컬럼명 : 열단위로 나타날 데이터
from 테이블명 테이블별칭 : 대상 테이블 as alias명,
where 조건문 : 행단위로 나타날 데이터 filtering 처리
group by 그룹할 컬럼지정 : 특정 컬럼 기준으로 합산, 갯수, 최대/최소값
having 그룹의 조건을 지정 : 그룹 컬럼의 조건
order by 정렬할 우선순위컬럼 지정
*/
SELECT deptno, sal -- 컬럼단위로 전체 행을 지정
FROM emp
WHERE sal>=3000; -- 조건을 통해서 행단위로 filtering 처리
SELECT deptno, max(sal) "그룹별최대연봉",
		count(*) "그룹별 건수"-- 그룹별로 가장 연봉이 많은 사람
FROM EMP
GROUP BY deptno; -- 그룹할 컬럼 부서번호를 겹치지 않게 그룹화한 후,
SELECT deptno, sal -- HAVING 그룹함수의 조건
FROM emp;
ORDER BY sal desc; -- 특정 칼럼 기준으로 순차정렬/역순 정렬

/*
# where 조건문
1. 질의에서 필요한 관계대수(=,>=,<=,>,<)로 select의 컬럼에 대하여
	row 단위로 조건에 해당한다.
2. 관계대수를 연결하는 and, or, subquery(중첩질의)를 통해서 row 단위를 filtering 한다.
*/
-- 연봉이 2000~4000 사이의 사원 정보를 출력하세요.
SELECT *
FROM emp
WHERE sal >= 2000 AND sal <= 4000;
-- 부서번호가 10인 데이터를 출력하세요
SELECT *
FROM EMP e 
WHERE DEPTNO = 10;
-- ex) job(직책) 이 'SALESMAN' 인 사원정보를 출력하세요.
SELECT *
FROM emp
WHERE job = 'SALESMAN';
-- ex1) sal이 2000이상인 사원명 급여, 부서번호를 출력하세요.
SELECT ename, sal, deptno
FROM EMP
WHERE sal >= 2000;

SELECT empno "사원번호", ename "사원명", sal "급여",
		deptno "부서번호"
FROM emp 
WHERE sal>=1000
AND sal<=3000
AND deptno = 10; -- 여러개 조건 처리
/*
# 비교 연산자
1. !=
   not (조건문) : 해당 조건이 아닐 떄
2. is not null : null이 아닐때
	ex) 컬럼 = null(X) ==> 컬럼 is null
		컬럼 != null(X) ==> 컬럼 is not null
*/	
SELECT *
FROM emp
WHERE DEPTNO = 20;
SELECT *
FROM emp
WHERE DEPTNO != 20;
SELECT *
FROM emp
WHERE NOT (DEPTNO = 20 AND sal>=3000);
-- 위 조건과 같은 내용: deptno != 20 or sal < 3000
/*
# 논리 연산자
1. or
*/
SELECT sal, comm 
FROM emp
WHERE comm = NULL; -- 원하는 null인 데이터가 보이지 않는다.
SELECT sal, comm 
FROM EMP e 
WHERE comm IS NULL; -- 이렇게 해야 NULL 값이 나온다.
SELECT sal, comm 
FROM EMP e 
WHERE comm IS not NULL; -- NULL 값이 아닌 경우
--
SELECT *
FROM emp;
-- ex) comm이 null이 아니거나 부서번호가 10인 데이터를 출력하세요
SELECT *
FROM emp 
WHERE comm IS NOT NULL and deptno = 10;