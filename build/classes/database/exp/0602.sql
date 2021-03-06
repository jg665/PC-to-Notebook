/*
#과제#
1. 함수란 무엇이며, 함수에 단일행 함수와 다중행 함수의 차이점을 예시를 통해서 설명하세요.
	정의된 내용
	function 함수명(매개변수..){
		프로세스...
		return 리턴값;
	}
		호출하는 내용
		함수명(입력값..);
	함수의 매개변수를 통해 데이터가 입력되면, 함수로 인하여 원하는 
	데이터 형식으로 변경하여 효율적으로 활용하기 위하여 사용된다.
    1) 단일 행 함수 : 입력한 데이터의 갯수와 출력한 데이터의 갯수가 동일할때. 일반적인 함수
    ex) 숫자처리함수, 문자처리함수, 날짜함수, 기타기능함수
    2) 복수 행 함수 : 여러 입력한 데이터에 의해서 그룹으로 처리하여, 
    				단일 또는 그룹의 데이터 건수에 의해서 처리되는 함수.
    ex) 그룹을 통한 통계 함수 : 최대값, 최소값, 평균값...
        
2. 문자 함수가 사용되는 용도에서 웹화면에 물품명을 대소문자 관련없이 검색한다고 가정할 때,
    product(테이블명), pname(검색할 물건명) 을 기준으로 sql을 작성하세요.
     물건명 [      ] [검색] 검색클릭시, 대소문자 관련 없이 키워드 검색이 되게 처리할려면
     어떤 sql를 작성할지 기술하세요.

	SELECT product , pname 
	FROM Proudct
	WHERE upper(pname) LIKE upper('%'||검색할데이터||'%');
	upper(pname) : 저장된 데이터가 소문자로 되어있는 경우에 검색을 위해 처리..
	LIKE upper('%'||검색데이터||'%') : 입력하는 데이터를
	대문자로 변경하고 keyword 검색을 위하여 처리..
	
3. length와 lengthb를 차이를 기술하고,  dual을 이용해서 한글과 영문을 비교하세요.
	LENGTH : 문자열의 크기를 처리해주는 함수.
			 영문/한글 구분없이 글자당 처리
	lengthb : 문자열의 byte 크기를 처리해주는 함수.
		영문은 한글자당 1byte, 한글은 3바이트(oracle)
	테이블 생성시, 선언하는 char(크기) varchar2(크기)
	byte기준으로 선언한다.
	dual : 오라클에서 지원하는 가상 테이블, 테스트용으로 한라인에 데이터와 함수의 적용결과 확인.
*/
	SELECT '안녕하세요' s1, length('안녕하세요') s2,
	lengthb('안녕하세요') s3,
	'hello' se1, length('hello') se2,
	lengthb('hello') se3
	FROM dual;

SELECT length('hello') 영어 , lengthb('hello') 영어2 ,
	   length('안녕하세요') 한국어, lengthb('안녕하세요') 한국어1
FROM dual; 

/*


4. ||, substr  이용하여  [ename(deptno)의 직책은 job 입니다. ] 형식으로 출력하세요.   
    ename : 앞에서 3자 추출
    job :뒤에서 5자 추출
    
    substr(문자열데이터, 시작위치, 마지막위치-갯수) : 
	문자열 데이터를 시작위치와 마지막위치를 기준으로 절삭처리하여
	사용하는 것을 말한다.
	
	substr(컬럼명,-5,5) -5 : 
		시작 위치를 뒤에서 -5 index로 부터 시작해서 5개를 추출처리 
*/
	SELECT substr(ename ,1,3)||'('||deptno||')'||
			'의 직책은' || substr(job ,-5,5)||'입니다' show
	FROM emp;
/*
		
5. lpad와 ltrim의 기본적인 형식을 기본예제와 함께 기술하세요.
	lpad(컬럼명, 기준이 되는 자리수, 자리수보다 적을 때 채워놓은 문자) 
	select ename, lpad(ename, 10, '#') show from emp;
	rpad(데이터, 크기지정, 덧붙일문자열)
*/
	SELECT lpad('test',6,'#') t1,
		   rpad('test',6,'@') t2
	FROM dual;
/*
	ltrim/rtrim : trim 왼쪽/오른쪽에 지정한 문자열을 삭제하여 처리할 때 활용된다.
	ltrim(컬럼명, 왼쪽에서부터 삭제할 문자)
	select job, ltrim(job, 'A') from emp;
	trim(양쪽으로삭제할 문자 from 대상컬럼/데이터)
*/
	SELECT ltrim('####test####','#') t1,
	 		rtrim('####test####','#') t2,
		 	trim('#' FROM '####test####') t3
	FROM dual;
/*
	
			
6. 숫자형 함수의 종류와 기능상 특징을 기술하세요.
	1. 자리수 처리
		round(데이터,자리수) : 반올림
		trunc(데이터,자리수) : 절삭처리.
			자리수 + : 소숫점이하 자리수
			자리수 - : 왼쪽으로 10, 100 ,1000.... 처리
	2. 정수로 처리
		ceil(데이터) : 올림
		floor(데이터) : 내림
	3. mod(m,n) : m에서 n을 나눈 나머지

7. 사원 번호의 3으로 나누어 %로 해서, 0 ==> 0%, 1 ==>10%, 2==>20%
   보너스를 정하여, sal기준으로 원금+보너스 합산을 출력하되,
   10자리단위로 반올림 처리하여 출력하세요
   사원명, 급여, 보너스(%), 보너스, 총계
*/
	SELECT ename,sal, MOD(empno,3)*10 "보너스(%)",
	sal*mod(empno,3)/10 "보너스",
	sal + (sal*mod(empno,3)/10) "총계"
	FROM emp;
/*	# 보너스 기준
 *  0 ==> 0%, 1 ==>10%, 2==>20%
    MOD(empno,3)*10 : 나머지값을 기준으로 보너스 % 표시
	sal*mod(empno,3)/10  : 실제 연산할 %에 해당하는 실수값을 
		sal와 연산 - 보너스 금액 
   	sal + (sal*mod(empno,3)/10) : 원금 + 보너스 총계 처리.
   
8. 관리자 번호가 짝수인 사번과 관리자 번호와 급여를 출력하되, 
	급여는 100자리 수로 절삭하여 처리하세요.
*/
SELECT empno, mgr, trunc(sal,-2) "급여"
FROM emp
WHERE mod(MGR,2)=0;

SELECT empno, deptno, sal, 
	trunc(sal,-2) "100자리수 절삭",
	mod(deptno,2) "짝수"
	FROM emp
	WHERE mod(deptno,2)=0;

/*
7번문제는 조건을 어떻게 둬야할지 모르겠습니다.
*/