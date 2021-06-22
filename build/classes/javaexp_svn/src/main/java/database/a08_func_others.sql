/*
# 중첩함수
1. 가장 내부에 있는 함수 f1의 결과값을 다음 함수 f2에 인수로 적용하고,
	다시 f2의 결과값을 f3에 인수로 사용할 때 활용하는 함수형태를 말한다.
	f3(f2(f1(데이터,매개변수),매개변수),매개변수)
	- 특정한 데이터에서 여러가지 함수의 기능을 처리하고자 할 때, 활용된다.
**/
-- 현재데이터의 입사년도를 올해연도로 변경하여 출력할려고 한다.
-- 합쳐서 날짜 데이터로 변경처리.
SELECT ename, to_char(sysdate,'YYYY') "올해연도",
	to_char(hiredate,'MMDD') "사원의입사월일",
	to_char(sysdate,'YYYY')||to_char(hiredate,'MMDD') "올해입사년월",
	to_date(to_char(sysdate,'YYYY')||
		to_char(hiredate,'MMDD'),'YYYYMMDD') "날짜형데이터"
FROM emp;	
-- ex) 입사일의 분기를 추출하여 해당 보너스의 기준으로 설정할려고한다.
--	 1) 입사일, 분기, 급여  
--   2) 분기 1==> 10%, 2==>20%, 3==>30%, 4==>40%
--		TO_CHAR(hiredate,'Q')*10 :묵시적 형변환으로 일어나는 부분.	
--   3) 급여와 연산하여 보너스금액 출력.
--   to_char(@@@,'Q'), 숫자형데이터 to_number() 
--   4) 입사일, 분기, 급여, 보너스(%), 보너스, 최종금액 출력하세요
SELECT ename, hiredate, TO_CHAR(hiredate,'Q') "분기", sal,
	TO_NUMBER( TO_CHAR(hiredate,'Q'))*10 "보너스(%)",
	sal*TO_NUMBER( TO_CHAR(hiredate,'Q'))/10 "보너스",
	sal+sal*TO_NUMBER( TO_CHAR(hiredate,'Q'))/10 "최종금액"
FROM emp;
/*
# 일반함수
1. nvl(데이터, null값일 때 처리할 데이터)
	1) 해당 데이터가 null값일 때, 처리할 데이터를 설정함으로 null에 대한 연산 처리시
		필요하다.
 * 
 * */
-- 하나의 컬럼의 데이터가 null일 때, 합산값도 null이기때문에 0으로 처리한다.
SELECT ename, sal, comm, sal + comm,
		nvl(comm,0), sal+nvl(comm,0)
FROM emp;
/*
2. nvl2(데이터, null이 아닐 때 처리할 데이터, null일때 처리할 데이터) 
 * */
-- comm이 null일때는 100으로 null이 아닐때는 comm에서 10%더 추가해서 결과값을
--  처리
SELECT ename, sal, comm, nvl2(comm, comm*1.1,100) "보너스"
FROM emp;
-- ex1) comm일 null일때는 sal의 15%로 설정하고, null일 아닐 때는 comm에서 sal의 5%를 더하여 보너스금액을
--     설정하여   사원명 연봉 보너스  를 출력하세요.

SELECT ename 사원명, sal 연봉, comm, 
		nvl2(comm, comm+sal*0.05, sal*0.15) 보너스
FROM emp;
/*
3. nullif(데이터1, 데이터2)
두 개의 매개변수로 받는 데이터를 비교하여 동일하면 null을 반환하고, 동일하지 않으면
첫번째 데이터1을 반환처리하는 함수를 말한다.	
 * */
SELECT nullif('a','a') show1,
		nullif('a','b') show2,
		nvl(NULLIF('a','a'),'동일') show3,
		nvl(NULLIF('a','b'),'동일') show3 
FROM dual;
/*
-- ex) 회사에서 일괄보너스 지급 금액이 60이라고 정하는데, 
		연봉의 5%(10단위로 절삭)와 같으면
--     60, 다르면 연봉의 5%로 처리하는 sql을 작성하세요.
      절삭함수, nvl2, nullif
 * */

SELECT ename, trunc(sal*0.05, -1) "연봉의 5%",
	nullif(trunc(sal*0.05,-1),60) "같은지 여부(null)",
	nvl2(nullif(trunc(sal*0.05,-1),60),sal*0.05,60) "보너스"
FROM emp; 



