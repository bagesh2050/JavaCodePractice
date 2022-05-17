package com.demo.map.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(5);
		map.put("abc", 1);
		map.put("bcd", 2);
		map.put("cfg", 3);
		map.put("dbc", 4);
		map.put("ebc", 5);
		map.put("fbc", 6);

		System.out.println("Size=" + map.size());
	}
}
