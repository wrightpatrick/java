package com.wright.cafebusinesslogic;

import java.util.ArrayList;

public class TestCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeUtil appTest = new CafeUtil();
		
			System.out.println("\n----- Streak Goal Test -----");
			
			System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(5));
			
			System.out.println("----- Order Total Test -----");
			double[] lineItems = {3.5, 1.5, 4.0, 4.5};
			
			System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));
			
			System.out.println("----- Display Menu Test -----");
			
			ArrayList<String> menu = new ArrayList<String>();
			menu.add("drip coffee");
			menu.add("cappuccino");
			menu.add("latte");
			menu.add("mocha");
			
			appTest.displayMenu(menu);
			
			System.out.println("\n----- Add Customer Test-----");
	        ArrayList<String> customers = new ArrayList<String>();
	        customers.add("Ralphalangelo");
	        customers.add("Jonifer");
	        customers.add("Sbeve");
	        customers.add("Bobathy");
	        
	        appTest.addCustomer(customers);
	        appTest.showCustomers(customers);
	        
	}
	
	

}
