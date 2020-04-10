package com.demo.exception;

import java.io.IOException;

public class Parent {

	public Parent() throws ArithmeticException {
		System.out.println("Parent Constructor Called");
	}

	public void show() throws IOException{
		System.out.println("Parent Show Called");
	}
}
