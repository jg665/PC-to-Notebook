package javaexp.roadmap;

public class Roadmap {
		private String roadmapName; // 로드맵명
		private String writer; // 작성자
		private String kind; // 분류
		private String imgSource; // 화면소스
		private boolean regist; // 등록여부
		
		public Roadmap() {
			super();
		}
		
		public Roadmap(String roadmapName, String writer, String kind, String imgSource,
				boolean regist) {
			super();
			this.roadmapName = roadmapName;
			this.writer = writer;
			this.kind = kind;
			this.imgSource = imgSource;
			this.regist = regist;
		}

		public String getImgSource() {
			return imgSource;
		}

		public void setImgSource(String imgSource) {
			this.imgSource = imgSource;
		}

		public String getRoadmapName() {
			return roadmapName;
		}

		public void setRoadmapName(String roadmapName) {
			this.roadmapName = roadmapName;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public boolean isRegist() {
			return regist;
		}

		public void setRegist(boolean regist) {
			this.regist = regist;
		}

	}