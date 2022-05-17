package com.demo.datastructure;

import java.util.HashSet;

public class TwoNumberSumFinder {

	public static void main(String[] args) {
		System.out.println(findNumbers(new int[] { 20, 30, -10, -20, 50 }, 40));
	}

	public static boolean findNumbers(int[] arr, int targetNumber) {

		HashSet<Integer> processedNumbers = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			int requiredNumber = targetNumber - arr[i];

			if (processedNumbers.contains(requiredNumber)) {
				return true;
			} else {
				processedNumbers.add(arr[i]);
			}
		}
		return false;
	}
}
