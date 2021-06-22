package javaexp.ProjectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// class : System, Math, FileWriter,
		// instance : f1, f2
		// 
 		// 변수와 메서드 그룹핑 한것은 클래스
		System.out.println(Math.PI); //Math 클래스 , PI 변수
		System.out.println(Math.floor(1.8)); //Math 클래스 , floor 메서드
		System.out.println(Math.ceil(1.8)); //Math 클래스 , ceil 메서드
		
//								클래스
		FileWriter	 f1 = new FileWriter("data.txt");  
		// f1이라는 변수에 담기는 복제본(data.txt)파일을 저장하겠다는 상태를 가지고 있는 복제본.
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter	 f2 = new FileWriter("data2.txt");  
		// f2이라는 변수에 담기는 복제본(data.txt)파일을 저장하겠다는 상태를 가지고 있는 복제본.
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
	}
}

