--#정리문제
--1. 테이블 구조의 변경을 위해 컬럼을 추가하거나 삭제하는 기본 형식을 기술하기
/*   
	 컬럼의 추가
	 alter table 테이블명 add 컬럼명 데이터유형 [default/제약조건]
	 컬럼의 삭제
	 alter table 테이블명 drop column 컬ㄹ럼명
  */
--2. 직책별 최저 급여자 정보테이블 emp16을 만들고 보너스, 부서 컬럼을 삭제하고
--	 부서명 컬럼을 추가하기
SELECT job, min(sal)
FROM emp e
GROUP BY job;
DROP TABLE emp16;
CREATE TABLE emp16 
AS SELECT * FROM EMP 
WHERE (job, SAL) in(
	SELECT job, min(SAL)
	FROM emp e 
	GROUP BY job
);
SELECT * FROM emp16;
ALTER TABLE emp16 DROP COLUMN comm;
ALTER TABLE emp16 DROP COLUMN deptno;
ALTER TABLE emp16 ADD dname varchar2(30);
--3. 가상선택자 중에 반응 선택자를 기술하고 h1을 기준으로 기본예제 작성하기
--4. 가상선택자 중에 상태 선택자를 input 객체를 활용하여 check와 focus를 처리하는 예제 만들기
--5. DOM객체의 메모리 로딩 순서와 함수처리 형식 3가지를 클릭이벤트 예제로 기술하기

~9:20까지 제출