package com.demo;

public class Fruit {

	public static void main(String... strings) {
		try {
			m1();
		} catch (RuntimeException e) {
			System.out.println("Runtime");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	static void m1() throws Exception {
		try {
			m2();
		} finally {
			m3();
		}
	}

	static void m2() throws RuntimeException {
		throw new RuntimeException();
	}

	static void m3() throws Exception {
		throw new Exception();
	}
}
