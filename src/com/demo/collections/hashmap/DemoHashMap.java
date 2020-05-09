package com.demo.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<Employee, String> hashMap = new HashMap<>();

		Employee e1 = new Employee(1, "Bagesh");
		Employee e2 = new Employee(1, "Shiva");
		Employee e3 = new Employee(1, "Bagesh");
		Employee e4 = e1;

		System.out.println("Reference Comparison=" + (e1 == e2));
		System.out.println("Equals Comparison=" + e1.equals(e2));

		hashMap.put(e1, e1.getName());
		hashMap.put(e2, e2.getName());
		hashMap.put(e3, e3.getName());
		hashMap.put(e4, e4.getName());

		System.out.println(hashMap);
	}

}
