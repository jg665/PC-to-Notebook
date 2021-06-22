package javaexp.z00_project;


public class C01_MileageDAO {
	public int calcu(Mileage m1) {
		System.out.println("# DB 처리(마일리지-구간) #");
		System.out.println("시작구간: "+m1.getStart());
		System.out.println("도착구간: "+m1.getEnd());
		if(m1.getStart().equals("서울")) {
			if(m1.getEnd().equals("부산")) {
				m1.setPoint(215);
			}else if(m1.getEnd().equals("제주")) {
				m1.setPoint(275);
			}
		}else {
			System.out.println("입력된 데이터가 없습니다.");
		}
		System.out.println("# DB 처리(마일리지-클래스) #");
		System.out.println("클래스명: "+m1.getClassName());
		System.out.println("자리위치: "+m1.getClassLine());
		if(m1.getClassName().equals("비즈니스")) {
			if(m1.getClassLine().equals("C")||
				m1.getClassLine().equals("D")||
				m1.getClassLine().equals("Z")) {
					m1.setPersent(1.25);
			}else if(m1.getClassLine().equals("U")) {
					m1.setPersent(1.0);
			}
		}else {
			System.out.println("입력된 데이터가 없습니다.");
		}
		System.out.println("적립될 마일리지 값: "+(int)(m1.getPersent()*m1.getPoint()));
		return (int)(m1.getPersent()*m1.getPoint());
	}
	
}
