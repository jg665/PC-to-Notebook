package javaexp.a11_io;

import java.io.File;
import java.io.IOException;

public class A12_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# File 입력/출력 처리..
1. File 클래스(파일의 구성요소인 directory와 file자체에 대한 처리를 하는 객체)
	1) 파일 시스템의 파일을 표현하는 클래스
		- 파일 크기, 파일 속성, 파일 이름 등의 정보 제공
		- 파일 생성 및 삭제 기능 제공
		- 디렉토리 생성, 디렉토리에 존재하는 파일 리스트 얻어내는 기능 제공
	2) 파일 객체 생성.
		File f01 = new File("경로와파일명");
	3) 기능 메서드.
		.exists() : 해당 파일이 있는지 여부 : 물리적 파일
		.createNewFile() : 해당 경로에 물리적파일을 생성처리.
		.mkdir() : 새로운 디렉토리를 생성
		.mkidrs() : 경로상에 없는 모든 디렉토리를 생성.
		.delete() : 파일 또는 디렉토리 삭제.
		
C:\javaexp\workspace\javaexp\src\main\java\javaexp\a11_io\Z01_fileExp\ReadMe.txt		
 */
		String path = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\Z01_fileExp";
		String fname = "ReadMe.txt";
		
		File f01 = new File(path, fname);
		System.out.println(f01.getName());
		System.out.println(f01.exists());
		System.out.println(f01.getPath());
		System.out.println(f01.length());
		String fname2 = "GoodNews.txt";
		File f02 = new File(path, fname2);
		System.out.println(f02.exists());
		if(!f02.exists()) {
			
			try {
				f02.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//C:\javaexp\workspace\javaexp\src\main\java\javaexp\a11_io\z02_fileExp
		// ex) z02_fileExp 패키지 생성
		//		Person.java 클래스 생성
		// 		파일 정보 출력 : 파일이 있는지/파일명/경로명/크기
		//		show.txt : 파일객체를 생성을 하고 기능메서드에 실제 파일 생성
		String path2 = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io";
		String fnameEx = "Person.java";
		File f03 = new File(path2, fnameEx);
		System.out.println(f03.getName());
		System.out.println(f03.exists());
		System.out.println(f03.getPath());

		String fnameEx2 = "show.txt";
		File f04 = new File(path2, fnameEx2);
		System.out.println(f04.getName());
		System.out.println(f04.exists());
		System.out.println(f04.getPath());
		if(!f04.exists()) {
			try {
				f04.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	}
	
		
}
