package javaexp.z00_project;

public class Mileage {
		private int point;
		private double persent;
		private String start;
		private String end;
		private String className;
		private String classLine;
		static int tot;
		
		public Mileage() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Mileage(int point, double persent, String start, String end, String className, String classLine) {
			super();
			this.point = point;
			this.persent = persent;
			this.start = start;
			this.end = end;
			this.className = className;
			this.classLine = classLine;
		}
		
		public Mileage(int point, double persent) {
			super();
			this.point = point;
			this.persent = persent;
		}

		public Mileage(String start, String end, String className, String classLine) {
			super();
			this.start = start;
			this.end = end;
			this.className = className;
			this.classLine = classLine;
		}

		public int getPoint() {
			return point;
		}

		public void setPoint(int point) {
			this.point = point;
		}

		public double getPersent() {
			return persent;
		}

		public void setPersent(double persent) {
			this.persent = persent;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

		public String getClassName() {
			return className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public String getClassLine() {
			return classLine;
		}

		public void setClassLine(String classLine) {
			this.classLine = classLine;
		}
		
		

	}

