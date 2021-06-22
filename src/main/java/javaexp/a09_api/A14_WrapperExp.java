package javaexp.a09_api;

import java.util.ArrayList;
import java.util.List;

public class A14_WrapperExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ex) args 래퍼클래스 처리 응용예제
 * 			홍길동 25 75.7
 * 		값을 받아서 wrapper 클래스에 해당하는 데이터를 할당하여
 * 		이름 : @@
 		나이 : @@
 		몸무게 : @@@ [5]
 */
		String name = new String(args[0]);
		Integer age = Integer.parseInt(args[1]);
		Double weigth = Double.parseDouble(args[2]);
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("몸무게: "+weigth);
		
/*
	ex2) ArrayList로 Autoboxing 처리 데이터 할당하기..
		 ArrayList<String> : 이름
		 ArrayList<Integer> : 번호
		 ArrayList<Double> : 점수평균(소숫점한자리)
		 3명의 정보를 각각 할당하여 출력처리 하세요.
 */		
		ArrayList<String> ilist = new ArrayList<String>();
		ilist.add("홍길동");
		ilist.add("김길동");
		ilist.add("오길동");
		ArrayList<Integer> ilist1 = new ArrayList<Integer>();
		ilist1.add(10);
		ilist1.add(30);
		ilist1.add(25);
		ArrayList<Double> ilist2 = new ArrayList<Double>();
		ilist2.add(80.8);
		ilist2.add(76.6);
		ilist2.add(55.5);

		System.out.println("번호\t이름\t평균");
		for(int idx =0;idx<3;idx++) {
			System.out.print(ilist.get(idx) + "\t");
			System.out.print(ilist1.get(idx) + "\t");
			System.out.println(ilist2.get(idx));
			
		
			
		}
		
	}

}
//[양현수] [오전 11:49] for(int idx =0;idx<3;idx++)  활용..
//[양현수] [오전 11:50] names.get(idx)  : 이름 가져오겠죠... hint




