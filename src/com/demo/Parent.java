package com.demo;

public class Parent extends GrandFather {

	private Parent() {

	}

	public Parent(int x) {
		System.out.println("Parent constructor called");
	}

	public static void getValue() {
		System.out.println("Get Value of Parent called");
	}

	public String show() {
		System.out.println("Hello Show");
		return null;
	}

	public static void main(String... strings) {
		Parent p = new Parent();
		p.show();
	}
}
