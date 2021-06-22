package javaexp.a10_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javaexp.a05_object.vo.Product;
import javaexp.z01_vo.Food;

public class A02_Basic {
	/*
# 배열객체의 한계와 collection 객체
1. 배열은 한번 크기가 설정이 되어 만들어지면, 배열의 크기를 동적으로 변경이 불가능하다.
	새로운 메모리로 배열을 다시 만들어야하는 단점이 있다.
2. java에서는 이러한 배열형에 대한 동적인 구조를 처리하기 위해 3가지 형태의 기본적인 데이터처리 구조를 만들어 사용한다.
3. Collection 객체 3가지
	1) Set 인터페이스 하위 객체
		순서가 확보되지 못하고 중복을 허용하지 못한다.
	2) List 인터페이스 하위 객체
		순서가 index에 의해 확보가 되고,
		다양한 기능메서드를 통해서 데이터를 처리하고 있다.
		add(추가)
		add(index, 추가) : 특정 위치 이후에 추가
		set(index, 변경) : 특정 위치에 변경
		get(index) : 특정 위치의 데이터 가져오기
		remove(index) : 특정 위치의 데이터 삭제
		size() : 해당 list객체의 크기
	3) Map 인터페이스 하위 객체
		key, value 형식의 데이터를 할당하여 중복되지 않는 key를 기준으로 데이터를 처리할 수 있다.
		put("key", value 객체); // key, value값 할당
		keySet(); Set 객체로 전체 중복되지 않는 key를 가져올 수 있다.
		get(키값) : map 객체에 포함된 key에 해당하는 값을 가져올 수 있다.
		
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new HashSet();
		set.add("사과");
		set.add("바나나");
		set.add("오렌지");
		set.add("바나나");
		set.add("오렌지");
		set.add("바나나");
		set.add("오렌지");
		set.add("수박");
		System.out.println("set 구조 확인:"+set); // 중복 사라지고 순서도 변경됨
		
		List lst = new ArrayList(); //java.util꺼로 선택
		lst.add("오렌지");
		lst.add("오렌지");
		lst.add("바나나");
		lst.add("수박");
		lst.add("키위");
		System.out.println("list 구조 확인: "+lst); // 중복 그대로, 순서도 그대로
		
		// ex) 좋아하는 음료를 List객체로 입력하여 구조를 확인하세요.
		// ctrl+shifh+o : 자동 import 단축키
		List drink = new ArrayList();
		drink.add("보이차");
		drink.add("녹차");
		drink.add("물");
		drink.add("두유");
		drink.add("두유");
		drink.add("아메리카노");
		System.out.println("좋아하는 음료: "+drink);
		
		// .size()를 통해서 크기 설정 
		// 특정한 경우에 lst.set(위치, 변경할데이터) 로 데이터 변경 가능
		lst.set(0, "망고");
		// lst.remove(삭제할인덱스) 로 데이터 삭제 가능
		lst.remove(lst.size()-1); // 크기-1 : 마지막 데이터 = 키위 삭제됨
		// lst.add(위치, 특정위치에 추가)
		lst.add(0, "사과");
		for(int idx = 0;idx<lst.size();idx++) {
			// .get()를 통해서 단위 데이터를 가져올 수 있다.
			System.out.println(idx+1+":"+lst.get(idx));
		}
		
		// ex) 음료 list 내용을 3번쨰 위치에 추가,
		//		첫번째 위치의 음료 삭제, 4번째 위치에 음료 수정하여 전체 데이터리스트 출력 처리
		drink.add(2,"홍차");
		drink.remove(0);
		drink.set(3, "아몬드밀크");
		for(int idx=0;idx<drink.size();idx++) {
			System.out.println(idx+1+":"+drink.get(idx));
		}
		// 객체 단위로 데이터 추가 변경
		// ArrayList로 generic으로 Product 객체만 할당할 수 있다.
		// List 객체 선언.
		List<Product> plist = new ArrayList<Product>();
		// 객체 단위로 추가
		plist.add(new Product("사과", 3000, 2));
		plist.add(new Product("바나나", 4000, 5));
		plist.add(new Product("오렌지", 2000, 5));
		plist.add(new Product("수박", 13000, 3));
		plist.add(new Product("키위", 2000, 13));
		plist.set(0, new Product("참외",2000,5));
		// remove(), add(위치, 객체생성);
		for(Product p:plist) {
			//p.buy();
			System.out.print(p.getName()+"\t");
			System.out.print(p.getPrice()+"\t");
			System.out.print(p.getCnt()+"\n");
		}
		
		// ex) Food 객체를 ArrayList로 객체 3개를 생성하여 담고,
		//		해당 내용을 출력하세요
		// List<Food> : 리스트 객체에 기본 데이터 유형인 Object
		// 에서 특정한 데이터 유형 Food만 구성요소로 들어올 수 있게하여
		// 반복문에서 typecasting 없이 바로 객체를 사용할 수 있게 한다.
		List<Food> foList = new ArrayList<Food>();
		foList.add(new Food("까르보나라", 9000, "반포동"));
		foList.add(new Food("샐러드", 12000, "서초동"));
		foList.add(new Food("감바스", 14000, "연희동"));
		System.out.println("좋아하는 음식\t가격\t장소");
		for(Food fd:foList) {
			System.out.print(fd.getName()+"\t\t");
			System.out.print(fd.getPrice()+"\t");
			System.out.print(fd.getLoc()+"\n");
		}
		// Map<key유형, value유형> : 이 위치에 객체가 올 수도 있다.
		Map<String,String> map = new Hashtable<String, String>();
		map.put("name", "홍길동");
		map.put("age", "25");
		map.put("loc", "서울신림동");
		System.out.println("Map name 값: "+map.get("name"));
		System.out.println("Map age 값: "+map.get("age"));
		System.out.println("Map loc 값: "+map.get("loc"));
		
		// ex) 물건명, 가격, 갯수를 key로 하고 해당 값을 value로 하여 할당 후 출력하세요
		Map<String, String> map2 = new Hashtable<String, String>();
		map2.put("bang", "방성원");
		map.put("pname", "가위");
		map.put("price", "2000");
		map.put("cnt", "5");
		System.out.println("물건명\t가격\t갯수");
		System.out.println(map.get("pname")+"\t"+map.get("price")+"\t"+map.get("cnt"));
		
	}

}
