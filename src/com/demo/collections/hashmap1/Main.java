package com.demo.collections.hashmap1;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Student, Integer> map = new HashMap<>();

		Student s1 = new Student();

		map.put(new Student(), 10);

		System.out.println("HashCode=" + s1.hashCode());

		System.out.println("Another HashCode=" + (new Student()).hashCode());

		System.out.println("Map Value=" + map.get(new Student()));

		/* Another Story * */

		System.out.println("############### Another Story #####################");

		Student s5 = new Student();

		Student s6 = new Student();

		Student s7 = new Student();

		map.put(s5, 10);

		map.put(s6, 20);

		map.put(s7, 30);

		System.out.println("First Value=" + map.get(s5));
		System.out.println("Second Value=" + map.get(s6));
		System.out.println("Third Value=" + map.get(s7));
	}
}
