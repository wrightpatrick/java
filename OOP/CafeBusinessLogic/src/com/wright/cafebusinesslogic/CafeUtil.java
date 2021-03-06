package com.wright.cafebusinesslogic;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
	
	public void testing() {
		System.out.println("Testing read all about it");
	}
	
//--------------------------------------------------
	public int getStreakGoal(int numWeeks) {
		int total = 0;
		
		for(int i = 1; i <= numWeeks; i++) {
			total += i;
		}
		
		return total;
	}
	
//--------------------------------------------------
	public double getOrderTotal(double[] prices) {
		double total = 0;
		
		for(double singleItemPrice : prices) {
			total += singleItemPrice;
		}
		
		return total;
	}

//--------------------------------------------------
	public void displayMenu(ArrayList<String> menuItems) {
		
		for(int i = 0; i < menuItems.size(); i++) {
//			System.out.println(i);
//			System.out.println(menuItems.get(i));
			System.out.printf("%s %s \n",i,menuItems.get(i));
		}
	}
	
//-------------------------------------------------
	public void showCustomers(ArrayList<String> customers) {
		
		for (int i = 0; i < 4; i++) {
            
            System.out.printf("%s \n", customers.get(i));
        }
		
	}
	
//-------------------------------------------------
	public void addCustomer(ArrayList<String> customers) {
			
		System.out.println("Please enter your name: ");
		
		Scanner s = new Scanner(System.in);
				String userInput = s.next();
				customers.add(userInput);
			
	}
	
}
