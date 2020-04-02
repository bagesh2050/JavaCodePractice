package com.demo;

public class Demo24 {
	static void m2(Base obj) {
		obj.show("hello");
	}

	public static void main(String... strings) {

		Base b1 = new Base();
		Base b2 = new Drived();
		Drived b3 = new Drived();

		m2(b1);
		m2(b2);
		m2(b3);
	}
}
