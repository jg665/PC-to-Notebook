package javaexp.z05_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//import com.douzone.day09.MemberJoin.HashMap.MemberDTO;

 
public class Z99_MemberJoinDAO {
 
    Scanner sc = new Scanner(System.in);
    List<Z99_MemberDTO> members = new ArrayList<>();
    
    public Z99_MemberJoinDAO() {
        members.add(new Z99_MemberDTO("hong1", "1111", "홍길동", "010-7777-8888", "ssangyong@naver.com", "서울 특별시", "02-5555-4468"));
        members.add(new Z99_MemberDTO("kong2", "2222", "김길동", "010-7776-8887", "kong2@gmail.com", "부산 광역시", "031-3461-4642"));
        members.add(new Z99_MemberDTO("cong3", "3333", "최길동", "010-7567-8885", "cong3@hanmail.net", "서울 특별시 강남구 테헤란로 132 한독약품빌딩", "02-3481-4632"));
    }
 
    public void run() {
        
        int key = 0;
        while ((key = menu()) != 0) {
            switch (key) {
                case 1:
                    Login();
                    break;
                case 2:
                    MemberJoin();
                    break;
                case 3:
                    SelectMember();
            }
        }
    }
 
    private void SelectMember() {
        Iterator<Z99_MemberDTO> ite = members.iterator();
        
        while(ite.hasNext()) {
            System.out.println(ite.next() + " ");
        }
        
    }
 
    private void MemberJoin() {
        sc.nextLine();
        String id = getStrInput("               ID : ");
        String pw = getStrInput("         PassWord : ");
        String pw2 = getStrInput("Password Confirm : ");
        String name = getStrInput("           Name : ");
        String hp = getStrInput("           H.P : ");
        String email = getStrInput("           Email : ");
        String address = getStrInput("           Address : ");
        String tel = getStrInput("           Tel : ");
        String confirm = getStrInput("약관에 동의하시겠습니까(Y/N)? :");		
        
        do {
        	System.out.println("약관에 동의하시겠습니까(Y/N)? :");
        }while(sc.nextLine().equals("N"));
        	System.out.println("약관에 동의되셨습니다.");
        	
        if(idCheck(id)) {
            System.out.println("중복된 ID입니다.");
        }else if(pw.equals(pw2)) {
            members.add(new Z99_MemberDTO(id, pw, name, hp, email, address, tel));
            
        }else {
            System.out.println("비밀번호를 확인해주세요.");
        }
        
    }
 
    private boolean idCheck(String id) {
        boolean check = true;
        Z99_MemberDTO member = FindById(id);
        if(member == null)
            check = false;
        return check;
    }
 
    private void Login() {
        sc.nextLine();
        String id = getStrInput("      ID : ");
        String pw = getStrInput("PassWord : ");
        
        Z99_MemberDTO member = FindById(id);
        if(member == null){
            System.out.println("등록되지 않은 ID입니다.");
        }else if(member.getPW().equals(pw)) {
            System.out.println("[" + member.getID() + "]님께서 로그인 하셨습니다.");
        }else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
 
    private Z99_MemberDTO FindById(String id) {
        for(Z99_MemberDTO memberDTO : members) {
            if(memberDTO.getID().equals(id)) {
                return memberDTO;
            }
        }
        return null;
    }
 
    private String getStrInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();        
    }
 
    private int menu() {
        System.out.println("Welcome YouTube");
        return getNumInput("[1]로그인 [2]회원가입 [3]전체 회원 보기 [0]종료");
    }
 
    private int getNumInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();
    }
 
}