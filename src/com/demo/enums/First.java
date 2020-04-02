package com.demo.enums;

public enum First implements XyzInterface {
	MONDAY,
	TUESDAY,
	WEDNESDAY;

	@Override
	public void getEnumName() {
		System.out.println("I am Enum");
	}
}
