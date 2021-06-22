package javaexp.a04_condition;

import java.util.ArrayList;
import java.util.Collections;

public class A08_Loop_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 배열과 반복문
1. 배열의 속성
	1) index : 0부터 시작해서 크기-1 까지 고유번호로 접근할 수 있다.
	2) length : 배열의 크기로 반복문에서 한계치로 설정할 수 있다.
	   ArrayList의 경우 .size() 메서드로 크기를 설정하고 있다.
				*/
		
		String[] names = {"홍길동","김길동","신길동"};
		// 초기값 idx=0 : 배열의 index 시작값으로 접근할 수 있다.
		// idx<name.length : 배열의 index 범위가 크기보다 1 적기 때문에 반복조건으로 설정한다.
		// name[idx] : 각 단위 데이터로 접근을 할 수 있다.
		for(int idx=0;idx<names.length;idx++) {
			System.out.println(idx+1+")"+names[idx]);
		}
/* ex) 학생의 국어 점수를 배열로 처리하여(int [] kors) 반복문을 통해서 출력하세요
	   총점(누적)도 처리하세요 */
		int[] kors = {80, 90,100};
		System.out.println("이름\t성적");
		int sum = 0;
		for(int idx=0;idx<kors.length;idx++) {
			System.out.println(names[idx]+"\t"+kors[idx]);
			sum += kors[idx];
		}
		System.out.println("국어의 총점 : "+sum);
		/*	
# 동적배열인 ArrayList를 활용한 데이터 처리
1. ArrayList<타입설정-클래스> 설정
2. .add(추가될 데이터)
3. .get(가져올 데이터의 index)
4. .size() : ArrayList의 크기			
			*/
		ArrayList<String> flist = new ArrayList<String>();
		flist.add("사과");
		flist.add("바나나");
		flist.add("딸기");
		for(int idx=0;idx<flist.size();idx++) {
			System.out.println(idx+1+":"+flist.get(idx));
		}
		// (int)(Math.random()*배열의 크기); 임의로 대상객체를 선택할 수 있다.
		int ranIdx = (int)(Math.random()*flist.size());
		System.out.println("임의 선택 과일: "+flist.get(ranIdx));
		/*
		ex) 가위 바위 보를 ArrayList<String>에 담아서 출력하고
		임의의 가위 바위 보를 출력 처리하세요.
		*/
		ArrayList<String> game = new ArrayList<String>();
		game.add("가위");
		game.add("바위");
		game.add("보");
		for(int idx=0;idx<game.size();idx++) {
			System.out.println("가위 바위 보 출력: "+game.get(idx));
		}
		int random = (int)(Math.random()*3);
		System.out.println("가위 바위 보 랜덤 출력: "+game.get(random));
		
		/*		
# 클래스로 객체 담기
1. 클래스를 선언 : 필드, 생성자, 메서드 선언
2. ArrayList<클래스명> 참조변수 = new ArrayList<클래스명>();
3. 참조변수.add(new 생성자());
		*/		
		String[] shapes = {"스페이드","하트","클로버","다이아"};
		String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		int tIdx = 0;
		ArrayList<Card> clist = new ArrayList<Card>();
		for(int idx=0;idx<shapes.length;idx++) {
		//	System.out.print("모양 index: "+idx);
			for(int jdx=0;jdx<numbers.length;jdx++) {
			//	System.out.print("숫자 index: "+jdx);
				// ArrayList<VO>객체의 객체 생성과 함께 추가
				clist.add(new Card(shapes[idx],numbers[jdx]));
				// ArrayList<VO> 객체 안에 index 형식으로 객체를 가져오기
				Card d = clist.get(tIdx++); // idx, jdx의 경우의수를 1개의 객체(tIdx)로 할당
				System.out.print(d.show()+"\t");
			}
			System.out.println();
		}
		Collections.shuffle(clist);
		System.out.println("# 카드를 섞은 후, 출력 #");
		for(int idx=0;idx<clist.size();idx++) {
			System.out.println(clist.get(idx).show()+"\t");
			if(idx%7==0) {
				System.out.println();
			}
		}

// ex) Fruit 색상/과일명, 생성자 show()과일명(색상) 리턴처리
//	   과일 3개를 ArrayList<Fruit>에 담고, 출력하세요
		ArrayList<Fruit> frlist = new ArrayList<Fruit>();
		String[] name = {"사과", "모과", "아보카도"};
		String[] color = {"빨강", "노랑", "초록"};
		int tdx = 0;
		
		for(int idx=0;idx<name.length;idx++) {{
			frlist.add(new Fruit(name[idx],color[idx]));
			Fruit f = frlist.get(tdx++); // 출력하려면 여기가 중요하다!
			System.out.println(f.showFru());
			}
		}
		Collections.shuffle(frlist);
		System.out.println("# 임의의 과일 1개 출력 #");
		int ran = (int)(Math.random()*3);
		System.out.println(frlist.get(ran).showFru());
		
		/*		
		답)
		frlist.add(new Fruit("사과","빨강"));  // 이렇게도 된다.		
		for(int idx=0;idx<frlist.size();idx++){
			sysout(frlist.get(idx).show()+"\t");
		}
		sysout();
		int ran = (int)(Math.random()*frlist.size());
		sysout(frlist.get(ran).show());
		
		*/	}

}
