-- # 정리과제
-- ex1) job이 'SALESMAN'인 데이터에서 출력하되, 컬럼은 ENAME, JOB, SAL를 선택하세요.
SELECT ename, job, sal 
FROM emp
WHERE job = 'SALESMAN';
-- ex2) 부서번호(deptno)가 20이고, sal가 4000미만인 데이터를 출력하세요.
SELECT *
FROM EMP
WHERE deptno = 20 AND sal < 4000;
-- ex3) 연봉(sal)이 2000에서 3000사이 이거나, 직책(job)이 'SALESMAN'인 사원의 사원번호(EMPNO), 사원명(ENAME), 직책(JOB), 연봉(SAL)을 출력하세요.
SELECT empno "사원번호", ename "사원명", job "직책", sal "연봉"
FROM emp
WHERE (sal >= 2000 AND sal <= 3000)
or (job = 'SALESMAN');
-- ex4) 부서번호가 10이 아닌 경우 처리
SELECT *
FROM EMP
WHERE deptno != 10;
-- ex5) job이 CLERK가 아닌 데이터를 출력하세요.
SELECT *
FROM emp 
WHERE NOT(job = 'CLERK');
-- ex6) comm이 null이 아닌 데이터를 ename과 sal의 comm의 합산한 급여로 출력하세요.
SELECT ename "사원명", sal+comm "급여"
FROM emp 
WHERE comm IS NOT NULL;
-- # 과제 진행시, feed back 필요한 분은 명시, 소스로 풀이 진행
--   설명 내용의 자세풀이 필요시 명시