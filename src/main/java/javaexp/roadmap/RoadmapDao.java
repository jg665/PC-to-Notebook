package javaexp.roadmap;

import java.util.ArrayList;

public class RoadmapDao {
	
	// 로드맵 검색 DAO
	public ArrayList<Roadmap> rmList(Roadmap m, String s) {
		
		ArrayList<Roadmap> list = new ArrayList<Roadmap>();
		list.add(new Roadmap("프로를 위한 Spring", "김영한", "개발/프로그래밍", "프로를 위한 Spring.png", true));
		list.add(new Roadmap("웹 프론트엔드 정석", "박프론트", "개발/프로그래밍", "웹 프론트엔드 정석.png", true));
		list.add(new Roadmap("데이터분석 완벽가이드", "정파이썬", "데이터사이언스", "데이터분석 완벽가이드.png", false));

		System.out.println("# DB 서버에 넘겨줄 검색 데이터 #");
		
		for (int i = 0; i < list.size(); i++) {
			if (s == null) {
				System.out.println("Roadmap All");
				break;
			}
			if (list.get(i).getRoadmapName().contains(s) || list.get(i).getWriter().contains(s)) {
				System.out.println("로드맵명\t\t작성자\t이미지소스");
				System.out.print(list.get(i).getRoadmapName() + "\t");
				System.out.print(list.get(i).getWriter() + "\t");
				System.out.println(list.get(i).getImgSource() + "\t");
				break;
			}
		}

		System.out.println("# DB 서버에서 온 데이터 리스트 #");
		System.out.println("로드맵명\t\t작성자\t분류\t\t이미지소스\t\t\t참여여부");

		for (Roadmap road : list) {
			System.out.print(road.getRoadmapName() + "\t");
			System.out.print(road.getWriter() + "\t");
			System.out.print(road.getKind() + "\t");
			System.out.print(road.getImgSource() + "\t");
			System.out.println(road.isRegist());
		}
		return list;

	}

}