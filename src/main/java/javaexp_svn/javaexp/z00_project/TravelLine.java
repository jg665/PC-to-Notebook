package javaexp.z00_project;

public class TravelLine {
		private String start;
		private String end;
		private int point;
		public TravelLine(String start, String end) {
			super();
			this.start = start;
			this.end = end;
		}
		public String getStart() {
			return start;
		}
		public String getEnd() {
			return end;
		}
		public int point() {
			if(start.equals("서울")) {
				if(end.equals("부산")) {point = 215;}
				else if(end.equals("제주")) {point = 276;}
			}
			return point;
		}
	
}
