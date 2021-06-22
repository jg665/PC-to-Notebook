package javaexp.a11_io;

import java.io.IOException;
import java.io.InputStream;

public class A01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 데이터의 전송을 처리하는 Stream				
1. 자바에서는 Stream이라는 api 객체를 통해서 데이터를 입력하거나 출력을 하는 등의 처리를 하고 있다.
	파일의 데이터를 입출력 / 파일 자체를 전송
	System.in 자바에서 InputStream으로 console 창에서 데이터를 입력할때 사용되는 객체
2. System.out.println() 기본적인 자바의 OutputStream을 통해서 cosole 화면에 출력되게 한다.
3. 입력 처리를 하는 InputStream!!!
	데이터 처리 -- 정수형(int) -- char -- 문자열 -- 객체(파일) 순서로 전환
	1) 주요메서드
		read() : 문자(char) ==> code값으로 연결되어있어서, 저장되는 것은 정수형이라고 할 수 있다.
				 이것을 char(캐릭터)로 코드값과 연결되어있는 문자로 표현하여 처리한다.
				
				*/
		int codeValue = 65;
		char char01 = (char)codeValue;
		System.out.println("65유니코드 값: "+char01);
		for(int num=1;num<=256;num++){
			System.out.println(num+":"+(char)num);
		}
		// 자동비밀번호 생성. 임의의 대문자 4자리 (65~90 : 대문자, 97~122 : 소문자, 48~57 : 숫자, 33~47, 58~64 : 특수기호)
		String pass = "";
		for(int cnt=1;cnt<=4;cnt++) {
			int num = (int)(Math.random()*10+48);
			pass += (char)num;
		}
		System.out.println("생성된 임시비번:"+pass);
		
		char c01 = 'A'; // char는 ''로 1글자만 입력할 수 있다.
		// char이 모여서 된 배열이 String(문자열) 타입으로, 객체로 만들어진다. 
		System.out.println("문자:"+c01);
		System.out.println("코드값:"+(int)c01);
		
		// import = ctrlshifto 이거 하면 바로 삽입됨
		InputStream is = null;
		
		System.out.println("데이터를 입력하세요(문자 한자)!!");
		// console 창에서 입력받을 수 있는 객체는 System.in
		is = System.in;
		// 입력된 글자 한자를 읽어와서 데이터를 할당하고 할당된 내용을 출력
		// IO(input output) 데이터의 입출력이 일어나는 경우에는
		// 자바에서는 필수 예외처리를 해야하는데, 반드시 예외처리를 해줘야지만 컴파일이 가능하다.
		try {
			int num = is.read();
			System.out.println("입력된 코드 번호:"+num);
			System.out.println("입력된 문자:"+(char)num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Stream 자원을 해제
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

}
