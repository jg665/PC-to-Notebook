package javaexp.team02;

public class Controller {
	private ProductDao productDao = new ProductDao();
	
	// Product 모델의 데이터를 ProductDao 클래스의 array에 넣어줍니다
	public void registProduct(Product product) {
		productDao.insert(product);
	}
	// ProductDao 클래스의 array에 저장된 모델값을 출력합니다
	public void productList() {
		productDao.getProductList();
	}
}
