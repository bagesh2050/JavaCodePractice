package com.demo;

public class Demo23 {

	static void m2(Object str) {
		System.out.println("Object=" + str);
	}

	static void m2(StringBuilder str) {
		System.out.println("StringBuilder=" + str);
	}

	static void m2(StringBuffer str) {
		System.out.println("StringBuffer=" + str);
	}

	static void m2(String str) {
		System.out.println("string=" + str);
	}

	static void m2(Number str) {
		System.out.println("Number=" + str);
	}

	public static void main(String... strings) {
		Object b = null;
		String c = null;

		m2("hello");

		m2(10);

		m2(null);

		m2(b);
		m2(c);

		Demo23 demo = new Demo23();

		demo.m3(null);

	}

	void m3(Object str) {
		System.out.println("Object=" + str);
	}

	/*void m3(StringBuilder str) {
		System.out.println("StringBuilder=" + str);
	}*/

	/*void m3(StringBuffer str) {
		System.out.println("StringBuffer=" + str);
	}*/

	void m3(String str) {
		System.out.println("string=" + str);
	}
}
