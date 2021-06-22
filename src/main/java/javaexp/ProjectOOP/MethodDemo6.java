package javaexp.ProjectOOP;

public class MethodDemo6 {
	//						입력을 위한 도구, 매개변수(parameter)
	public static void numbering(int init, int limit) {
		int i = init;				
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		numbering(10,50);//(10) 인자, argument 
	}

}
