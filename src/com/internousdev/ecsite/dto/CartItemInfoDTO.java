package com.internousdev.ecsite.dto;

public class CartItemInfoDTO {
	private String id;
	private String itemName;
	private String totalPrice;
	private String totalCount;
	private String payment;
	private String insert_date;

	//total_Priceの方がいいかも
	//table名はcart_item_transaction

	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName=itemName;
	}
	public String getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice=totalPrice;
	}
	public String getTotalCount(){
		return totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount=totalCount;
	}
	public String getPayment(){
		return payment;
	}
	public void setPayment(String payment){
		this.payment=payment;
	}
	public String getInsert_date(){
		return insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
}
