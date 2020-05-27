package com.demo.functionalinterface;

public interface MyInterface2 {
	public void show();

	public default void display() {
		System.out.println("MyInterface2 default Method Display");
	}

	public static void print() {
		System.out.println("static Method Print");
	}
}
