package com.xworkz.Interface;

public class Flipkart implements PurchaseElectronics, PurchaseGrocery  {

	@Override
	public void purchaseElectronics() {
		System.out.println("purchase android device");
	}

	@Override
	public void returnProduct() {
		System.out.println("can return product");		
	}

	@Override
	public void addGroceryItem() {
		System.out.println("Add Fruits to the cart");
	}

	@Override
	public void removeGroceryItem() {
		System.out.println("Remove Fruits from cart");	
	}
}
