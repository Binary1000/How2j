package com.binary;

public interface Mortal {
	public void die();
	public default void revive() {
		System.out.println("∏¥ªÓ¡À");
	}
}
