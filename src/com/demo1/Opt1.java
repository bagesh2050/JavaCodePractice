package com.demo1;

public class Opt1 {

	public static void main(String args[]) {

		System.out.println(1 << 5);

		System.out.println(-1 << 5);

		System.out.println(-100 >> 5);
		System.out.println(100 >> 5);

		System.out.println(-1 >>> 5);
		System.out.println(1 >>> 5);

		System.out.println(1 << 0);

		System.out.println(2 & (1 << 0));
	}
}
