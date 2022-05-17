package com.demo.datastructure;

import java.util.HashSet;

public class TwoNumberDiffFinder {

	public static void main(String[] args) {
		System.out.println(findNumbers(new int[] { 50, 40, -1, 20, -5, 10 }, 40));
	}

	public static boolean findNumbers(int[] arr, int targetNumber) {

		HashSet<Integer> processedNumbers = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			int requiredNumber = 0;

			if (arr[i] >= targetNumber) {
				requiredNumber = arr[i] - targetNumber;
			} else {
				requiredNumber = arr[i] + targetNumber;
			}

			if (processedNumbers.contains(requiredNumber)) {
				return true;
			} else {
				processedNumbers.add(arr[i]);
			}
		}
		return false;
	}
}
