package Deposit2;


public class DPR1Controller {
	// DAO 호출
	private DPR1DAO service = new DPR1DAO();
	// 중재역할
	
	public String DPR1List2(DPR1Recharge dr, Model d) {
		System.out.println("# 컨트롤에서 받은 데이터#");
		d.addAttribute("dpr1list", service.DPR1List(dr));
		return "경로/@@@.jsp";
	}
}	


	// 입금내역 : 복권예치금
	// 금액 : []
	// 계좌주명  : []
	// 넘겨온 데이터 dao 처리해서 최종 결과를 model로 화면에 넘겨준다.
//	public String recharge(DPR1Recharge dr, Model d) {
//		d.addAttribute("예치금충전하기", dao.recharge(dr, d));
//		return "호출할 화면";




// 중재역할
// 화면단에 받은 데이터 매개변수()로 받고,
// 다시 화면에 넘겨줄 데이터 Model d로 선언하여 처리한다.

// return "경로/@@@.jsp";
// showDeposit showDepositUsed: 예치금 잔액조회, 예치금 사용내역
// buyDeposit, refundDeposit : 예치금 구매, 예치금 환불

//String depositH, int[] price, String bankName