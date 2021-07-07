package z99_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A01_Dao {
	/*
# java를 통해 데이터베이스 처리..
1. DAO(database access object)
	1) 생각해봅시다.
		- 소캣통신을 통한 여러가지 모듈을 필요로 한다. - jdbc 드라이버 
			= 각 DB 서버 회사에서 지원한다. @@.jar 파일로 되어 있다.
		- DB 연결을 위해 필요로 하는 정보?
			= ip, port, sid, 계정, 비밀번호
		- DB 처리는 어떤 순서로 처리가 될까??
			= DB서버가 있고,
			= driver를 메모리에 로딩.. 
			= DB연결을 필요로 하는 정보를 통해서 연결.
			= 명령어를 통해서 서버에 요청 (Statement) sql과 Statement객체 필요
				select(dql) : 서버에서 해당 명령의 결과를 전달.
					==> 결과물을 받는 객체가 필요 ResultSet
					==> ArrayList<Vo>
				insert, update, delete(dml) : 요청정보를 DB 서버내에서
					처리한다.
	 				==> 트랜잭션처리와 함께 명령어인 commit, rollback을 처리.
	 		= 자원을 해제
	 		= 기타 DB처리시, 발생하는 예외를 처리..
	 				try{}catch(SQLException e){}
	 2) DAO의 역할
	 	- 데이터베이스 서버 연결
	 	- 메서드를 통해서 입력받은 데이터인 VO를 통해서,
	 		조회를 하거나, 등록, 수정, 삭제를 처리한다.
	 	- 자원을 해제처리..
*/
	/* DAO의 전역변수 : 기능 메서드에서 공통적으로 활용하는 필드*/
	// 1. 데이터베이스 연결을 처리하는 객체
	private Connection con;
	// 2. 서버와 대화를 하는 객체
	private Statement stmt;
	private PreparedStatement pstmt;
	// 3. 결과값을 받는 객체.
	private ResultSet rs;
	 
	// 공통기능 메서드(연결처리하는 기능메서드)
	public void setCon() throws SQLException {
		// 1. 드라이버 메모리 로딩..
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 세미콜론시 무조건 에러, 필수 예외처리 필요
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2. 특정 서버 접속
		//	1) 서버 정보
		String info = "jdbc:oracle:this:@localhost:1521:xe";
		con = DriverManager.getConnection(info, "scott","tiger");
		System.out.println("접속 성공!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A01_Dao dao = new A01_Dao();
		try {
			dao.setCon();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
