package com.demo5;

class A {
	void print() {
		System.out.println("A");
	}
}

class B extends A {
	void print() {
		System.out.println("B");
	}
}

class C extends A {
	void print() {
		System.out.println("C");
		
		Integer.parseInt("d");
	}
}

public class Test3 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b = c;
		
		newPrint(b);

	}
	
	static void newPrint(A a) {
		a.print();
	}
}
