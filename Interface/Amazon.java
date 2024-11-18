package com.xworkz.Interface;

public class Amazon implements PurchaseElectronics, PurchaseGrocery {

	@Override
	public void purchaseElectronics() {
		System.out.println("purchase ios device");
		
	}

	@Override
	public void returnProduct() {
		System.out.println("cannot return product after 7-days");		
	}

	@Override
	public void addGroceryItem() {
		System.out.println("Add Vegetable to the cart");
	}

	@Override
	public void removeGroceryItem() {
		System.out.println("Remove Vegetable from cart");
	}

}
