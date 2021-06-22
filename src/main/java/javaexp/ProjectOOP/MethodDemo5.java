package javaexp.ProjectOOP;

public class MethodDemo5 {
	//						입력을 위한 도구, 매개변수(parameter)
	public static String numbering(int init, int limit) {
		int i = init;		
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
		String output = "";
		while (i < limit) {
			System.out.println(i);
			output += i; // output = output+i  
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
		String result = numbering(1,5);
		// 변수 result의 값을 화면에 출력한다.
		System.out.println(result);
	}

}
