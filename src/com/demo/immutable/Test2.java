package com.demo.immutable;

import java.util.Arrays;

public class Test2 {
	public static void main(String arg[]) {

		int[] aa = { 1, 2 };

		Test1 test1 = new Test1(10, aa, "Hello");

		System.out.println(Arrays.toString(test1.getY()));

		aa[0] = 20;

		System.out.println(Arrays.toString(test1.getY()));
	}
}
