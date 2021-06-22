package javaexp.a11_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class A15_PathCopyDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String orgFile = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\z02_fileExp\\Person.java";
	String cpyFile = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\z01_fileExp\\Person.java";
	Path original = Paths.get(orgFile);
	Path copy = Paths.get(cpyFile);
	
	try {
		Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String fileInfo = "C:\\javaexp\\workspace\\javaexp\\src\\main\\java\\javaexp\\a11_io\\z02_fileExp\\Person.java";
	Path delFile = Paths.get(fileInfo);
	System.out.println("삭제할파일명:"+delFile.getFileName());
	try {
		Files.delete(delFile);
		System.out.println("삭제 후");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
