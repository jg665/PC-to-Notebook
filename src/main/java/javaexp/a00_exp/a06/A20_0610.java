package javaexp.a00_exp.a06;

public class A20_0610 {
/*
1. 명시적 형변환 함수 3가지를 기본 예제와 함께 기술하세요.
	일반적으로 데이터 베이스는 변환함수를 이용하여 데이터 타입을 변환하여 효과적으로 처리한다.
	1) to_char(문자열로_: 숫자/날짜 타입을 문자열로 변환해주는 함수이다.
	to_char(hiredate, 'YYYY"년 " MM"월" DD"일"')"날짜표시"
	
	2) to_number(숫자로) : 날짜/문자 타입을 숫자로 변환해주는 함수
	SELECT * FROM emp 
	WHERE sal >= to_number('1000');
	
	3) to_date(날짜로) : 문자/숫자 타입을 날짜로 변환해주는 함수
	to_date('2021-06-09 12:15:25','YYYY-MM-DD HH12:MI:SS'));
	
2. 문자열 형변환 format 속성값(날짜,시간)을 기술해보세요.
	
3. 2/4분기에 입사한 사람을 이름과 분기 입사년월일(YYYY/MM/DD)형식으로 출력하세요.
	select ename 이름, to_char(hiredate 'Q') 분기,
	 to_char(hiredate, YYYY/MM/DD) 입사년월일
	 from emp;
	 
4. decode문의 기본형식을 기본 예제와 함께 기술하세요.
	decode(데이터, case1, case1일때처리할데이터,
				 case2, case2일때처리할데이터,
				 case3, case3일때처리할데이터,
			위내용에해당하지않을 때 처리할 데이터)

5. case문의 기본형식을 기본예제와 함께 기술하세요.
	1) 조건문 형태 활용
	case when 논리|산술|관계 then 처리할 데이터
		 when 논리|산술|관계 then 처리할 데이터
		 else 기타처리할 데이터
		 
	select ename, sal,
	case when sal>=2000 then '2000'
	else

6. nvl, nvl2, nullif 함수의 차이점을 기술하세요.	
 */
}
