package com.outlet.vo;

import com.outlet.util.MyDate;

public class ProductVO {
	
	private int price; 			// 가격
	private int serialNumber; 	// 물품 일련번호
	private String maker; 		// 브랜드명
	private MyDate startDate; 	// 입고서점 
	
	
	public ProductVO(String maker, int price,  MyDate startDate, int serialNumber) {
		super();
		this.price = price;
		this.serialNumber = serialNumber;
		this.maker = maker;
		this.startDate = startDate;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public MyDate getStartDate() {
		return startDate;
	}
	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}
	
}
