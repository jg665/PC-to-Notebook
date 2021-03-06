package 프로젝트소스_공유용.성근_구매기능;

public class JoinDTO {
	private String nmkey; // 회원 번호
	private String ID; // ID(Email)
    private String PW; // PW
    private String Name; // 이름
    
	public JoinDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JoinDTO(String nmkey, String iD, String pW, String name) {
		super();
		this.nmkey = nmkey;
		ID = iD;
		PW = pW;
		Name = name;
	}

	public String getNmkey() {
		return nmkey;
	}

	public void setNmkey(String nmkey) {
		this.nmkey = nmkey;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
    public String toString() {
        return "\n" + "회원 번호 : " + nmkey + "\n" + " ID(Email) : " + ID + "\n" + " PW : " + PW + "\n" + " 이름 : " + Name + "\n";
    }

}