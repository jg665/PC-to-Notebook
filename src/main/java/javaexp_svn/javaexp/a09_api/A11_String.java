package javaexp.a09_api;

import java.io.UnsupportedEncodingException;

public class A11_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# String
1. 문자열 처리 객체
2. 생성자로 byte[]을 받아서 처리				
				*/
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(bytes);
		System.out.println("출력:"+str1);
		
		for(int code=64;code<=128;code++) {
			System.out.println(code+":"+(char)code);
		}
		
		System.out.println((int)'d'); // 유니코드값 확인 가능!
		
// ex) 위와같이 byte 배열과 유니코드값을 이용해셔 Good job을 출력하세요.
		byte[] bytes2 = {71, 111, 111, 100, 32, 106, 111, 98};
		String str2 = new String(bytes2);
		System.out.println("출력: "+str2);
		
		/*	
3. 여러가지 기능 메서드	
	1) charAt(index) : 특정 index 위치에 있는 문자를 리턴받는다.
				*/
		String name = "himan";
		System.out.println("charAt(2): "+name.charAt(2));
		
// ex) 주민번호를 문자열러 지정해서, 특정 위치에 있는 문자를 가져올때
//		1,3은 남자, 2,4는 여자로 표기하세요.
		String ssn = "010624-1230123";
		char gender = ssn.charAt(8);
		// switch(문자/문자열) 도 가능
		switch(gender) {
			case '1': //break가 없어 계속 밑으로
			case '3':
				System.out.println("남자");
				break;
			case '2': //break가 없어 계속 밑으로
			case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("해당 범위는 [1~4]까지 입니다.");
		}
		int num = 1;
		System.out.println("1의 코드값: "+(char)num);

	/*
	2) getBytes() : 문자열의 byte배열을 가져온다.
		이때, 매개변수값으로 EUC-KR이나 UTF-8로
		한글 encoding형식을 지정할 수 있다.	
		*/
		String str3 = "반가워요";
		byte[] bytes3 = str3.getBytes();
		String str4 = new String(bytes3);
		System.out.println("문자열 4번째: "+str4);
		try {
			byte[] bytes4 = str3.getBytes("EUC-KR");
			// encoding하려면 try,catch 필수로 해야한다.
			String str5 = new String(bytes4);
			System.out.println("문자열 5번째: "+str5);
			byte[] bytes5 = str3.getBytes("UTF-8");
			String str6 = new String(bytes5);
			System.out.println("문자열 6번째: "+str6);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// ex) 오늘도 즐겁고 감사한 하루!! encoding 으로 euc-kr과 utf-8로 처리하여 출력하세요
		String str7 = "오늘도 즐겁고 감사한 하루!";
		try {
			byte[] bytes6 = str7.getBytes("EUC-KR");
			String str8 = new String(bytes6);
			System.out.println("EUC-KR 인코딩: "+str8);
			byte[] bytes7 = str7.getBytes("UTF-8");
			String str9 = new String(bytes7);
			System.out.println("UTF-8 인코딩: "+str9);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
