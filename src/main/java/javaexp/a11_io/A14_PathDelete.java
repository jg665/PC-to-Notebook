package javaexp.a11_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class A14_PathDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
# Path
1. 삭제
	Files.delete(Path객체)
2. 복사
	Files.copy(원본Path객체, 복사할Path객체, 복사옵션)
	1) 복사옵션
		대체, 있으면 기존 내용 사용, ..
 */	//  ReadMe.txt 파일 삭제
		String fileInfo = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\Z01_fileExp\\ReadMe.txt";
		Path delFile = Paths.get(fileInfo);
		System.out.println("삭제할파일명:"+delFile.getFileName());
		try {
			Files.delete(delFile);
			System.out.println("삭제 후");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String orgFile = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\Z01_fileExp\\GoodNews.txt";
		String cpyFile = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\Z02_fileExp\\GoodNews_cpy.txt";
		Path original = Paths.get(orgFile);
		Path copy = Paths.get(cpyFile);
		
		try {
			Files.copy(original, copy,
					StandardCopyOption.REPLACE_EXISTING);
			System.out.println("복사완료!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
