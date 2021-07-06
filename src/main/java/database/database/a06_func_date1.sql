/*
# 날짜함수
1.	날짜형 데이터 타입에 사용하는 함수
2.	기본 연산
	1) 날짜 +/- 숫자 : 해당 일자의 일수를 가산(감산)하여 처리
	2) 날짜 +/- 1/24 : 시간단위 연산 처리
	1일이 24시간이기 때문에 5시간 이후인 경우, 날짜 5/24를 처리한다.
cf) sysdate는 현재날짜시간을 나타낸다.
*/
SELECT sysdate "현재날짜/시간",
	sysdate + 1 "내일 24시간이후",
	sysdate - 1 "전날 24이전 날짜",
	sysdate +(8/24)	"현재로부터 8시간"
FROM dual;	
-- ex1) 사원명, 입사일, 입사후 120일, 입사 8시간 전, 근무일수
-- sysdate 활용
-- 시간이전과 이후 계산시 시간/24
-- sysdate : 현재날짜, hiredate 입사일
-- sysdate-hiredate : 날짜와 소숫점이하의 시간
SELECT ename "사원명", hiredate "입사일",  hiredate +120 "인턴기간",
	hiredate -(8/24) "입사 8시간전",
	trunc(sysdate-hiredate) "근무일수"
FROM emp;
/*
# 날짜 함수
1. sysdate : 오라클에서 서버시스템의 현재 날짜와 시간
2. months_between(날짜1, 날짜2) : 날짜 사이의 개월을 계산
	1개월 = 1, 15일 ==> 0.5 1월을 기준, 일/시/분/초 단위 들으로
		소숫점으로 계산이 된다.
 */

-- 사원번호, 입사일, 입사30일전, 입사후12시간 출력 
SELECT empno "사원번호", hiredate "입사일", 
hiredate -30 "입사 30일전", hiredate +(12/24) "입사 후 12시간"
FROM emp;

SELECT ename
FROM emp;