package javaexp.ProjectOOP;

public class MethodDemo4 {
	//						입력을 위한 도구, 매개변수(parameter)
	public static void numbering(int limit) {
		int i = 0;				
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		numbering(10);//(10) 인자, argument 
	}

}
