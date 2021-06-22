
/*
<db>
1.	select 문의 기본 형식을 기술하세요.
	SELECT *(가져올 전체컬럼) FROM emp;(가져올테이블명)
	
2.	사원정보(emp)에서 부서번호, 사원번호, 사원명, 급여를 출력하세요.
SELECT deptno, empno, ename, sal FROM emp; 

SELECT deptno AS "부서번호(deptno)",
		empno "사원번호(empno)",
		ename "사원명(ename)",
		sal "급여(sal)"
FROM emp;
3.	별칭선언의 기본 형식을 기술하세요.
	사원정보에서 사원번호를 번호, 사원명을 이름, 급여를 연봉으로
	alias로 선언하여 출력하세요.
	
	SELECT AS 컬럼명 별칭명
	컬럼명 별칭명,
	컬럼명 "벌칭명(별칭명)"
	
	SELECT empno AS "번호",
		ename "이름",
		sal "급여"
	FROM emp;
	
4.	사원 정보를 아래의 형식으로 출력하세요.
	부서번호를 %로 해서 보너스를 지정했다고 가정할 때,
	부서는 @@이고, 사원번호는 @@@, 급여는 @@@, 보너스 @@ 입니다. 한라인으로 출력

SELECT  deptno, deptno*0.1 "보너스",
'부서는' ||deptno||'이고, 사원번호는 '||empno||', 급여는' ||sal||', 보너스' ||comm|| '입니다.' "사원정보"
FROM emp;
	
	
5.	database에 있어서 jdbc는 어떤 역할을 하는가?
	db 서버에 접속할 때, 필요하는 프로그램 모듈을 자바로 만들어서 처리한 
	class의 압축판.

6.	xe를 활용하여 db 서버에 접속할려고 한다. 필요로 하는 서버 등록 정보는 무엇인가?
	host :  ip - localhost (현재 컴퓨터에 서버거 설치되어 있을 때)
			port - 1521
			sid - xe
			계정 - scott
			비번 - tiger
			
	

 */
SELECT deptno, deptno*0.1 "deptno%"
FROM emp;

SELECT  deptno, deptno*0.1 "보너스",
'부서는' ||deptno||'이고, 사원번호는 '||empno||', 급여는' ||sal||', 보너스' ||comm|| '입니다.' "사원정보"
FROM emp;

SELECT comm FROM emp;

-- empno : 사원번호, ename: 사원명, job : 직책명, mgr : 관리자번호
-- hiredate : 입사일, sal : 급여, comm : 보너스, deptno : 부서번호
