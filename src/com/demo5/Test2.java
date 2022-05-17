package com.demo5;

interface BaseI {
	void method();
}

class BaseC {
	public void method() {
		System.out.println("safsd");
	}
}

public class Test2 extends BaseC implements BaseI {
	
	public static void main(String[] args) {
		(new Test2()).method();
	}

}
