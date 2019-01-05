package com.outlet.service;

import java.util.Arrays;

import com.outlet.vo.*;

public class OutletStoreService {
	
	
	
	/**
	 * 고객들의 정보
	 * @param customArr
	 */
	public void printAllCustomers(CustomerVO[] customArr) {
		
		String returnMSG = "";	// 결과 메시지

		if(customArr.length > 0){
			returnMSG += "===== 다음은 고객들의 정보입니다 =====\n";
			
			for(int i=0; i<customArr.length; i++){
				returnMSG += customArr[i].getName() + " " 
						  +	 customArr[i].getAddr() + "\n";
			}
			
		}
		
		System.out.println(returnMSG);
	}
	
	
	/**
	 * 고객의 모든 상품 리스트 표시
	 * @param customerVO
	 */
	public void printAllProductMaker(CustomerVO custom) {
		String returnMSG = "";	// 결과 메시지
		
		if(custom.getProducts().length > 0){
			returnMSG += "===== " + custom.getName() +"고객이 구매하신 사품 목록 =====\n";
			
			for(int i=0; i<custom.getProducts().length; i++){
				returnMSG += custom.getProducts()[i].getMaker() + "\n";
			}
			
			
		}
		
		System.out.println(returnMSG);
	}

	/**
	 * 고객의 10만원 이상의 물품 출력
	 * @param customerVO
	 */
	public void getExpensiveProduct(CustomerVO custom) {
		String 	returnMSG = "";	// 결과 메시지
		
		if(custom.getProducts().length > 0){
			
			returnMSG += "==== 10만원 이상의 고가 상품들 입니다 ==== \n" 
					  +	 custom.getName()+" 께서 구입하신 물건중 고가 상품은 ...\n";
			
			
			for(int i=0; i<custom.getProducts().length; i++){

				if(100000 <= custom.getProducts()[i].getPrice()){
					
					returnMSG += custom.getProducts()[i].getMaker() 
							  +	 " "+custom.getProducts()[i].getPrice() 
							  +  " 원";
					
				}
			}
		}
		
		System.out.println(returnMSG);
	}

	public int maxPriceProduct(CustomerVO custom) {
		int maxPrice = 0;
		
		if(custom.getProducts().length > 0){
			
			for(int i=0; i<custom.getProducts().length; i++){
				
				if(maxPrice < custom.getProducts()[i].getPrice()){
					maxPrice = custom.getProducts()[i].getPrice();
				}
				
			}
			
		}
		
		return maxPrice;
	}
	
	
}
