package com.demo.inheritance;

import java.io.IOException;

public class Parent {

	int s = 10;
	private int k = 20;
	protected int x = 10;

	public void show() throws Exception {
		System.out.println("Show Parent");
	}

	public void display() throws IOException {
		System.out.println("display Parent");
	}

	public void print() throws ArithmeticException {
		System.out.println("print Parent");
	}
}
