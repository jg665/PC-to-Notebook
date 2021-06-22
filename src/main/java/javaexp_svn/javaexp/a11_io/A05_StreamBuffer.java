package javaexp.a11_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A05_StreamBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
ex) StreamBuffer를 이용해서
	ID:
	PASS:
	입력받아서
	1단계) 입력한 ID: @@@, PASS: @@@
	2단계) .equals() 이용해서, 인증여부 출력
		 로그인 성공/실패
				*/
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("로그인 정보를 입력하세요!");
		try {
			System.out.print("id: ");
			String id = buffer.readLine();
			System.out.print("pass: ");
			String pass = buffer.readLine();
			System.out.println("입력한 ID: "+id+", PASS: "+pass);
			if(id.equals("himan")&&pass.equals("7777")) {
				System.out.println("인증되었습니다.");
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
