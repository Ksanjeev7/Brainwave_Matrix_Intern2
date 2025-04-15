package com.hms.inventory;

public class Inventory {

	private int itemId;
    private String itemName;
    private int quantity;
    private double price;
    private String supplier;
    
    
	public Inventory(int itemId, String itemName, int quantity, double price, String supplier) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.supplier = supplier;
	}
	
	public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
	
	public int getItemId() {
		return this.itemId;
	}
	public String getItemName() {
		return this.itemName;
	}
	
	public  int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getSupplier() {
		return this.supplier;
	}
	
}


