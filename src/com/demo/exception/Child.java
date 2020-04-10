package com.demo.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {
	public Child() throws IOException{
		try {
			
		} catch (Exception e) {
			System.out.println("Exception=" + e);
		}
		System.out.println("Child Constructor Called");
	}

	public void show() throws FileNotFoundException {
		System.out.println("Child Show Called");
	}

	public static void main(String[] args) {
		try {
			Child c1 = new Child();
			c1.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
