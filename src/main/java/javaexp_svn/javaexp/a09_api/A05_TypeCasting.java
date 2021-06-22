package javaexp.a09_api;

public class A05_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
# 숫자형에서 데이터 변환 처리
1. 숫자형은 종류와 크기에 따라서
	byte, short, int, long (정수형)
	float, double (실수형)
	
2. 해당 데이터는 작은 데이터에서 큰 데이터 타입으로 할당하는 것을 promote 라고 하고, 이 경우
   데이터 유실이 없다.
	ex) 작은 용기에 있는 물을 큰 용기에 담는 것
   
   반대로, 큰 데이터 타입에 담긴 데이터를 작은 데이터 타입으로 할당할 경우 유실이 발생한다.
   이때 명시적으로 해당 작은 데이터에 맞게 타입을 정해서 할당을 해야한다 = casting(데이터유형)
	ex) 큰 용기에 있는 물을 작은 용기에 담으면 넘쳐서 버리게 된다.

3. 자바에서 연산처리시, 정수형/정수형 ==> 정수형으로 처리된다.
   이때 소숫점 이하까지 처리된 결과를 확인하기 위해 피연산자의 데이터가 1개 이상 실수여야 한다.
		*/		
		byte num01 = 25;
		int num02 = num01;
		System.out.println(num02); // 25 출력 - 데이터 유실 없음
		double num03 = num02;
		System.out.println(num03); // 25.0 출력 - promote
		
		double num04 = 25.274;
		int num05 = (int)num04; // (int) => casting 안하면 오류로 판단해서 처리 불가
		System.out.println(num05); // 25 출력 - int에 맞게 데이터가 변환됨
		
		int num06 = 25;
		int num07 = 4;
		System.out.println("정수형/정수형:"+num06/num07); // 실수 나와야하지만 6(정수)으로 출력
		System.out.println("정수형/실수형:"+num06/(double)num07); // num07을 명시적으로 casting		

	//	ex) 실수형 변환, 타입캐스팅 이용해서 args 3명의 몸무게를 입력받은 후
	//		실수형의 평균 : @@@
	//		정수형의 평균 : @@@

		double num4 = Double.parseDouble(args[0]);
		double num5 = Double.parseDouble(args[1]);
		double num6 = Double.parseDouble(args[2]);
		System.out.println("회원1: "+num4+"kg");
		System.out.println("회원2: "+num5+"kg");
		System.out.println("회원3: "+num6+"kg");

		double tot2 = (num4+num5+num6)/3;
		System.out.println("실수형의 평균 : "+tot2+"kg");
		
		int num1 = (int)num4;
		int num2 = (int)num5;
		int num3 = (int)num6;
		
		int tot1 = (num1+num2+num3)/3;
		System.out.println("정수형의 평균 : "+tot1+"kg");
		
		
	}

}
