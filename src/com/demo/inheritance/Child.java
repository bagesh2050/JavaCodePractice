package com.demo.inheritance;

import java.io.IOException;

public class Child extends Parent {

	public String x = "Hello";

	@Override
	public void show() throws IOException {
		System.out.println("Show Child " + this.x + " " + super.x);

		// System.out.println("Parent k=" + k);

		System.out.println("Parent s=" + s);
	}

	@Override
	public void display() throws Exception {
		System.out.println("display Child");
	}

	@Override
	public void print() throws IOException {
		System.out.println("print Child");
	}
}
