package javaexp.z00_project;

public class A01_MileageController {

	private B01_MileageService sev = new B01_MileageService();
	
	public String mile(Mileage m, Model d) {
		d.addAttribute("마일리지 출력 결과", sev.mile(m));
		return "화면 호출";
	}

}
