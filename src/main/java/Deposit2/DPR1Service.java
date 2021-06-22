package Deposit2;

import java.util.ArrayList;

public class DPR1Service {
	private ArrayList<DPR1Recharge> DPR1List = new ArrayList<DPR1Recharge>();
	DPR1DAO dao = new DPR1DAO();
	
	public ArrayList<DPR1Recharge>  DPR1List(DPR1Recharge dr){
		System.out.println("# 서비스단 처리#");
		System.out.println("DPR1DAO에 전송 할 예치금 입력 데이터");
		System.out.println("DPR1DAO에서 받을 예치금 입력 데이터 크기:"+ dao.DPR1List(dr).size());
		return dao.DPR1List(dr);
		
		}
	}
	
/*
	DPR1DAO dao = new DPR1DAO();
	
	public ArrayList<DPR1Recharge>  DPR1List(DPR1Recharge dr){
		System.out.println("# 서비스단 처리#");
		System.out.println("DPR1DAO에 전송 할 예치금 입력 데이터");
		System.out.println("DPR1DAO에서 받을 예치금 입력 데이터 크기:"+ dao.DPR1List(dr).size());
		return dao.DPR1List(dr); */
