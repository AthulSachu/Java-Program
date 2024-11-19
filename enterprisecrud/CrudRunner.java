package com.xworkz.enterprisecrud;


import com.xworkz.enterprisecrud.service.ProductServiceImpl;
import com.xworkz.enterprisecrud.entity.*;

public class CrudRunner  {
	public static void main(String[] args) {
		Product prd = new Product("I", "ElectronicProduct", 4000.0, 21, 4.0);
		ProductServiceImpl pdt = new ProductServiceImpl();
		pdt.save(prd);
	}
}
