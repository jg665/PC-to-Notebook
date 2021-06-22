package javaexp.roadmap;

public class Lecture {
	
	private String lectureName; // 강의명
	private String lecturer; // 강사명
	private int price; // 가격
	private String ImgSource; // 이미지 소스
	private int totalLecture; // 총 강의 수
	
	public Lecture() {
		super();
	}

	// 강의 전체 생성자
	public Lecture(String lectureName, String lecturer, int price, String ImgSource, int totalLecture) {
		super();
		this.lectureName = lectureName;
		this.lecturer = lecturer;
		this.totalLecture = totalLecture;
	}	
	
	public String getImgSource() {
		return ImgSource;
	}

	public void setImgSource(String imgSource) {
		ImgSource = imgSource;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}
	
	public String getLecturer() {
		return lecturer;
	}
	
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}
	
	public int getTotalLecture() {
		return totalLecture;
	}
	
	public void setTotalLecture(int totalLecture) {
		this.totalLecture = totalLecture;
	}
}