package com.binary;

public class ADHero extends Hero implements Mortal {
	int speed = 400;
	
	public void physicAttack() {
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getSpeed2() {
		return super.speed;
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("ad英雄死了！");
	}
	
	public ADHero(String name) {
		super();
		System.out.println("ADHero无参构造方法");
	}
	
	public static void battleWin() {
		System.out.println("adhero win");
	}
	
	public static void main(String[] args) throws Throwable {
		Hero.battleWin();
		ADHero.battleWin();
		Hero h = new ADHero("12");
		h.battleWin();
	}
}
