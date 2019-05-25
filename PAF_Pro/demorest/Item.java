package com.restapipaf.demorest;

public class Item {
	private int itemId;
	private String item_name;
	private String price;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", item_name=" + item_name + ", price=" + price + "]";
	}
	
	
	
	
}
