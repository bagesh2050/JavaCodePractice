package com.demo.strings;

public class Test {
	public static void main(String[] args) {
		Integer i = Integer.valueOf("1");
		if (i.toString() == "1")
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}