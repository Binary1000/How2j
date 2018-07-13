package com.binary;


public class Hero {
	String name = "some hero";
	float hp = 100;
	float armor;
	int speed;
	static String copyright = "Riot Games";
	
	public void kill(Mortal m) {
		m.die();
	}
	
	
	
	public static void battleWin() {
		System.out.println("win!");
	}
	
}
