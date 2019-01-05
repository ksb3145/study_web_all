package step04;

/*
 *  ProducVO를 핸들링하는 기능으로 묶여 있는 클래스
 *  이후에 비지니스 로직을 담당하는 클래스가 될 것이다.
 *  여기에
 *  1) 모든 상품의 모델명을 출력		:: printProductModel(){//
 *  2) 모든 상품의 총액을 리턴.		:: getTotalPrice(){//
 *  3) 모든 상품의 평균가를 리턴		:: getAvgPrice(){//
 *  4) 모든 상품 중 특정가격 이상/이하의 제품을 리턴	:: getMoreAPrice(){//
 *  이 들어있다.
 */
public class ProductVOService {
	
	int total = 0;
	
	// 리턴 타입과 메소드의 인자값은 여러분 각자가 알아서 넣어주세요.
	public void printProductModel(ProductVO[] pro) {
		System.out.println("=== Product Model명 입니다. ===");
		//코딩...
		for(int i=0; i<pro.length; i++){
			System.out.println(pro[i].getModel());
		}
	}

	public int getTotalPrice(ProductVO[] pro) { // 중요함!!!
		//코딩...
		for(int i=0; i<pro.length; i++){
			total += pro[i].getPrice();
		}
		return total;
	}

	public int getAvgPrice(ProductVO[] pro) {
		//코딩...
		return total / pro.length;
	}

	public void printMoreAPrice(ProductVO[] pro, int price) {
		//코딩...
		String above = "";
		String below = "";
		
		for(int i=0; i<pro.length; i++){
			if(price > pro[i].getPrice()){
				// 이하
				below += pro[i].getModel()+"("+pro[i].getPrice()+")";
			}else{
				// 이상
				above += pro[i].getModel()+"("+pro[i].getPrice()+")";
			}
		}
		
		System.out.println(price+ "이하 : "+below);
		System.out.println(price+ "이상 : "+above);
		
	}
}


////////////////////////답//////////////////////////////

//public class ProductVOService {
//	// 리턴 타입과 메소드의 인자값은 여러분 각자가 알아서 넣어주세요.
//	public void printProductModel(ProductVO[] pro) {
//		System.out.println("=== Product Model명 입니다. ===");
//		for (ProductVO p : pro) {
//			System.out.println(" ");
//			System.out.print(p.getModel() + ", ");
//		}
//		System.out.println(" ");
//	}
//	
//	int total = 0;
//	
//	public int getTotalPrice(ProductVO[] pro) { // 중요함!!!
//		System.out.println(" ");
//		System.out.println("==== Total Product Price ====");
//		for (ProductVO p : pro) {
//			total += p.getPrice();
//		}
//		return total;
//	}
//	
//	public int getAvgPrice(ProductVO[] pro) {
//		System.out.println(" ");
//		System.out.println("==== Total Product Price ====");
//		System.out.println(" ");
//		return total / pro.length;
//	}
//	
//	public void printMoreAPrice(ProductVO[] pro, int price) {
//		System.out.println("\n" + price + " 이상 가격의 제품들.. " + "\n");
//		for (ProductVO p : pro) {
//			if (p.getPrice() > price) {
//				System.out.println(p.getModel() + "\t" + p.getPrice());
//			}
//		}
//	}
//}