package com.wright.PuzzleJava;

import java.util.ArrayList;

public class PuzzleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuzzleUtil appTest = new PuzzleUtil();
		
			appTest.testing();
			
			ArrayList<Integer> rolls1 = appTest.getTenRolls();
			System.out.println(rolls1);
			
			ArrayList<Integer> rolls2 = appTest.getTenRolls();
			System.out.println(rolls2);
			
			ArrayList<Integer> rolls3 = appTest.getTenRolls();
			System.out.println(rolls3);
			
			String letter = appTest.getRandomLetter();
			System.out.println(letter);
			
			String pass = appTest.generatePassword();
			System.out.println(pass);
			
			String passSet = appTest.getNewPasswordSet(12);
			System.out.println(passSet);
			
	}
	

}
