package com.demo;

public class Test233 {

	private static void show(String str) {
		System.out.println("String class");
	}

	private static void show(Object obj) {
		System.out.println("Object class");
	}

	public static void main(String... strings) {
		Object b = null;
		show(null);
	}
}
