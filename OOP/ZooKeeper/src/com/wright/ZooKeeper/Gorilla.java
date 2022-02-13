package com.wright.ZooKeeper;

public class Gorilla extends Mammal{
	

	
	public void throwThings() {
		this.energyLevel -= 5;
		System.out.println("SPLAT!!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("YUMMY!");
	}
	
	public void climbSomething() {
		this.energyLevel -= 10;
		System.out.println("WEEEE!");
	}
	
	
}
