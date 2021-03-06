package com.wright.PuzzleJava;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleUtil {
	
	Random rng = new Random();
	
	public void testing() {
		System.out.println("puzzling, quite puzzling...");
	}

	public ArrayList<Integer> getTenRolls() {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			rolls.add(rng.nextInt(1, 21));
			}
		return rolls;
	}
	
	public String getRandomLetter() {
		String[] letterArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int pick = rng.nextInt(0, 25);
//		System.out.println(pick);
		return letterArray[pick];
	}
	
	public String generatePassword() {
		String[] letterArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String pass = new String("");
		for(int i = 0; i <8; i++) {
			int pick = rng.nextInt(0, 25);
//			System.out.println(letterArray[pick]);
//			pass.concat(letterArray[pick]);
			pass += letterArray[pick];
		}
		return pass;
	}
	
	public String getNewPasswordSet(int nums) {
		
		String pass = new String("");
		for(int i = 0; i < nums; i++) {
			pass += getRandomLetter();
		}
		return pass;
	}
}
