package javaexp.a00_exp;

import java.io.InputStream;
import java.util.Scanner;

public class A07_0511 {
/*
1. 추상클래스와 하위객체 배열형식을 선언하고,
   상위추상클래스로 Worker 공통: 출/퇴근, working() 오버라이딩, 하위 PoliceMan, FireMan, Programmer로 처리하여, 배열로 설정
   for문을 통해서 출/퇴근 working() 메서드를 처리하세요.
	- 배열형식 : 추상클래스명[] 변수 = {new 하위클래스명1(), new 하위클래스명2(), new 하위클래스명3()};
	
	Worker[] work = {new PoliceMan(), new FireMan(), new Programmer()};
	for(Worker w:work) {
		w.goWork();
		w.working();
		w.goHome();
	}	
-----------------------------------main() 바깥 -------------	
	abstract class Worker {
	
	추가 답))
	// private String kind 넣고 소스의 - 필드 삽입,
	// getKind 메서드 소스로 넣으면
	// 상속은 상위에 생성자를 선언해야하기 때문에 하위 클래스들 에러남
	// 하위 생성자 첫줄에 모두
	// public PoliceMan(){super("경찰관");}
	// super("매개값") : 상속시, 상위에 선언된 생성자를 반드시 하위에서 선언해야하기 때문에 넣는 것.
	// 넣을때 PoliceMan(String kind) 로 뜨는데 파라미터값 삭제
	// 그리고 super()에 값을 넣고, 아래 추상메서드에 getkind()+ 추가해주면
	// super값과 함께 다 출력됨.
	 * 하위에 어떤 클래스가 출력되고있는지 구분할 수 있게됨!
	
	
	// 공통 기능메서드를 넣고

	void goHome() {
		System.out.println("퇴근");
	}
	void goWork() {
		System.out.println("출근");
	}
	// 추상 메서드 포함
	abstract void working();
}

class PoliceMan extends Worker {
	@Override
	void working() {
		System.out.println("치안을 유지하다.");
	}
}
class FireMan extends Worker {
	@Override
	void working() {
		System.out.println("불을 끄다.");
	}
}
class Programmer extends Worker {
	@Override
	void working() {
		System.out.println("코딩을 짜다.");
	}
}

2. Collection 하위의 핵심 interface의 특성을 기술하세요.
	- Set 인터페이스 하위 객체 : 중복 미허용, 순서확보 X
	- List 인터페이스 하위 객체 : 중복 허용, 순서확보 O, 빠른 속도
							 다양한 기능메서드로 데이터 처리한다.
	  						 add(추가)
							 add(index, 추가) : 특정 위치 이후에 추가
							 set(index, 변경) : 특정 위치에 변경
							 get(index) : 특정 위치의 데이터 가져오기
							 remove(index) : 특정 위치의 데이터 삭제
							 size() : 해당 list객체의 크기
	- Map 인터페이스 하위 객체 : key, value 형식으로 데이터가 저장되는 구조. key는 중복 미허용, 순서확보 X
	
3. Set 하위객체를 통해 항아리에 담긴 여러 색상의 과일(Fruit(종류, 색상))을 담고 출력하세요.
		
		Set<Fruits> ft = new HashSet<Fruits>();
		ft.add(new Fruits("딸기","빨강"));
		ft.add(new Fruits("바나나","노랑"));
		ft.add(new Fruits("아보카도","초록"));
		System.out.println("과일종류\t색상");
		for(Fruits f:ft) {
			System.out.println(f.getName()+"\t"+f.getKind());
		}
		
		
		답)) String으로 하는 법 / 위는 객체로 하는 법
		Set<String> setStr = new Hastset<String>();
		setStr.add("사과(빨강)");
		setStr.add("사과(녹색)");
		setStr.add("키위(초록)");
		setStr.add("사과(빨강)");
		setStr.add("사과(빨강)");
		setStr.add("파인애플(초록)");
		for(String str:setStr) {
			System.out.println(str);
		}
		
4. List 하위 객체로 반복문을 이용하여,
	1) 선택1 학생 5명의 이름 국어, 영어, 수학 속성을 ArrayList<Student> 객체 담아서 출력하기
	List<Student> student = new ArrayList<Student>();
	student.add(new Student("홍홍홍", 90, 100, 80));
	student.add(new Student("김김김", 100, 100, 90));
	student.add(new Student("신신신", 50, 90, 100));
	student.add(new Student("박박박", 100, 80, 60));
	student.add(new Student("양양양", 95, 70, 100));
	System.out.println("학생이름\t국어성적\t영어성적\t수학성적");
	for(Student s:student) {
		System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMath());
	}

	2) 선택2 Card의 속성(모양,번호)을 설정하여 ArrayList<Card>에 담고,
		A팀 : 카드 7장 임의 ♠️7, ♥A, ♥J
		B팀 : 카드 7장 임의 출력
		// 중복배제 알고리즘까지 처리 가능!
		
		모르겠습니다 ㅠㅠㅠ..
		
		List<Card> card = new ArrayList<Card>();
		System.out.print("A팀 :");
		card.add(new Card("♠️", "1"));
		card.add(new Card("♥", "2"));
		card.add(new Card("♣", "3"));
		card.add(new Card("◆", "A"));
		
		답))
		// 클래스 생성
		class Card{
			private String shape;
			private String number;
			public Card(String shape, String number){
				super();
				this.shape = shape;
				this.number = number;
			}
			public void show() {
				System.out.print(shape+number+"\t");
			}
		}
		
		// 필드
		String[] shapes = {"♠️","♥","♣","◆"}
		String[] numbs = {"A", "J", "Q","1","2","3","4","5","6","7","8","9","10"}
		// 모양별로 번호 13개를 만들면 총카드가 52개가 ArrayList<Card>에 만들수 있다.
		
		ArrayList<Card> list = new ArrayList<Card>();
		// 이중 for문 사용 - shapes와 numbs의 Each (모든 경우의 수를) 처리
		for(String s:shapes){
			for(String n:numbs){
				list.add(new Card(s,n)); // String에 담은 52장의 카드들을 Card 클래스에 넣음
			}
		}
		
		// 중복허용 로직
		for(int cnt=1;cnt<=14;cnt++){
			//0~52까지 임의의 index 번호 호출
			int ranIdx = (int)(Math.random()*list.size());
			if(cnt<=7){
				if(cnt==1) {System.out.println("A팀: ");}
				// list.get(ranIdx) : 임의의 ArrayList안에 있는 특정한 Card 객체
				// ArrayList<Card>의 list 중 ranIdx 위치의 카드를 .show() 한다는 뜻
				list.get(ranIdx).show();
			}else{
				if(cnt==8){System.out.println("\nB팀: ");}
				list.get(ranIdx).show();
			}
		}
		
		// 중복미허용 로직 = Collections.shuffle(리스트형 객체)
		 * 리스트형객체의 순서를 임의로 섞어주는 역할을 한다.
		Collections.shuffle(list);
		
		for(int cnt=1;cnt<=14;cnt++){
			if(cnt<=7){ // 7까지 카운트 갔을때 실행 = 각 7장씩 준다는 뜻
				if(cnt==1) {System.out.print("A팀: ");} // 1장 줬을때 출력
				list.get(cnt-1).show(); // 인덱스 값이 0부터 시작이기 때문에 -1 처리 (7장까지 반복해서 카드 출력하는 내용)
			}else{ // 8부터 B팀을 7장 준다는 뜻
				if(cnt==8) {System.out.print("\nB팀: ");} // 8장 줬을때 출력
				list.get(cnt-1).show();
			}
		
		}
		
		
		
		
5. Map 하위의 기능 메서드를 기술하세요
	- put("key", value객체) : key와 vlaue값을 할당처리
	- get(키값) : map 객체에 포함된 key에 해당하는 값을 가져올 수 있다.
	- keySet(); Set 객체로 전체 중복되지 않는 key를 가져올 수 있다.
	
6. InputStream 기본 형식과 메서드를 기술하세요.
	- InputStream is = System.in;
	is.read();
	is.close();
	
	답)) 
	InputStream is = null;
	is = System.in;
	InputStream을 통해서 입력된 객체를 할당
	read() : 1byte의 char타입 문자를 읽는다.
	new BufferedReader(new InputStreamReader(System.in)));
	InputStreamReader : 2byte 이상 문자열을 처리
	BufferedReader : line별로 입력 처리
	
	
7. char를 code값을 이용해서, 숫자+알파벳이 섞인 임시비밀번호 7자리를 만들어 출력하세요.
		InputStream is = System.in;
		
		String passStr = "";
		String passNum = "";
		for(int cnt=1;cnt<=4;cnt++) {
			int num = (int)(Math.random()*10+48);
			int str = (int)(Math.random()*26+65);
			passStr += (char)str;
			passNum += (char)num;
		}
		System.out.println("생성된 임시비번:"+passStr+passNum);
		
		답))
		String pass = ""; //48~57(10), 65~90(26), 97~122(26)
		for(int cnt=1;cnt<200;cnt++) {
		 System.out.println(cnt+":"+(char)cnt);
		} // 코드값 어떻게 되어있는지 출력
		
		// 임의의 나오는 수에 대한 코드값 변경
		// 48~57 : 그대로 ==> 48~57
		// 58~84 : +8 ==> 65~90
		// 85~111 : +12 ==> 97~122
		for(int cnt=1;cnt<=7;cnt++) {
			int code = (int)(Math.random()*62+48); //48부터 시작하는 62가지의 경우의 수
			if(code>=85) code+=12; //97부터라는 뜻
			else if(code>=58) code+=8; // 65부터라는 뜻
			pass += (char)code;
		}
		System.out.println("임의 비밀번호: "+pass);
			
8. Scanner 객체를 이용하요 프로야구 선수(Player) 3명의 이름과 성적을 입력하고, 출력처리하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("프로야구 선수 성적");
		System.out.print("1번 선수 이름: ");
		String name1 = sc.nextLine();
		System.out.print("2번 선수 이름: ");
		String name2 = sc.nextLine();
		System.out.print("3번 선수 이름: ");
		String name3 = sc.nextLine();
		System.out.print(name1+" 선수 성적: ");
		int score1 = sc.nextInt();
		System.out.print(name2+" 선수 성적: ");
		int score2 = sc.nextInt();
		System.out.print(name3+" 선수 성적: ");
		int score3 = sc.nextInt();
		System.out.println("선수명\t성적");
		System.out.println(name1+"\t"+score1);
		System.out.println(name2+"\t"+score2);
		System.out.println(name3+"\t"+score3);
	
	
		답)
		// 먼저 객체 생성
		class Player{
			private String name;
			private String record;
			public Player(String name, String record){
				super();
				this.name = name;
				this.record = record;
			}
			public void show(){
				System.out.println(name+"\t"+record);
			}
		}
		
		// 필드
		ArrayList<Player> plist = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성
		for(int cnt=1;cnt<=3;cnt++){ //3명 반복예정이기 때문에 for반복문 활용
			System.out.println("## "cnt+"번째 선수 ##");
			System.out.print("이름을 입력하세요: ");
			String name = sc.nextLine();
			System.out.print("성적을 입력하세요: ");
			String record = sc.nextLine();
			plist.add(new Player(name,record)); // 데이터를 배열로 등록 = show()메서드 사용할 예정이기 때문
		}
		System.out.println("# 입력된 데이터 #")
		for(Player p:plist) {
			p.show(); // 각 3명의 데이터 반복문으로 출력 진행
		}
	
	
* */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("프로야구 선수 성적");
		System.out.print("1번 선수 이름: ");
		String name1 = sc.nextLine();
		System.out.print("2번 선수 이름: ");
		String name2 = sc.nextLine();
		System.out.print("3번 선수 이름: ");
		String name3 = sc.nextLine();
		System.out.print(name1+" 선수 성적: ");
		int score1 = sc.nextInt();
		System.out.print(name2+" 선수 성적: ");
		int score2 = sc.nextInt();
		System.out.print(name3+" 선수 성적: ");
		int score3 = sc.nextInt();
		System.out.println("선수명\t성적");
		System.out.println(name1+"\t"+score1);
		System.out.println(name2+"\t"+score2);
		System.out.println(name3+"\t"+score3);
		
		
		/*
		List<Card> card = new ArrayList<Card>();
		System.out.print("A팀 :");
		card.add(new Card("♠️", "1"));
		card.add(new Card("♥", "2"));
		card.add(new Card("♣", "3"));
		card.add(new Card("◆", "A"));
		for(int cnt=0;cnt<=6;cnt++) {
			int idx = (int)(Math.random()*4);
			card[cnt].getShape();
		}
		
	}
		System.out.print("A팀 :");
		for(int idx=0;idx<=6;idx++) {
			for(Card c:card) {
				int cnt = (int)(Math.random()*4);
				int cnt2 = (int)(Math.random()*4);
				System.out.println(c.getShape(cnt)+c.getNum(cnt2));
			}
		} */
	

	}
}
abstract class Worker {
	void goHome() {
		System.out.println("퇴근");
	}
	void goWork() {
		System.out.println("출근");
	}
	abstract void working();
}

class PoliceMan extends Worker {
	@Override
	void working() {
		System.out.println("치안을 유지하다.");
	}
}
class FireMan extends Worker {
	@Override
	void working() {
		System.out.println("불을 끄다.");
	}
}
class Programmer extends Worker {
	@Override
	void working() {
		System.out.println("코딩을 짜다.");
	}
}
