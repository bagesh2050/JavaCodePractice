package com.demo1;

public class Parent1 {

	int a = 10;
	int b = 5;
	int c = 20;

	Parent1() {

	}

	Parent1(int a, int b) {
		this.a = a;
		this.b = b;
		c = 30;
	}

	public static void main(String... args) {

		Parent1 parent = new Parent1(3, 4);
		parent.print();
	}

	public void print() {
		System.out.println("a=" + a + " b=" + b + " c=" + c);
	}
}
