/*
# 테이블 이름 변경
 RENAME 테이블명 TO 변경할테이블명;
# 컬럼명 변경
ALTER TABLE 테이블명
RENAME COLUMN 컬럼명 TO 변경할컬럼명;
*/
SELECT * FROM emp10;
SELECT * FROM emp10_new; -- 변경 후 조회 가능
RENAME emp10 TO emp10_new; -- 테이블명 변경 emp10->emp10_new
ALTER TABLE emp10_new	
RENAME COLUMN empno TO NO; -- empno 컬럼을 NO로 변경 --> empno:7380 --> NO:7380,,,
/*
ex) 1) 분기별 최고 연봉자의 테이블을 emp11로 만들고,
 */
-- 분기별 최고 연봉자 테이블
SELECT to_char(hiredate, 'Q') part, max(sal)
FROM emp 
GROUP BY to_char(hiredate, 'Q');
-- 분기별 최고 연봉자의 테이블 emp11만들기.
DROP TABLE emp11 
AS SELECT * 
FROM emp 
WHERE (to_char(hiredate,'Q'), sal) in(
	SELECT to_char(hiredate, 'Q') part, max(sal)
	FROM emp 
	GROUP BY to_char(hiredate, 'Q')
);
SELECT * FROM emp11; 
--  2) 해당 job은 데이터의 최대 크기를 확인하여, 해당 크기의 유형으로 변경하고, 
SELECT max(LENGTH(job)) FROM emp11;
ALTER TABLE emp11 MODIFY job varchar2(9);
--	3) empno는 char(4)로 변경하여 만들고,
		-- empno는 문자를 넣을 수 있는 컬럼을 추가 . empnos
		-- empno와 문자형 empno컬럼의 복사테이블(생략도가능) 만들고,
		-- empnos에 update로 데이터 수정
		-- empno를 삭제
		-- empnos ==> empno로 컬럼명 수정 
SELECT * FROM emp11;
-- 1) empnos로 임시컬럼추가.
ALTER TABLE emp11 
ADD empnos char(4);
-- 2) 데이터를 입력할 복사테이블 만들기.
CREATE TABLE empno_cp 
AS SELECT empno, to_char(empno) empnos 
FROM emp; 
-- 위의 기존 방식을 2), 3) 해당 데이터 내용 key를 기준으로 update 처리
UPDATE emp11 a 	
	SET empnos = 
	(SELECT empnos
					FROM empno_cp b 
					WHERE a.empno = b.empno
					);
ALTER TABLE emp11 
DROP COLUMN empno; 
--	4) 테이블명을 emp11 ==> emp_upt, sal ==> salary로 변경처리하세요.
RENAME emp11 TO emp_upt;
ALTER TABLE emp_upt
RENAME COLUMN sal TO salary;