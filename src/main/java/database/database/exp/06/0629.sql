--# 전날 정리문제
-- 1. emp30 복사테이블을 만들고, 부서번호 10의 최대연봉을 사원번호 7521의 연봉으로 수정처리하세요
CREATE TABLE emp30 
AS SELECT * FROM emp;
SELECT * FROM emp30;
SELECT max(sal) FROM emp30 WHERE deptno = 10;

UPDATE emp30
	SET sal = (
		SELECT max(sal) 
		FROM emp30
		WHERE deptno = 10)
WHERE empno = 7521;
-- 2. emp55복사테이블을 만들고, 입사분기별 최고 급여자를 삭제 처리하세요.
CREATE TABLE emp55 
AS SELECT * FROM emp; 
SELECT to_char(hiredate, 'Q'), max(sal)
FROM emp55 
GROUP BY to_char(hiredate, 'Q');
-- where (컬럼1, 컬럼2) in (select 컬럼1, 컬럼2 from ..)
-- 여러컬럼과 여러행을 처리할 때는 위와 같은 형식으로 다수의 컬럼을 나열하고, 
--	in 구문을 활용한다.
DELETE 
FROM emp55 
WHERE TO_char(hiredate, 'Q'), sal) in(
		SELECT to_char(hiredate, 'Q'), max(sal)
		FROM emp55 
		GROUP BY TO_char(hiredate, 'Q')
);
-- 3. merge의 기본 형식을 2가지를 기본예제를 통해서 설명하세요.
--	merge는 두 개 테이블을 병합해서 대상테이블과 원본테이블같이 데이터를
--	동일하게 만드는 것을 처리할 수 있다.
/*
 	1) 형식1
 		merge into 테이블(변경/등록테이블) t
 		usgin 테이블(기준테이블) o
 		on (t.기준컬럼 = o.기준컬럼)
 		when matched then : on에 조건이 true 즉 기준데이터가 있을 때 
 			update set 수정
 		when not matched then 
 			insert values 등록
 			
 			USING emp35 t -- emp36을 변경/입력을 위해서 조건을 처리할 테이블 emp35
		ON (s.empno = t.empno) -- 35,36 empno 테이블 비교
		WHEN MATCHED THEN -- emp36과 emp35 컬럼에 empno가 동일한 경우 
			UPDATE SET  s.ename = t.ename, -- s 즉 emp36의 특정컬럼을 수정..
				  		s.job = t.job,
			 			s.sal = t.sal
		WHEN NOT MATCHED THEN 
			INSERT (empno, ename, sal, deptno)
			VALUES (t.empno, t.ename, t.sal, t.deptno);
 	2) 형식2
 		dual(가상테이블)을 이용해서 외부에서 입력받은 데이터를 기준으로
 		입력/수정을 한번에 처리할 때, 활용된다.
 		merge into 테이블(변경/등록테이블) t
 		using dual
 		on (t.컬럼명 = 기준데이터)
 		when matched then 
 			 수정처리
 		when not matched then
 			 등록처리..
 		 MERGE INTO emp36 s
		USING dual
		ON (s.empno = 8001) -- 외부에서 form으로 데이터를 입력한 경우 , 8002
		WHEN MATCHED THEN 
			UPDATE SET s.ename = '마길동', -- 오길동 , 6000, 20
					   s.job = '과장', -- 과장
					   s.sal = 6000,  -- 6000 , 7000
					   s.deptno= 20  -- 20
		WHEN NOT MATCHED THEN 
			insert (empno, ename, job, sal, deptno)
			values (8002, '마길동', '과장', 6000, 20);
 */

-- 4. emp테이블의 1사분기에 입사한 사람을 기준으로 emp41테이블을 만들고,
--		emp테이블의 empno의 매칭기준으로 사원번호 사원명, 직책명, 관리자번호, 입사일을 merge 처리하세요
SELECT * 
FROM emp 
WHERE to_char(hiredate, 'Q') = '1';
CREATE TABLE emp41 
AS SELECT * 
FROM emp 
WHERE to_char(hiredate, 'Q') = '1';
SELECT * FROM emp41;

MERGE INTO emp41 t 
USING emp o 
on(t.empno=o.empno)
WHEN MATCHED THEN 
	UPDATE SET t.ename=o.ename, --**사원번호는 ON 으로 수정/등록의 조건이기에 수정시 컬럼 사용되지 못한다.
			t.job=o.job,
			t.mgr=o.mgr,
			t.hiredate=o.hireadte
WHEN NOT MATCHED THEN 	
	INSERT (empno, ename, job, mgr, hiredate)
	VALUES (o.empno, o.ename, o.job, o.mgr, o.hiredate);


-- 5.	변경/입력 대상 테이블은 emp37
--		데이터 8005, 김철수, 대리, 현재일입력, 3500, 300, 10을 merge로 입력/수정 처리하세요.

MERGE INTO emp37 s 
USING dual 
ON (s.empno = 8005)
WHEN MATCHED THEN  
UPDATE SET s.ename = '김철수',
		   s.job = '대리',
		   s.hiredate = sysdate,
		   s.sal = 3500,
		   s.comm = 300,
		   s.depnto = 10
WHEN NOT MATCHED THEN 
	INSERT (empno, ename, job, hiredate, sal, comm, deptno)
	VALUES (8005,'김철수','대리',sysdate,3500,300,10);