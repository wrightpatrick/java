package com.wright.ZooKeeper;

public class Succubus extends Mammal{
	
	Succubus(){
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("SWOOSH!!");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("YUMMY HUMANS!");
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("TROGDOR!");
	}

}
