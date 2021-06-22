package javaexp.a00_exp.a05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javaexp.z01_vo.Fruit;
import javaexp.a00_exp.Student;


public class A07_0511 {
	
	public static void main(String[] args) {
	// 모양별로 번호 13만들면 총카드가 52개가 ArrayList<Card>가 만들어 진다.
	
	
	
	
		// TODO Auto-generated method stub
		
		
/*#정리문제
1.	추상클래스와 하위객체 배열형식을 선언하고,
	상위객체로 Worker 공통: 출/퇴근, working()오버라이딩, 하위 PoliceMan,
	FireMan, Programmer 로 처리하여, 배열로 처리하고,
	for문을 통해서 출/퇴근 working()메서드를 처리하세요.
	
	abstract class Worker{
	private String kind;
	public Worker(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
	return kind;
}
	// 공통 기능 메서드
	public void goWork() {
	System.out.println(kind+"출근하다");
}
// 추상 메서드..
public abstract void working(); //상속받은 내용들 오버라이딩 해서 쓴다.
public void goHome() {
	System.out.println(kind+"퇴근하다");
}
}
// 상속은 상위에 생성자를 선언하여야 한다.
class PoliceMan extends Worker{ 
	public PoliceMan() {
	super("경찰관");
	// super("매개값") : 상속시, 상위의 선언된 생성자를
	// 반드시 하위에서는 선언하여야 한다.
	
	// TODO Auto-generated constructor stub
}
	// 하위에 있는 클래스는 상위 추상메서드를 반드시
	// 재정의 하여야 한다.
	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"치안을 유지하다.");
	}
}
class FireMan extends Worker{
	public FireMan() {
	super("소방관");
	// TODO Auto-generated constructor stub
}
	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println(getKind()+"불을 끄다.");
	}

}
class Programmer extends Worker{
public Programmer() {
	super("프로그래머");
	// TODO Auto-generated constructor stub
}
@Override
public	void working() {
	// TODO Auto-generated method stub
	System.out.println(getKind()+" 소프트웨어 개발을 하다");
		}
	}			
public class A07_0511 {
	
	
	public static void main(String[] args) {
		
	Worker[]arry = {new PoliceMan(), new FireMan(), new Programmer()};
	for(Worker w:arry) {
		w.goWork();
		w.working();
		w.goHome();		
		}
	}
}

2.	Collection 하위의 핵심 interface의 특성을 기술하세요.	
	Set : 중복허용하지 않음, 순서확보 안됨.
	List : 중복허용, 순서확보
	MAP : key 중복허용하지 않음, 순서확보 안됨
	
3.	set 하위 객체를 통해 항아리에 담긴 여러 색상의 과일(Fruit(종류,색상))
	을 담고 출력처리하세요.
	1) 1단계 과일명/색상 (문자열처리)
	*/
//		Set<String> setStr = new HashSet<Sting>();
//		setStr.add("사과(빨강)");
//		setStr.add("사과(녹색)");
//		setStr.add("키위(초록)");
//		setStr.add("키위(초록)");
//		setStr.add("키위(초록)");
//		setStr.add("파인애플(초록)");
//		for(String str:setStr) {
//			System.out.println(str);
//		}
//		Set<Fruit> setFru = new HashSet<Fruit>();
//		setFru.add(new Fruit("사과","빨강"));
//		setFru.add(new Fruit("사과","녹"));
//		setFru.add(new Fruit("키위","초록"));
//		setFru.add(new Fruit("키위","노랑"));
//		for(Fruit f:setFru) {
//			f.show();
//		}
 		/*
	2) 2단계 : 객체처리 (어려움)
			1) set 인터페이스 하위 객체
			순서가 확보되지 못하고 중복으로 허용하지 못한다.
		2) List 인터페이스 하위 객체
			순서를 index에 의해 확보가 되고,
			다양한 기능메서드를 통해서 데이터를 처리하고 있다.
			add(추가)
			add(index, 추가) : 특정 위치 이후에 추가
			set(index, 변경) : 특정 위치에 변경.
			get(index) : 특정 위치에 데이터 가져오기.
			remove(index ) : 특정 위에 데이터 삭제..
			size() : 해당 list객체의 크기..
		3) Map 인터페이스 하위 객체
			key, value 형식의 데이터를 할당하여 중복되지 
				않는 key를 기준으로 데이터를 처리할 수 있다.
			put("key", value객체); // key, value값 할당.
			keySet() : Set객체로 전체 중복되지 않는 key를 가져올 수 있다.
			get(키값) : map 객체에 포함된 key에 해당하는 값을 가져올 수 있다. 
	
4. List 하위 객체로 반복문을 이용하여,
	1) 선택1 학생 5명의 이름 국어,영어,수학 속성을 ArrayList<Student>객체
	담아서 출력하시오
	*/
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("홍길동", "70", "80", "90"));
		slist.add(new Student("김길동", "100", "80", "90"));
		slist.add(new Student("신길동", "90", "85", "90"));
		slist.add(new Student("마길동", "90", "90", "90"));
		for(Student st:slist) {
		System.out.println(st.getName()+"\t");
		System.out.println(st.getKor()+"\t");
		System.out.println(st.getEng()+"\t");
		System.out.println(st.getMath()+"\t");	
	}
		/*
	2) 선택2 Card의 속성(모양,번호)로 설정하여 ArrayList<Card>에 담고,
		A팀 : 카드 7장 임의 ♠7, ♥A, ♥J
		B팀 : 카드 7장 임의 출력
		*/	
		String []shapes= {"♠","♥","◆","♣"};
		String []numbs = {"A","2","3","4","5","6",
					"7","8","9","10","J","Q","K",};
		ArrayList<Card> list = new ArrayList<Card>();
		for(String s:shapes) {
			for(String n:numbs) {
				list.add(new Card(s,n));
		}
	}
		// 모양별로 번호 13만들면 총카드가 52개 ArrayList<Card>가 만들어 진다.
		
		// 중복 허용 로직..
		System.out.println("# 중복 허용 처리 #");
		// 7장씩 총 14개
		for(int cnt=1;cnt<=14;cnt++) {
			// 0~52 까지 임의의 index번호를 호출..
			int ranIdx = (int)(Math.random()*list.size());
			if(cnt<=7) {
				if(cnt==1) {System.out.print("A팀:");}
				// list.get(ranIdx) : 임의의 ArrayList안에 있는 Card 객체.
				// .show()
				if(cnt==8) {System.out.print("\nB팀");}
				list.get(ranIdx).show();
			}
		}
		System.out.println("\n# shuffle #");
//		Collections.shuffle(리스트형객체)
//		리스트형객체를 순서를 임의로 섞어주는 역할을 한다.
		Collections.shuffle(list);
		
		for(int cnt=1;cnt<=14;cnt++) {
			if(cnt<=7) {
				if(cnt==1) {System.out.println("A팀:");}
			}else {
				if(cnt==8) {System.out.println("\nB팀:");}
				list.get(cnt-1).show();
				}
			}
			
		
		
		
		/*
		
		Collections.shuffle(list);
		
		for(int cnt=1;cnt<=14;cnt++) {
			if(cnt<=7) {
				if(cnt==1) {System.out.print("A팀:");}
				list.get(cnt-1).show();
			}else {
				if(cnt==8) {System.out.print("\nB팀:");}
				list.get(cnt-1).show();
				}
			}
		
5. Map 하위의 기능 메서드를 기술하세요
		put("Key", value객체) : Key와 value값을 할당 처리..
		get(키값) : Key에 해당하는 값을 가져와서 처리한다.
		
	Map<String,String> map =new Hashtable<String, String>();
	map.put("String", "String");
	map.put("String", "String");
	map.put("String", "String");
	System.out.println("Map의 name값:"+map.get("String");
	System.out.println("Map의 name값:"+map.get("String");
	System.out.println("Map의 name값:"+map.get("String");
	
6. InputStream 기본 형식과 메서드를 기술하세요.
	InputStream is = null;
	is = System.in;
	InputStream을 통해서 입력된 객체를 할당.
	read() : 1byte의 char타입 문자를 읽는다.
	new BufferedReader(new InputStreamReader(System.in));
	InputStreamReader : 2byte이상 문자열을 처리
	BufferedReader : line별로 입력 처리.

7. char를 code값을 이용해서, 숫자+알파벳이 섞인 임시비밀번호 7자리를 만들어 출력하세요.
		*/
		String pass=""; // 48~57(10), 65~90(26), 97~122(26)
		for(int cnt=1;cnt<200;cnt++){
			System.out.println(cnt+":"+(char)cnt);
	}
		// #임의의 나오는 수에 대한 코드값의 변경..
		// 48 ~ 57 : 그대로 ==> 48 ~ 57
		// 58 ~ 84 : +8 ==> 65 ~ 90
		// 85 ~ 111 : + 12 ==> 97~122
		for(int cnt=1;cnt<=7;cnt++) {
			// 총 62가지의 경우의 수, 48부터 시작...
			int code = (int)(Math.random()*62+48);
			if(code>=85) code+=12;
			else if(code>=58) code+=8;
			pass+=(char)code;
		}
		System.out.println("임의 비밀번호:"+pass);
	
	

//8. Scanner 객체를 이용하여 프로야구 선수(Player) 3명의 이름과 성적을 입력하고, 출력처리하세요.
		ArrayList<Player> plist = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);
		for(int cnt=1;cnt<=3;cnt++) {
			System.out.println("##" +cnt +"번째 선수 정보 등록 ##");
			System.out.println("이름을 입력하세요:");
			String name = sc.nextLine();
			System.out.println("성적을 입력하세요:");
			String record = sc.nextLine();
			plist.add(new Player(name,record));
		}
		System.out.println("# 입력된 데이터 #");
		for(Player p:plist) {
			p.show();
		}


	}
}



class Player{
	private String name;
	private String record;
	public Player(String name, String record) {
		super();
		this.name = name;
		this.record = record;
	}
	public void show(){
		System.out.println(name+"\t"+record);
	}
}
//
//
//
class Card{
	private String shape;
	private String number;
	public Card(String shape, String number) {
		super();
		this.shape = shape;
		this.number = number;
	}
	public void show() {
		System.out.print(shape+number+"\t");
			}
	}




		
