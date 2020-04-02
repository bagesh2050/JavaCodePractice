package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test12 {

	public static void main(String... args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());

			entry.setValue("newVal");
		}

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
			entry.setValue("NewVal");

			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
		}

		ArrayList<String> list = Arrays.asList("wdsdf", "sdfsdf", "sdfss");
		
		list.remove(0);
		list.remove("sdfsdf");
		
		System.out.println(list);
	}

}
