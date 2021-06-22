/*
# 정리문제
<db>
1. select 문의 기본형식을 기술하세요.
	- 기본 형식
	SELECT 컬럼명1, 컬럼명2...  -- 테이블의 전체 컬럼 호출시 * 사용
	FROM 테이블명
	WHERE 조건문;
	group by 그룹할 컬럼
	having 그룹의 조건
	order by 정렬컬럼 desc;
	
2. 사원정보(emp)에서 부서번호, 사원번호, 사원명, 급여를 출력하세요.

	SELECT deptno, empno, ename, sal
	FROM emp;

3. 별칭선언의 기본 형식을 기술하세요.
   사원정보에서 사원번호를 번호, 사원명을 이 름, 급여를 연 봉으로
   alias로 선언하여 출력하세요.
	- 기본 형식
	SELECT 칼럼명 AS 칼럼명(영어),
		   칼럼명 AS " 특수문자 ",
		   칼럼명 " 별칭 ",
	FROM 테이블명;
    
        
	SELECT empno "번호",
		   ename "이 름",
		   sal "연 봉"
	FROM emp;

4. 사원 정보를 아래의 형식으로 출력하세요.
   부서번호를 %로 해서 보너스를 지정했다고 가정할 때,
   부서는 @@이고, 사원번호는 @@@, 급여는 @@@, 보너스 @@입니다.
   한라인으로 출력

	SELECT sal, deptno||'%' "보너스", -- 어떻게 출력되는지 확인!
		   sal*deptno/100 "보너스금액",
		   '부서는 '||deptno||'이고, 사원번호는 '||
		   empno||', 급여는 '||sal||', 보너스 '||sal*deptno/100||'입니다.' show
	FROM emp;

5. database에 있어서 jdbc는 어떤 역할을 하는가?
	
	db 서버에 접속할때 필요한 프로그램 모듈을 자바로 만들어서 처리한 class의 압축판으로,
	자바와 데이터베이스간에 데이터를 주고받을 수 있도록 번역해주는 역할을 한다.
	
6. xe를 활용하여 db 서버에 접속할려고 한다. 필요로 하는 서버 등록 정보는 무엇인가?
	- 좌측 상단 데이터베이스 > 새 데이터베이스 연결 > Oracle선택,
	- Database : xe  Username : scott  Password : tiger 설정
	- ojdbc6.jar 까지 설정 후, 
		   host : ip - localhost(현재 컴퓨터에 서버가 설치되어있을 떄)
		   port - 1521
		   sid - xe
		   계정 - scott
		   비번 - tiger
	- 위의 정보로 모두 변경하면 된다.
 * */