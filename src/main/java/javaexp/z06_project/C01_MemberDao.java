package javaexp.z06_project;

//화면단에 출력 , DTO는 뒤에서 불러오는
// DAO(데이터베이스 access object)
public class C01_MemberDao {
	// 로그인시 처리할 메서드
	public String login(Member m) {
		System.out.println("# DB 처리(로그인) ##");
		System.out.println(m.getId());
		System.out.println(m.getPass());
//		return "성공"; // DB에서 받은 결과값을 가정.
		return m.getId().equals("himan")&&
				m.getPass().equals("7777")?
				"성공":"실패"; // DB에서 받은 결과값을 가정.
	}
	public String insert(Member insert) {
		System.out.println("# DB 처리(회원가입) #");
		System.out.println(insert.getId());
		System.out.println(insert.getPass());
		System.out.println(insert.getName());
		System.out.println(insert.getAuth());
		System.out.println(insert.getEmail());
		
		return "회원등록 성공";
	}
			
}

