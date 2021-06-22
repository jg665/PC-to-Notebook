package javaexp.a10_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javaexp.z01_vo.Product;

public class A05_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# Map인터페이스 하위객체
1.	key, value 형식의 구조를 가진 collection 객체
	 key : 식별자
	 value : 객체
	 put(K,V) : 형식으로 저장처리
	 keySet() : 저장되어 있는 key들을 Set형식으로 리턴
	 get(K) : 결과로 Value값을 가져오는 처리.
2.	key값은 중복을 허용하지 않음.
3.	value는 단일 데이터, 객체/배열도 할당이 가능하다.

 */
		Map<String, Integer> 
			map = new HashMap<String,Integer>();
		// Map<String, Integer> : key는 문자열
		//	value는 Integer Wrapper를 선언하여 처리.
		//	put(key, value값 설정)
		//		value값은 wrapper이기에 기본유형으로 boxing처리 가능
		map.put("김길동", 80);
		map.put("신길동", 89);
		map.put("신길동", 92);
		map.put("오길동", 85);
		map.put("김길동", 87);
		System.out.println("map의 크기:"+map.size());
		// map의 크기 : 3 
		// map의 key 가져오기.. : map.keySet()
		Set<String> keySet= map.keySet();
		for(String key:keySet) {
			// 맵객체.get("키") : value를 가져오기.
			// 할당된 최종값을 가져온다.
			System.out.println(key+":"+map.get(key));
			//신길동:92 김길동:87 오길동:85 변경된 최종값 가진다.
		}
// ex) 물건명과 가격을 key/value형식으로 설정하고,
//		중복처리도 한 후, 반복문으로 통해 최종 결과값을 출력하세요.
//		1조
		Map<String, Integer>
		Product = new HashMap<String,Integer>();
		Product.put("사과", 1500);
		Product.put("사과", 1700);
		Product.put("딸기", 15000);
		Product.put("딸기", 25000);
		Product.put("오렌지", 2500);
//			System.out.println("Product의 크기 : "+ product.get(key));
		Set<String> keySet1= Product.keySet();
		for(String key:keySet1) {
			System.out.println(key+":"+Product.get(key));
		}
		// Map<정수형Wrapper, 객체>
		// 정수형Wrapper를 활용하여, boxing, unboxing 처리
		// 번호 순서로 데이터가 자동 저장
		// 최종값을 기준으로 value객체를 저장되어 중복을 허용하지 않는다.
		
		Map<Integer, Product> 
		pMap = new HashMap<Integer, Product>();
		// autuboxing 처리로 key값은 기본 정수가 Integer에 할당 처리.
		pMap.put(1003, new Product("오렌지",2000,3));
		pMap.put(1002, new Product("딸기",12000,2));
		pMap.put(1000, new Product("사과",3000,2));
		pMap.put(1001, new Product("바나나",4000,3));
		pMap.put(1002, new Product("수박",15000,5));
		// Integer 순서로 나열된다.
		Set<Integer> proKey = pMap.keySet();
		// unboxing처리..
		for(int code:proKey) {
			// int 정수타입변수 = new Integer("입력값"); 
			System.out.print(code+"\t");
			// key값 기준으로 연결되어 있는 value 객체를 가져오고 있다.
			Product p = pMap.get(code);
			System.out.print(p.getName()+"\t");
			System.out.print(p.getPrice()+"\t");
			System.out.println(p.getCnt());
		}
	}

}
