package javaexp.roadmap;

public class User {
	
	private String userId; // 회원 아이디(이메일)
	private String userPassword; // 회원 비밀번호
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}