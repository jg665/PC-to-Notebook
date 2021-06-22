package javaexp.team02;

import java.util.ArrayList;

public class ProductDao {
	private ArrayList<Product> productList = new ArrayList<>();
	
	// Product 모델의 데이터를 array에 넣어준다.
	public void insert(Product product) {
		Product productModel = new Product(
				product.getName(),
				product.getPrice(),
				product.getDiscPercent(),
				product.getRating(),
				product.getReviewCount());
		productList.add(productModel);
	}
	
	// ProdcutDao 클래스의 array에 저장된 모델값을 출력
	public void getProductList() {
		// productList에 담긴 모델들의 데이터를 1개씩 출력
		for (Product product : productList) {
			product.ProductData();
		}
	}
}
