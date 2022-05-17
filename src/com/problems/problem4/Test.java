package com.problems.problem4;

import java.util.HashMap;
import java.util.Map.Entry;

import junit.framework.Assert;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 11, 9, 13, 8, 12 };

		// Arrays.asList(arr).stream().forEach(item -> System.out.println(item));

		// IntStream.of(arr).forEach(item -> System.out.println(item));

		int[] arr2 = { 34, 45, 34, 45, 56, 67, 67, 89, 89, 73, 65, 45, 34, 20, 20, 34, 34, 20, 72, 73 };

		Assert.assertEquals(45, getSecondHighestValue(arr2));

		// System.out.println("First Highest=" + firstHighest + " Second Highest=" +
		// secondHighest);
	}

	static int getSecondHighestValue(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int item : arr) {
			if (map.containsKey(item)) {
				int value = map.get(item);
				map.put(item, value + 1);
			} else {
				map.put(item, 1);
			}
		}

		System.out.println(map);

		int firstHighest = 0;
		int secondHighest = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = entry.getValue();
			} else if (entry.getValue() > secondHighest) {
				secondHighest = entry.getValue();
			}
		}

		return secondHighest;
	}
}
