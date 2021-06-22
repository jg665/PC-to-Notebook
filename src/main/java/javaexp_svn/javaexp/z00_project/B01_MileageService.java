package javaexp.z00_project;

public class B01_MileageService {

	private C01_MileageDAO dao = new C01_MileageDAO();
	
		int tot = 0;
	public int mile(Mileage m) {
		tot+=dao.calcu(m);
		System.out.println("누적된 마일리지: "+tot);
		return tot;
	}
	
}
