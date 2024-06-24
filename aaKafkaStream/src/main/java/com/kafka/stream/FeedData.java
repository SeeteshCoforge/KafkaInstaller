package com.kafka.stream;

public class FeedData {

	private String item;
	private int quantity;
	private String deliveryType;
	
	public FeedData(String item, int quantity, String deliveryType) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.deliveryType = deliveryType;
	}
	public FeedData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}


}
