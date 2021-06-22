package javaexp.a01_basic;

public class A01_Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// // 주석 ctrl+(/): 프로그램에 영향을 미치지 않음
// ctrl+ (+/-) : 크기 조절
// 왼쪽에 빨간 표시가 없게끔 하고, 코딩 끝나면 ctrl+s(저장)
// 을 해야지 실행 준비가 끝난다.
// 오른쪽 마우스 클릭 ==> Run as ==> Java application
// ctrl+shift+f11 (실행)
// ctrl+f11 (디버그 실행) - 라인 옆에 토글 브레이크 설정 후 디버그 실행, Run as 디버깅 모드로 실행 - 자세한 내용은 온라인으로 다시 공부!
// 
		/*
# java 프로그램의 실행 과정
1. 자바 코드 파일 만들기
	@@.java
2. 컴파일 처리
	javac @@@.java ==> @@@.class 만들어진다.
	ps) eclipse 에서는 에러나지 않으면 ctrl+s로 저장시, build폴더에 컴파일된 파일이 .class로 저장된다.
	cf)
	실행 명령어 jdk 위치
	C:\Program Filed\Java\jdk-15.0.1\bin
	javac.exe(컴파일)
3. 실행 처리
	main()메서드가 포함된 클래스만 아래의 실행 명령어를 통해서
	메모리 로딩과 cpu처리를 통해서 결과를 확인할 수 있다.
	java.exe(실행)
	java A01_Hello 통해서 실행이 된다.
	// ps) 실행을 하는데 현재 source가 실행되지 않고 과거의 source로 실행이 되면,
	 	   현재 source가 새로운 source로 컴파일되지 않은 상황
	 	   1) 에러가 있는지 점검
	 	   2) build하위에 class 파일이 현재시간으로 저장되어 있는지 확인



		 */		String name = "홍길동";
		System.out.println("디버그1");
		System.out.println("디버그2");
		int age = 25;
		System.out.println("디버그3");
		System.out.println("디버그4");
	}
}
