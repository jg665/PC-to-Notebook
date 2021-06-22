/*
# 그 외에 subquery 
1. TABLE 자체에 대한 subquery 

2. SELECT 선택열에서 subquery처리 ..
*/

SELECT * 
FROM ( 
	SELECT deptno, max(hiredate) hiredate
	FROM emp 
	GROUP BY deptno 
) a, emp b 
WHERE a.hiredate = b.hiredate
AND a.deptno = b.deptno
ORDER BY a.deptno;
SELECT * FROM emp;
SELECT * 
-- 데이터 내용이 많아지면 서브쿼리 사용
FROM (SELECT empno, deptno, sal 
		FROM emp 
		WHERE sal BETWEEN 1000 AND 2000
) a, dept d
WHERE a.deptno = d.deptno;
-- ex1) 연봉이 2000~4000인 사원의 부서번호, 사원명, 사원번호, 이름의 subquery
--		테이블과 부서테이블과 join하여 출력하세요	
SELECT * 
FROM (SELECT deptno,ename, empno, SAL 
		FROM emp 
		WHERE sal BETWEEN 2000 AND 4000) a, -- 테이블() a 생성
		dept b -- b 부서 테이블 생성
WHERE a.deptno = b.deptno;
-- ex2) 부서별 최저 연봉의 정보와 부서정보를 join하여 출력
SELECT a.*, dname, loc
FROM 
	(	SELECT deptno, min(sal) mxsal 
		FROM emp 
		GROUP BY deptno) a, dept b 
WHERE a.deptno = b.deptno ;

-- 테이블 subquery를 활용하여 처리 
-- ex1) 중복되지 않는 관리자 번호리스트 테이블과 사원테이블
-- mgr, empno로 조인하여 관리자번호  관리자명 직책 출력
SELECT a.mgr "관리자번호", ename, job 
from(
	SELECT distinct mgr	FROM emp) a, emp b
	WHERE a.mgr = b.empno;
-- ex2) 부서별 최근 입사자 테이블과 사원테이블을 부서번호로 조인하여 출력
SELECT *
FROM (SELECT deptno,  max(hiredate) maxhire
FROM emp 
GROUP BY deptno) a, dept b 
WHERE a.deptno = b.deptno;
-- ex3) 연봉이 3000~4000에 해당하는 사원 테이블과 부서정보 테이블 조인하여 출력
SELECT * 
FROM 
(SELECT * 
	FROM emp 
	WHERE sal BETWEEN 3000 AND 4000) a, dept b 
	WHERE a.deptno = b.deptno;








