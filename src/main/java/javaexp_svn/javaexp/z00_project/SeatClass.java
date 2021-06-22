package javaexp.z00_project;

public class SeatClass {

		private String className;
		private String classLine;
		private double persent;

		public SeatClass(String className, String classLine) {
			super();
			this.className = className;
			this.classLine = classLine;
		}

		public String getClassName() {
			return className;
		}
		public String getclassLine() {
			return classLine;
		}
		public double per() {
			if(className.equals("비즈니스")) {
				if(classLine.equals("C")||classLine.equals("D")||classLine.equals("Z")) {
					persent = 1.25;
				}else if(classLine.equals("U")) {
					persent = 1.0;
				}
			}
			return persent;
		}

}
