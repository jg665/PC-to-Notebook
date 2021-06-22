package javaexp.a01_basic;

public class A06_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 기본 데이터 타입
1. 정수, 실수, 문자, 논리 리터럴(할당되는 실제 상수 데이터)을 직접 저장하는 타입을 말한다.
	25 (리터럴상수)
2. 메모리의 최소 기억단위인 bit가 8개모여 byte가 형성되어 범위를 설정한다.
3. 유형
	1) 정수형
		byte	(1byte)	-128~127
		char	(2byte)	0~65525 : 유니코드 문자
			char c1 = 'A'
			char c2 = (char)25  : 정수형 25번째 코드값이 c2변수에 할당된다.
		short	(2byte)	-32768~32767s
	**	int		(4byte)	-2147483648~2147483647
		long	(8byte)
			long num02 = 25L;
	
	2) 실수형
		float	(4byte)
			double num4 = 25.343F
	**	double	(8byte)
			double num4 = 25.343
		
	3) 논리형
		boolean	(1byte)	true/false
			boolean isPass = true
				
				
				*/
// ex) 기본데이터 유형의 이름과 타입에게 데이터를 선언과 할당하여 출력하세요.
//		확인 : 연산자를 이용해서 데이터 할당은 어떤 타입부터 가능한지 확인하세요.
		byte num01 = 25;
		num01 = 127; // min/max 데이터도 확인 : 128 넘어가면 에러 남
		System.out.println("byte데이터 타입: "+num01);
		short num02 = 32767;
		System.out.println("short데이터 타입: "+num02);
		char c1 = '안';
		char c2 = (char)65526;
		System.out.println(c1+":"+c2);
		int num03 = num01+num02;
		System.out.println("int 데이터 타입: "+num03);
		int num04 = 22222222;
	//	long num05 = 222222222; // 정수형의 기본 데이터는 int이기에 할당시 L 붙여야함
		long num05 = 222222222L;
	//	float num07 = 342.278; // 정수형의 기본 데이터는 double이기 때문에 F로 할당
		float num07 = 342.278F;
		double num09 = 234.234222222;
		boolean isPass = num01>num02; // 비교값 처리 가능
		
		
		byte num00 = 2;
//		byte num02 = num00 + num01; // byte는 연산처리 불가
		
		
		
	}

}
