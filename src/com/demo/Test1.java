package com.demo;

import com.demo1.Child1;

public class Test1 extends Child1 implements Xyz, ZXC {
	public static void main(String... args) {
		Child1 child = new Child1();
		child.showPublic();
		System.out.println(x);

		Test1 test = new Test1();
		test.showHello();
	}

	/*@Override
	public void showHello() {

		System.out.println("showHello from Test called");

		super.showHello();
		Xyz.super.showHello();
		Xyz.hello();
		//return ZXC.super.showHello();
		// return null;
	}*/

}
