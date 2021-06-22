package javaexp.roadmap;

public class RoadmapController {

	// RoadmapService 호출
	private RoadmapService service = new RoadmapService();
	
		// 로드맵 전체 검색
		public String roadmapSearchAll(Roadmap m, String k,Model d) {
			System.out.println("# 컨트롤러에서 받은 데이터 #");
			System.out.println("전체 자료 조회");
			d.addAttribute("rmListAll",service.rmListAll(m, k));
			return "전체경로/@@@.jsp";
		}
	
		// 로드맵 키워드(로드맵명, 작성자) 검색
		public String roadmapKeyword(Roadmap m, String k, Model d) {
			System.out.println("# 컨트롤러에서 받은 데이터 #");
			System.out.println("사용자가 입력한 값 : " + k);
			d.addAttribute("RoadmapList",service.rmList(m, k));
			return "키워드가 반영된 경로/@@@.jsp";
		}
}