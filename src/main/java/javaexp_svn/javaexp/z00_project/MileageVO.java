package javaexp.z00_project;

public class MileageVO {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mileage.mileTot=0;
		Mileage m1 = new Mileage(new TravelLine("서울","부산"),new SeatClass("비즈니스","C"));
		m1.mileage();
		Mileage m2 = new Mileage(new TravelLine("서울","제주"),new SeatClass("비즈니스","U"));
		m2.mileage();
		System.out.println("# 총 마일리지 누적 잔액 #\n"+Mileage.mileTot+" 마일");
		m2.useMileage(20);
		System.out.println("# 총 마일리지 누적 잔액 #\n"+Mileage.mileTot+" 마일");
	}
}
class Mileage{
	private TravelLine travelLine;
	private SeatClass seatClass;
	static int mileTot;
	public Mileage(TravelLine t, SeatClass s) {
		this.travelLine=t;
		this.seatClass=s;
	}
	public void mileage() {
		System.out.println("구간별 적립 마일리지: "+travelLine.point());
		System.out.println("클래스별 마일리지 적립율: "+(int)(seatClass.per()*100)+"%");
		System.out.println((int)(travelLine.point()*seatClass.per())+" 마일 적립완료!");
		mileTot+=(int)(travelLine.point()*seatClass.per());
	}
	public void useMileage(int price) {
		System.out.println("사용한 마일리지: "+price);
		mileTot-=price;
	}

}
class TravelLine{
	private String start;
	private String end;
	private int point;
	public TravelLine(String start, String end) {
		super();
		this.start = start;
		this.end = end;
	}
	public String getStart() {
		return start;
	}
	public String getEnd() {
		return end;
	}
	public int point() {
		if(start.equals("서울")) {
			if(end.equals("부산")) {point = 215;}
			else if(end.equals("제주")) {point = 276;}
		}
		return point;
	}
}

class SeatClass{
	private String className;
	private String classLine;
	private double persent;

	public SeatClass(String className, String classLine) {
		super();
		this.className = className;
		this.classLine = classLine;
	}

	public String getClassName() {
		return className;
	}
	public String getclassLine() {
		return classLine;
	}
	public double per() {
		if(className.equals("비즈니스")) {
			if(classLine.equals("C")||classLine.equals("D")||classLine.equals("Z")) {
				persent = 1.25;
			}else if(classLine.equals("U")) {
				persent = 1.0;
			}
		}
		return persent;
	}*/
}