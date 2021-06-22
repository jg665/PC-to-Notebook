/* 1. sal+comm으로 연산하는 경우 comm null인 경우, 문제가 발생한다.
	  어떤 문제이고 이것을 해결하려면 어떤 처리를 하는지 정리하세요.
	  : 둘 중 하나의 컬럼이라도 null값이 있을 경우 합산값은 null로 나온다.
        null일 경우 0으로 될 수 있도록 함수처리 nvl(컬럼명, null일때 나올 데이터)
		숫자형 nvl(comm, 0)
		문자형 nvl(ename, '')
		를 해줘야한다.

   2. 오라클에서 사용하는 주요 데이터 타입의 종류를 예시와 함께 기술하세요.
   	1) char(size) : 고정 길이 문자 데이터 타입. 최대 2000바이트
		- ex) 코드성 데이터 - 학번, 사번, 주민번호 : 
			자리 수가 정해진 데이터
			create table personnel(
				civilnum char(13);
			);
	2) varchar2(size) : 가변 길이 문자 데이터 타입. 최대 4000바이트
		- ex) 최대 크기를 설정하기에 그보다 작은 데이터 할당시 효율화 : 
			create table personnel(
				name varchar2(15)
			);
	3) number(p, s) : 정밀도(p)와 스케일(s)로 표현되는 숫자 데이터 타입
		- ex) 전체크기 소숫점 이하 크기 지정
			create table personnel(
				pass number
			);
	
   3. 문자열을 저장하는 데이터 중, 고정형과 가변형이 있다. 두 데이터 유형의 차이점을 기술하세요.
    고정형 : 데이터를 저장할때 괄호 안에 정한 사이즈의 크기가 고정되어, 해당 사이즈보다 작은 데이터를 넣어도 크기는 줄지 않는다.
    	동일한 데이터크기를 입력하는 코드성 데이터에 주로 사용된다.
    가변형 : 데이터를 저장할때 괄호 안에 정한 사이즈의 크기보다 작은 데이터를 넣을 시, 할당한 데이터만큼 사이즈가 줄어 맞춰진다.
    	일반적인 문자열을 저장할때 사용된다.
 */   
-- 4. 데이터 유형을 확인하고, 학생테이블(번호,이름,국어,영어,수학)을 만들고 데이터를 입력하세요.
CREATE TABLE student(
	num NUMBER,
	name varchar2(20),
	kor NUMBER,
	eng NUMBER,
	math NUMBER
);  
INSERT INTO student values(1, '홍길동', 100, 100, 100);
INSERT INTO student values(2, '신길동', 100, 100, 100);
INSERT INTO student values(3, '박길동', 100, 100, 95);
-- 테이블의별치.* : (전체 컬럼)에서 추가할 때는 테이블 테이블의 별칭으로 설정
-- 컬럼을 통한 연산이나 함수를 통해서 처리될 수 있는 데이터는 테이블로 관리하지 않는다.
-- round(컬럼, 소숫점자리수) : 해당 자리수만큼 반올림 처리
SELECT a.*, kor+eng+math 총계, round((kor+eng+math)/3, 1) 평균
FROM student a;

-- 5. 스포츠 스타의 이름 소속사 올해 성적을 입력하는 테이블을 만들고 데이터를 입력하고 조회하세요.
CREATE TABLE sportstar(
	name varchar(30),
	agency varchar(50),
	goal NUMBER,
	help NUMBER
	-- 컬럼명을 입력하다가 대문자로 변경이 되는 경우 내장된 keyword이기 때문에 변경해줘야한다.
);
INSERT INTO SPORTSTAR values('홍길동','홍홍홍',30,9);
SELECT name "이름", agency "소속사", goal "골수", help "도움수"
FROM SPORTSTAR;

/* 6. select에서 쓰이는 컬럼과 where 조건의 비교 연산자에 쓰이는 컬럼은 어떤 차이가 있는가?
	select에서 쓰이는 컬럼은 출력될 컬럼들이고 무조건 출력된다.
	where 조건의 컬럼은 조건 설정에 사용될 뿐이며 select문에 포함될 경우에만 출력된다.
	
	선택컬럼 : 열단위
	조건컬럼 : row 단위 필터링 처리
   7. where 조건에 쓰이는 비교 연산자의 종류와 논리 연산자의 종류를 기술하세요.
    비교연산자 : 관계대수(=,>=,<=,>,<)
    논리연산자 : !=, and, or, not (조건문) - 해당 조건이 아닐 떄, is not null/is null
    기타 : between A and B, 컬럼명 in(데이터1, 데이터2), like ''
   
   8. between, in 구문의 기본형식을 선언하고, 기본 예제를 기술하세요.
    기본형식 : between A and B 
   			컬럼명 in(데이터1, 데이터2), 컬럼명 in (subquery)
*/
	SELECT *
	FROM EMP
	WHERE empno BETWEEN 7300 AND 7500;
	SELECT *
	FROM emp 
	WHERE empno IN(7369, 7499);

-- 9. 부서 10과 30에 속하는 모든 사원의 이름과 부서번호를 이름과 알파벳 순으로 정렬되도록 질의문을 만드세요.
	SELECT ename, deptno
	FROM emp
	WHERE deptno IN(10, 30)
	ORDER BY ename;

-- 10. 1982년도에 입사한 모든 사원의 이름과 입사일을 출력하세요(like %활용)
--	hiredate는 date 타입이기에 보이는 모양과 문자열로 접근해서 보이는 모양은 차이가 있다.
--  ''||날짜형  : 강제 타입캐스팅 진행하고 문자열 검색 진행
--  원칙적으로는 날짜형 ==> 함수에 의해 ==> 문자열로 변환 ==> 변환된 문자열을 비교
	SELECT ename, hiredate 입사일, ''||HIREDATE "입사일(문자)"
	FROM emp 
	WHERE hiredate LIKE '%82%';

-- 11. 보너스가 급여의 20%이상이고 부서번호가 30인 모든 사원에 대하여 이름, 급여, 그리고 보너스를 출력하세요.
--	   급여(sal), 보너스(comm)
	SELECT ename "이름", sal "급여", comm "보너스"
	FROM emp 
	WHERE comm >= sal*0.2 AND  deptno = 30;

-- 12. like 키워드에서 %, _ 의미를 기술하고 간단한 예제를 만드세요.
--  % : 앞에 문자가 있는지 여부 (%A% - 위치 상관없음 / %A - 맨끝문자 / A% - 맨앞문자)
--  _ : 몇번째 문자인지 _의 갯수로 지정 (__A% - 3번째 위치의 문자)
	SELECT *
	FROM emp 
	WHERE ename LIKE '%A%';
	SELECT *
	FROM emp 
	WHERE ename LIKE '__A%';
	SELECT *
	FROM emp 
	WHERE ename LIKE '%A__';

-- 13. 가장 최근에 입사한 사원의 이름과 입사일을 출력하세요(in subquery 구문 활용)
	SELECT ename, hiredate
	FROM emp 
	WHERE hiredate IN(
		SELECT max(hiredate)
		FROM emp 
	);