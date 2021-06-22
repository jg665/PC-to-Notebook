package javaexp.a00_exp.a05;

import java.util.Scanner;

public class A00_0508 {

	
//	final : 한번 선언하면 바뀌지 않는다. 상수는 메인함수 바깥에 선언
//	static : 하나의 클래스에서 공유하는 자원  
//	함수에 함수 반환형return 0;을 쓴다.
//	반환형은 함수가 종료될때 함수의 결과로서 값을 반환해 주는것
//	main()메소드는 메인메소드가 종료되면 프로그램이 종료되는것과 같다
//	void : 반환형이 없다는 함수 .메소드의 return 값이 없다는 함수
//	String[] args : 처음 콘솔창에서 인자값을 넣어줄때 사용.
//	.this 변수의 값을 변경할때 사용
//	생성자 : 인스턴스(객체를 하나 만들어 줄때 자동으로 값을 넣어주는 함수)
//	get 함수 : 특정한 변수를 가져온다
	
//								   매개변수 : 입력값을 수정하기 위한 변수
	public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면
        //  아래와 같이 return 키워드 뒤에 반환하려는 값을 배치하면 된다.
        return output;
    }
 
    public static void main(String[] args) {
        // 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
    }
}