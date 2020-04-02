package com.demo1;

public class Equal {
	int a;
	int b;

	boolean isEqual() {
		return (a == b);
	}

	public static void main(String arg[]) {
		Equal e1 = new Equal();
		e1.a=5;
		e1.b=5;
		
		System.out.println(e1.isEqual());
	}
}
