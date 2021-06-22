package javaexp.a04_condition;

public class Student {
	private int number;
	private int kor;
	private int eng;
	private int math;
	public Student(int number, int kor, int eng, int math) {
		super();
		this.number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String show() {
		return number+"번\t"+kor+"\t"+eng+"\t"+math+"\t";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
