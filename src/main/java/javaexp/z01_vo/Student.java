package javaexp.z01_vo;
// javaexp.z01_vo.Student
import javaexp.z01_vo.Student;
public class Student {
	private int num;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int num, int kor, int eng, int math) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void show() {
		System.out.println(num+"\t");
		System.out.println(kor+"\t");
		System.out.println(eng+"\t");
		System.out.println(math+"\t");
		int tot = kor+eng+math;
		System.out.println(tot+"\t");
		System.out.println(tot/3+"\n");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
