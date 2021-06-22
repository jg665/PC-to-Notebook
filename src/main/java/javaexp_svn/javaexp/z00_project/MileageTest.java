package javaexp.z00_project;

import java.util.ArrayList;

public class MileageTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] membership = {"Magic Miles","Silver","Gold","Diamond","Diamond Plus","Platinum"};
//		String[] seatline = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Z","Y","Z"};
		
//		Mileage m1 = new Mileage();
//		m1.mileage(new SeatClass("서울","제주"));
//		m1.mileage(new SeatClass("이코노미"));
//		m1.mileage(new SeatClass(new SeatLine("T")));
//		m1.show();
		
	}
}
/*
class Mileage{
	private SeatClass mileage;
	private int tot;
	public void mileage(SeatClass s) {
		this.mileage = s;
	}
	public void show() {
		mileage.pers();
		mileage.line();
		int tot = 0;
		tot+=mileage.calcu();
		System.out.println("총 적립된 마일리지: "+tot);
	}
	
}
class SeatClass{
	private String seatclass;
	private double persent;
	private SeatLine seatline;
	private String start;
	private String end;
	private double point;
	public SeatClass(String seatclass) {
		super();
		this.seatclass = seatclass;
	}
	public SeatClass(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}
	public SeatClass(SeatLine seatline) {
		this.seatline=seatline;
		System.out.println("항공권 라인: "+seatline);
	}
	public double pers() {
		if(seatclass.equals("비즈니스 스위트")||seatclass.equals("스마티움")) {
			if(seatline.equals("Y")) {
				persent = 1.35;
			}
		}else if(seatclass.equals("비즈니스")) {
			if(seatline.equals("C")||seatline.equals("D")||seatline.equals("Z")) {
				persent = 1.25;
			} else if (seatline.equals("U")) {
				persent = 1.0;
			} else if (seatline.equals("P")||seatline.equals("I")||seatline.equals("R")) {
				persent = 0;
			}
		}else if(seatclass.equals("이코노미")) {
			if(seatline.equals("T")) {
				persent = 0.5;
			}
		}
		this.persent=persent;
		System.out.println("클래스별 마일리지 적립율: "+persent);
		return persent;
	}
	public double line() {
		if(start.equals("서울")&&end.equals("부산")) {
			point = 215;
		} else if(start.equals("제주")&&end.equals("광주")) {
			point = 111;
		}
		this.point=point;
		System.out.println("구간별 마일리지 포인트: "+point+"마일");
		return point;
	}

	public int calcu() {
		return (int)(persent*point);
	}
}
/*
class SeatLine{
	private String name;
	public SeatLine(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}*/