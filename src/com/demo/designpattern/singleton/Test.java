package com.demo.designpattern.singleton;

public class Test {

	int x = 6;

	public static void main(String[] args) {
		MySingleton singleton1 = MySingleton.INSTANCE2;
		MySingleton singleton2 = MySingleton.INSTANCE2;
		MySingleton singleton3 = MySingleton.INSTANCE2;

		singleton1.setValue(3);
		singleton2.setValue(5);

		if (singleton1 == singleton2) {
			if (singleton1 == singleton3) {
				System.out.println("Same Object --- Value=" + singleton3.getValue() + "  Object Value="
						+ singleton3.getObjectValue());

				System.out.println("Object1 =" + singleton1.getObject() + " Object2=" + singleton2.getObject());
			} else {
				System.out.println("Same-Different Object");
			}
		} else {
			System.out.println("Different Object");
		}
	}
}
