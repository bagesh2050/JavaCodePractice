package com.demo.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>(100, 0.75f, 8);
	}
}
