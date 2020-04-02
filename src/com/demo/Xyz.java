package com.demo;

public interface Xyz {
	int x = 5;

	public default String showHello() {
		System.out.println("showHello from xyz");
		return null;
	}

	public static String hello() {
		System.out.println("Hello method");

		return null;
	}
}