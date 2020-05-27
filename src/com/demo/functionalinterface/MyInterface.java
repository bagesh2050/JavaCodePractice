package com.demo.functionalinterface;

public interface MyInterface {
	public void show();

	public default void display() {
		System.out.println("MyInterface default Method Display");
	}

	public static void print() {
		System.out.println("static Method Print");
	}
}
