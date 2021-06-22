package javaexp.roadmap;

import java.util.Scanner;

public class RoadmapMain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("로드맵 이름/작성자명 검색하기 [검색]");
				System.out.println("1.전체조회 | 2. 로드맵명으로 조회 | 3. 작성자명으로 조회 | 0. 종료");
				System.out.print("선택하세요 > ");
				String text = kb.nextLine();
				int select = Integer.parseInt(text);
				
				if(select == 1) {
					System.out.println("전체조회를 시작합니다.");
					Roadmap sch = new Roadmap();
					RoadmapController ctrl = new RoadmapController();
					System.out.println("#호출된 화면#");
					System.out.println(ctrl.roadmapSearchAll(sch, null, new Model()));
					break;
					
				} else if(select == 2) {
					Roadmap sch = new Roadmap();
					RoadmapController ctrl = new RoadmapController();
					System.out.println("[로드맵명으로 검색합니다.]");
					System.out.print("검색할 로드맵명 : ");
					String roadmapName = kb.nextLine();
					System.out.println("#호출된 화면#");
					System.out.println(ctrl.roadmapKeyword(sch, roadmapName, new Model()));
					break;
					
				} else if(select == 3) {
					Roadmap sch = new Roadmap();
					RoadmapController ctrl = new RoadmapController();
					System.out.println("[작성자명으로 검색합니다.]");
					System.out.print("검색할 작성자명 : ");
					String roadmapWriter = kb.nextLine();
					System.out.println("#호출된 화면#");
					System.out.println(ctrl.roadmapKeyword(sch, roadmapWriter, new Model()));
					break;
					
				}	else if(select == 0) {
					System.out.println("검색을 종료합니다.");
					break;
				}
			}catch(Exception e) {
				// System.err.println("오류 메시지 : " + e.getMessage());
				e.printStackTrace();
			}
		}
		kb.close();
	}

}