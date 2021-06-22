package javaexp.a11_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A13_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# path 클래스
1. nio 패키지에서 지원하는 클래스로 보다 효과적으로 파일을
관리하는 클래스이다.
2. 주요 기능 메서드.
	1) Paths.get("경로및파일명") : 해당 객체생성
	2) getFileName() : 파일 관련 정보
	3) getParent() : 상위 관련 정보

 */
	Path path = Paths.get("C:\\javaexp\\workspace\\"
	+"javaexp\\src\\main\\java\\javaexp\\a11_io\\Z01_fileExp\\ReadMe.txt");
	System.out.println("getFileName:"+path.getFileName());
	System.out.println("getParent:"+path.getParent());
	System.out.println("getRoot:"+path.getRoot());
	System.out.println("isAbsolute:"+path.isAbsolute());
	// 파일 존재 여부
	boolean exist = Files.exists(path);
	System.out.println("파일 존재 여부:"+exist);
	// 파일의 특정 확인
	// read(읽기), write(쓰기), exe(실행가능)
	System.out.println("읽기:"+Files.isReadable(path));
	System.out.println("쓰기:"+Files.isWritable(path));
	System.out.println("실행:"+Files.isExecutable(path));
	// 디렉토리 만들기
	String newPath="C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\z03_fileExp";
	Path newDir = Paths.get(newPath);
	
	try {
		Path mkPath = Files.createDirectories(newDir);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// 파일만들기
	Path newFile = Paths.get(newPath+"\\newFile.txt");
	
	try {
		Files.createFile(newFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
