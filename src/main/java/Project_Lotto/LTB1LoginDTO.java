package Project_Lotto;
// 로또 구매 전 로그인 정보 입력
public class LTB1LoginDTO {
	
	private String ID; // ID
    private String PW; // PW
    

	public LTB1LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LTB1LoginDTO( String iD, String pW) {
		super();
		ID = iD;
		PW = pW;
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

	@Override
    public String toString() {
        return "\n" + ID + "\n" + " PW : " + PW + "\n";
    }

}