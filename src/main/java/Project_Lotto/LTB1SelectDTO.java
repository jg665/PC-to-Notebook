package Project_Lotto;

public class LTB1SelectDTO {
	// 로또 구매 전 번호 선택 DTO 클래스
	
	public String mixSel; // 혼합선택
	public String autoSel; // 자동번호발급
	public String priNum; // 직전회차번호
	public String myLoto; // 나의로또번호
	public String selNum; // 번호 선택
	public int count; // 로또 수량
	public String ckNum; // 선택번호 확인
	public LTB1SelectDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LTB1SelectDTO(String selNum, int count, String ckNum) {
		super();
		this.selNum = selNum;
		this.count = count;
		this.ckNum = ckNum;
	}
	public String getMixSel() {
		return mixSel;
	}
	public void setMixSel(String mixSel) {
		this.mixSel = mixSel;
	}
	public String getAutoSel() {
		return autoSel;
	}
	public void setAutoSel(String autoSel) {
		this.autoSel = autoSel;
	}
	public String getPriNum() {
		return priNum;
	}
	public void setPriNum(String priNum) {
		this.priNum = priNum;
	}
	public String getMyLoto() {
		return myLoto;
	}
	public void setMyLoto(String myLoto) {
		this.myLoto = myLoto;
	}
	public String getSelNum() {
		return selNum;
	}
	public void setSelNum(String selNum) {
		this.selNum = selNum;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCkNum() {
		return ckNum;
	}
	public void setCkNum(String ckNum) {
		this.ckNum = ckNum;
	}
	
	
	
	
}
