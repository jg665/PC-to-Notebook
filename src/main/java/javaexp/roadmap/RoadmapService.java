package javaexp.roadmap;

import java.util.ArrayList;

public class RoadmapService {

	// RoadmapDAO 호출
	RoadmapDao dao = new RoadmapDao();
	
	// 로드맵 전체 검색
	public ArrayList<Roadmap> rmListAll(Roadmap m, String k){
		System.out.println("#서비스 단 처리 #");
		System.out.println("DAO 전송 데이터 : 전체 자료 조회");
		System.out.println("DAO에 받은 데이터 크기 : " + dao.rmList(m, k).size());
		return dao.rmList(m, k);
	}
	
	// 로드맵 키워드(로드맵명, 작성자) 검색
	public ArrayList<Roadmap> rmList(Roadmap m, String k){
		System.out.println("#서비스 단 처리 #");
		System.out.println("DAO 전송 데이터 : " + k);
		System.out.println("DAO에 받은 데이터 크기 : " + dao.rmList(m, k).size());
		return dao.rmList(m, k);
	}
}