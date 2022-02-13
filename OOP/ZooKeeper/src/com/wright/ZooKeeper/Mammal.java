package com.wright.ZooKeeper;

public class Mammal {
	
	int energyLevel = 100;
	
	
	
	public int displayEnergy() {
		System.out.println("My energy level is " + this.energyLevel);
		return this.energyLevel;
	}

}
