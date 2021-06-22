package javaexp.team02;

public class A00_team {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller controller = new Controller();
		
		// 상품 추가
		controller.registProduct(new Product("고메 클래식 포테이토 피자 400gX2개", 13960,  0.23, 0, 0));
		controller.registProduct(new Product("비비고 수제새우만두325g*2x2개", 16960,  0.25, 4.5, 18));
		controller.registProduct(new Product("비비고썰은배추김치900X2개", 21000,  0.3, 3, 1));
		controller.registProduct(new Product("햇반 매일찰잡곡밥 210gX18개", 19368,  0, 0, 0));
		controller.registProduct(new Product("비비고 사골곰탕 500gx2개", 1656,  0.4, 5, 48));
		controller.registProduct(new Product("비비고 구운주먹밥 치즈닭갈비 500gx2개", 15960, 0.25, 4.5, 29));
		controller.registProduct(new Product("비비고 찰보리 감자만두400g*2eax2개", 12720, 0.25, 5, 7));
		controller.registProduct(new Product("고메 함박스테이크540gx2개", 15960, 0.25, 0, 0));
		
		// 상품들 모두 출력
		controller.productList();
	}

}
