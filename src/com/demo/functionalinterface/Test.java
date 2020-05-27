package com.demo.functionalinterface;

public class Test implements MyInterface, MyInterface2 {

	@Override
	public void show() {
		System.out.println("Method Show");

	}

	public void print() {
		System.out.println("Class Method Print");
	}

	@Override
	public void display() {
		MyInterface.super.display();
		MyInterface2.super.display();
		System.out.println("Class Display Method");
	}

	public static void main(String[] args) {
		Test t1 = new Test();

		t1.display();
		t1.print();

		MyInterface.print();
	}

}
