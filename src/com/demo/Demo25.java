package com.demo;

public class Demo25 {

	public static void main(String... strings) {
		Demo25 demo1 = new Demo25();
		Demo25 demo2 = new Demo25();

		System.out.println(demo1.getClass() == demo2.getClass());
	}
}
