package javaexp.a00_exp;

import java.util.ArrayList;
	
	
public class A15_0526 {
	/*
# 정리문제
1. 클래스 선언에서 toString()의 역할을 기술하고, super.toString()을 선언했을때 어떤 기능이 처리되는지 설명하세요.
	- toString(): 모든 객체의 패키지명.클래스명@주소값으로 참조변수만 선언하여도
				  해당 내용에 대한 부분을 출력하게 정의해놓았다. ==> sysout(o); == sysout(o.toString());
	- toString() 내용을 재정의하면 해당 내용을 참조변수출력만으로 확인할 수 있다.
	super.toString()을 호출하면, Object에서 선언한 내용인 패키지명.클래스명@주소값을 가져올 수 있다.
	
	
		Person01 p01 = new Person01();
		System.out.println(p01); //toString() 메서드 자동출력
		
	}

}
class Person01{
	public String toString() {
		return super.toString()+": 재정의한 내용 리턴!";
	}
}
	
	
2. 상속관게에서 super키워드를 사용하는 경우를 예제와 함께 기술하세요.
	1) 상속관계 재정의 메서드가 있을 떄 상위 메서드와 현재 메서드를 구분하기 위하여
	   사용한다.
	   class Father{
	   		private String name;
	   		Father(String name){ // (2)
	   			this.name=name;
	   		}
	   		public void gogo(){
	   			System.out.println("가다");
	   		}
	   }
	   
	   class Son extends Father{
	   		Son(String name){
	   		super(name+"(아들)"); // (2)
	   		}
	   		public void gogo(){
	   			Systme.out.println("빨리 ");
	   			super.gogo(); // 부모클래스의 gogo()메서드 호출
	   			
	   		}
	   }
	
	2) 상위에 선언한 사용자정의 생성자를 하위 클래스에서 반드시 호출해야 하는
	   경우 super(매개변수값) 형태로 생성자 선언의 1번째라인에서 선언한다.
	   
	
3. Worker 추상 클래스를 상속받은 FireMan, PoliceMan, Programmer를 다형성을 처리하되, 생성자에 super("경찰과") 활용,
   공통메서드 : 출근/퇴근하다, 재정의 메서드 : 일하다를 처리하세요.
   1:1, 1:다 관계를 설정하여 처리하세요
   
   main() 안에
   		// 1:1
   		Worker01 w1 = new PoliceMan01();
		Worker01 w2 = new FireMan01();
		Worker01 w3 = new Programmer01();
		w1.goWork();
		w1.work();
		w1.goHome();
		w2.goWork();
		w2.work();
		w2.goHome();
		w3.goWork();
		w3.work();
		w3.goHome();
		
		// 1:다
		ArrayList<Worker01> list = new ArrayList<Worker01>();
		list.add(new PoliceMan01());
		list.add(new FireMan01());
		list.add(new Programmer01());
		for(Worker01 w:list) {
			w.goWork();
			w.work();
			w.goHome();
		}
		
		
	}

}
abstract class Worker01{
	String with;
	Worker01(String with){ // 하위클래스에서 반드시 생성자 호출하여야한다.
		this.with = with;
	}
	void getWith(){
		return with;
	}
	void goWork() {
		System.out.println(with+" 출근하다");
	}
	void goHome() {
		System.out.println(with+" 퇴근하다");
	}
	// 1. 추상메서드가 1개라도 있으면 추상클래스로 선언하여야한다.
	// 2. 추상메서드는 상속받는 하위 클래스에서 반드시 재정의하여야한다.(안할시 컴파일에러)
	abstract void work();
}

class FireMan01 extends Worker01{
	FireMan01(){
		super("소방관이");
	}
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println(getWith()+" 일하다");
	}
}

class PoliceMan01 extends Worker01{
	PoliceMan01(){
		super("경찰관이");
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println(getWith()+" 일하다");
	}
}

class Programmer01 extends Worker01{
	Programmer01(){
		super("개발자가");
	}
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println(getWith()+" 일하다");
	}
}
   
4. 오라클 설치과정과 설치에 필요한 내용을 기술하세요.
	- client(DB클라이언트) <----> server(DB서버)
	1) oracle xe 11g 검색 후 이전 버전으로 다운로드
		- client : sqlplus 내장
		- server 지원
	2) 다운로드된 파일 압축해제 ==> setup.exe 실행
		- server : 삭제도 어렵고 파일도 크다.
		- xe : 교육용 연습용 버전
			setup.exe 설치/삭제 가능
		- 비밀번호 :
			관리자(admin) system : 계정생성/여러가지 권한 부여 등의 권한을 가질 수 있다.
				1111(tiger)
				접속법 : system/tiger
					   con system/tiger
		- 연습용 계정과 연습용 db
	3) 관리자 비밀번호 1111로 설정 후 설치 진행
	4) C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
	   에 위치한 scott.sql을 복사
	   C:\Users\사용자 에 붙여넣기
	5) 붙여넣기한 파일 메모장으로 실행 후 대문자 TIGER을 2개 모두 tiger로 변경 저장
	6) eclipse에서 Help ==> Marketplace ==> dbeaver 검색 후 21.0.5 설치
		- plugin : dbeaver(client 툴) 유저 인터페이스로 화면 노출시켜준다.
	7) 허용하겠냐는 팝업 뜨면 모두 허용 후 설치완료
	8) 오라클 설치 완료시 
	   C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar	
	   경로의 ojdbc6.jar 복사 후 eclipse의 src>main>webapp>WEB-INF>lib에 붙여넣기
		# jdbc driver 설정 : db 서버에 접속할때 필요한 프로그램 모듈을 자바로 만들어서 처리한 class의 압축판
		- 각 DB 서버회사에서는 이러한 프로그램을 지원한다. @@.jar
		  ex) oracle, ms sql, mysql ...
		  1) 활용
		  	 client 툴 : dbeaver, sql developer
		  	 프로그래밍에 설정(반드시***)
		  2) 위치 : 상단의 해당 폴더에 있음
		  3) client 툴인 : dbeaver에서 사용하기 위하여 설정
	8) 명령 프롬포트 실행
	9) dir /w 하고 엔터해서 scott.sql 있는지 확인
	10) sqlplus 누르고 엔터(sqlplus로 기본 client 서버에 접속) >admin계정인 system/1111 입력 엔터해서 연결여부 확인
	11) @(run : 실행)scott.sql 엔터, conn scott/tiger; 로 연결
	12) select * from emp; 로 데이터베이스 확인
	13) 우측 상단 비버 아이콘 선택
	14) 좌측 상단 데이터베이스 > 새 데이터베이스 연결 > Oracle선택
	15) Database : xe  Username : scott  Password : tiger 설정
	16) 우측 하단 Edit Driver Setting 선택 후 Default User : scott으로 변경,
	17) 상단 Libraries 선택 후 모두 삭제, Add File 버튼 눌러서 복붙했던 ojdbc6.jar 찾아서 열기
	18) Find Class 누르면 2가지 나오는데 driver 포함된 아래꺼로 선택 후 OK
	19) Finish버튼까지 누르면 완성!
	# 정리 #
		0) 툴설치 후, open perspective 설정 dbeaver 클릭
		1) 상단 메뉴에 driver 관리자
		   ==> oracle (edit 버튼)
		   ==> 2번째 탭 libraries에서 jdbc 드라이버를 설정 처리
		2) 상단 메뉴 데이터베이스 ==> 새 데이터베이스 연결
		   프로그램 연결
		   host : ip - localhost(현재 컴퓨터에 서버가 설치되어있을 떄)
		   port - 1521
		   sid - xe
		   계정 - scott
		   비번 - tiger
		   test 연결 확인(꼭 확인해보기)
		3) perspective dbeaver를 선택한 후,
		   왼쪽 목록에 연결된 DB 정보를 확인
		4) sql편집기 ==> 새 sql편집기
		
		SELECT * FROM emp;
		-- 주석문		ctrl + enter를 통해서 실행 처리
		/* 여러줄 주석 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
