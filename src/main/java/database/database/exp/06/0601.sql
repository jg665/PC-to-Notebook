/*
# 정리문제
1. System. 하위에 기능메서드로 현재시스템에 대한 내용을 확인하고 처리할려고 한다.
    주요 메서드와 속성/속성값 처리 코드를 기술하세요.
2. 시스템의 환경변수를 가져와서 해당 내용을 자바에서 확인할 때, 사용하는 객체와 메서드를 기술하세요.
3. String 문자열이 만들어질 때까지 과정을 bit단위부터 기술해보세요.
4. String 생성자를 통해, 알파벳 대문자 8자의 임의의 비밀번호를 만들려고 한다. 
    byte[] 배열을 이용하여 처리하세요.
5. 학번을 연도(2자리)학년(2자리)반(1자리)성별(F/M)로 만들어서 처리할 때, 
    charAt와 substring을 활용해서 해당 내용을 추출하여
    @@@ 년도 입학, @@학년 @@반 남자/여자 로 출력하세요
6. 요일별로 중국집에 오늘은 메뉴를 바꿀려고 한다.
    요일을 랜덤으로 나오게 하여, 요일과 메뉴출력하는 란을 변경처리하세요
    오늘은 @@ 요일 @@ 메뉴 추천
    월 @@
    화 @@
    수 @@
    목 @@
    금 @@
    토 @@
7. 다음과 같은 데이터를 2중 반복문으로 처리하여 구매 물품을 리스트 하세요.
   split(), StringTokenizer 둘다 활용
    사과&3000&2/바나나&4000&3/딸기&12000&5
    
6. 함수의 두가지 유형은 기술하세요..(DB)
단일행 함수, 복수 행 함수

7. 사원명을 대소문자 구분없이 a를 입력했을 때, 해당 사원을 keyword검색되게 sql을 처리하세요(DB)
*/
SELECT ename
FROM emp;

-- # 퇴실 전에 자기 이름으로 스티커가 된 pc 패스워드 등록. 윈도우 최신업데이트, 가실 때, 켜놓고 퇴실하시면 됩니다.