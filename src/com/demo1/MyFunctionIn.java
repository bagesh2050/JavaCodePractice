package com.demo1;

@FunctionalInterface
public interface MyFunctionIn {

	static void abcd() {
		System.out.println("Interface static method");
	}

	default void cff() {
		System.out.println("Interface default method");
	}

	// void cbvn();

	void sdf();

	@Override
	boolean equals(Object obj);
}
