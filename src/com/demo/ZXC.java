package com.demo;

public interface ZXC {
	default void showHello() {
		System.out.println("Default super Hello called");
		//return null;
	}
}
