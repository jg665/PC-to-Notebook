package javaexp.team06t0;

import java.awt.Image;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 화면에서 처리하는 부분을 main()을 통해
// public Lesson(Image img, String name, String mentor, String reviewStar, int price)
		
		SearchSch sch = new SearchSch("자바");
		
		SearchController ctrl = new SearchController();
		System.out.println("#호출된 화면#");
		System.out.println(ctrl.schList(sch, new Model()));
		System.out.println();
	}
		
}

/*

		SearchSch sch = new SearchSch("자바","쉽게 배우는 ReactiveX",
				"열악한 코딩사전","★★★★★",29700,23760,"할인");
		SearchController ctrl = new SearchController();
		System.out.println("#호출된 화면#");
		System.out.println(ctrl.schList(sch, new Model()));
	}
*/