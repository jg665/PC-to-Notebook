package javaexp.a05_object;

public class A06_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*
# 다차원 배열
1. 2차원 이상의 배열을 말한다.
2. 자바는 1차원의 배열을 활용하여 2차원 이상의 배열을 처리할 수 있다.
 
 */
		String[] train = {"1호차","2호차","3호차"};
		System.out.println(train[0]);
		System.out.println(train[1]);
		System.out.println(train[2]);
		String[][] trainSeats = {{"1번좌석","2번좌석"},
								{"1번좌석","2번좌석"},
								{"1번좌석","2번좌석"}}; 
		//2차원 배열의 데이터 접근 배열명[상위index][하위 index]
		System.out.println("1호차의"+trainSeats[0][0]);
		System.out.println("1호차의"+trainSeats[0][1]);
		System.out.println("2호차의"+trainSeats[1][0]);
		System.out.println("2호차의"+trainSeats[1][1]);
		System.out.println("3호차의"+trainSeats[2][0]);
		System.out.println("3호차의"+trainSeats[2][1]);
		
		// ex1) 1차원배열로 1학년, 2학년, 3학년을 문자열로 선언해서 출력해보고,
		//		2차원 배열로 1학년1반, 1학년2반, 2학년1반, 2학년2반, 3학년1반,3학년2반,
		//		으로 할당하고, 출력하세요.
		
		String[] student = {"1학년","2학년","3학년"};
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		
		String[][] studentClass = {{"1반","2반"}, //[][] 앞에부분 참조변수 
								{"1반","2반"},
								{"1반","2반"}};
		System.out.println(student[0]+" "+studentClass[0][0]);
		System.out.println(student[0]+" "+studentClass[0][1]);
		System.out.println(student[1]+" "+studentClass[1][0]);
		System.out.println(student[1]+" "+studentClass[1][1]);
		System.out.println(student[2]+" "+studentClass[2][0]);
		System.out.println(student[2]+" "+studentClass[2][1]);
		System.out.println("1차원 배열의 크기:"+student.length);
		System.out.println("2차원 배열 중 상위 크기:"+studentClass.length);
		System.out.println("2차원 배열 중 특정한 위치(첫번째) 크기:"
				+studentClass[0].length);
		
		
//		반학생 3명의 이름과 국어점수를 이차원으로 출력
		
		String[] name = {"김철수","홍길동","도우너"};
															//   0 1
		String[][] studentscore = {{"70","80"},				//0|70,80
									{"60","90"},			//1|60 90
									{"50","100"}};			//2|50 100
		System.out.println(name[0]+" "+studentscore[0][0]);
		System.out.println(name[0]+" "+studentscore[0][1]);
		System.out.println(name[1]+" "+studentscore[1][0]);
		System.out.println(name[1]+" "+studentscore[1][1]);
		System.out.println(name[2]+" "+studentscore[2][0]);
		System.out.println(name[2]+" "+studentscore[2][1]);
		
		
	}

}
