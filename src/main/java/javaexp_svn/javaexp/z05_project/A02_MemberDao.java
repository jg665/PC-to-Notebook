package javaexp.z05_project;

// DAO(database access object)
public class A02_MemberDao {
	// 로그인시 처리할 메서드
	public String login(Member m) {
		System.out.println("# DB 처리(로그인) #");
		System.out.println(m.getId());
		System.out.println(m.getPass());
		return m.getId().equals("himan")&&
				m.getPass().equals("7777")? "성공":"실패"; //DB에서 받은 결과값을 가정.
	}
	public String insert(Member insert) {
		System.out.println("# DB 처리(회원가입) #");
		System.out.println(insert.getId());
		System.out.println(insert.getPass());
		System.out.println(insert.getName());
		System.out.println(insert.getAuth());
		System.out.println(insert.getEmail());
		
		return "회원 등록 성공";
	}
	
	
	
}
