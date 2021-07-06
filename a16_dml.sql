/*
1. update 명령문은 테이블에 저장된 데이터 수정을 위한 조작어이다.
2. 기본형식
	update 테이블명
	set 컬럼1 = 변경할데이터,
		컬럼2 = 변경할데이터,
		컬럼3 = 변경할데이터
	 where 조건문
3. 주의사항
	1) where 절을 생략하면 테이블의 모든 행이 수정된다.
	2) 조건문과 변경할 데이터부분을 subquery를 이용하여 처리할 수 있다.
*/
CREATE TABLE emp02 
AS SELECT* FROM emp;
SELECT * FROM emp01;
SELECT * FROM emp02;
UPDATE emp02 
	set empno = 5005,
	mgr = 7698,
	sal = 3600,
	comm = 500,
	deptno = 40 
WHERE ename = 'SMITH';
-- ex1) emp02에서 comm이 null인 데이터를 모두 1000으로 수정처리하세요
UPDATE emp02 
	SET comm = 1000
WHERE comm IS NULL; -- 컬럼명 IS NULL, 컬럼명 IS NOT NULL 
-- ex2) emp02에서 1/4분기에 입사한 사원정보는 현재날짜로 수정처리하세요. 2조 
SELECT * FROM emp02;
UPDATE emp02
	SET hiredate = sysdate
	WHERE to_char(hiredate, 'Q') = '1';
