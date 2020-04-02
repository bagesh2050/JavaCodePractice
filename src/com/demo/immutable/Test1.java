package com.demo.immutable;

import java.util.Arrays;

public final class Test1 {
	private int x;
	private int[] y;
	private String str;

	public Test1(int x, int[] y, String str) {
		this.x = x;
		this.y = Arrays.copyOf(y, y.length);
		this.str = str;
	}

	public int getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	public String getStr() {
		return str;
	}
}
