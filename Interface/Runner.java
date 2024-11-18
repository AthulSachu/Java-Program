package com.xworkz.Interface;

public class Runner {
	public static void main(String[] args) {
		PurchaseElectronics app1 = new Flipkart();
		app1.purchaseElectronics();
		app1.returnProduct();
		
		PurchaseElectronics app2 = new Amazon();
		app2.purchaseElectronics();
		app2.returnProduct();
		
		PurchaseGrocery app3 = new Flipkart();
		app3.addGroceryItem();
		app3.removeGroceryItem();
		
		PurchaseGrocery app4 = new Amazon();
		app4.addGroceryItem();
		app4.removeGroceryItem();
	}
}
