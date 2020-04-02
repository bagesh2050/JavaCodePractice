package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String... strings) {
		/*
		 * LinkedList<String> linkedList = new LinkedList<>();
		 * 
		 * linkedList.add("zbcd"); linkedList.add("cbcd");
		 * linkedList.add("abcd");
		 * 
		 * System.out.println(linkedList.get(2));
		 * 
		 * Set<String> set = new HashSet<>(); set.add("efs"); set.add("sdg");
		 * set.add(null);
		 * 
		 * for (String val : set) { System.out.println("val=" + val); }
		 */

		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("abc");
		linkedSet.add("bcd");
		linkedSet.add("zde");
		linkedSet.add("vbs");

		for (String val : linkedSet) {
			System.out.println(val);
		}

		System.out.println("******Printing HashSet ****");

		HashSet<String> linkedHashSet = new HashSet<>();
		linkedHashSet.add("abc");
		linkedHashSet.add("bcd");
		linkedHashSet.add("zde");
		linkedHashSet.add("vbs");

		for (String val : linkedHashSet) {
			System.out.println(val);
		}

	}
}
