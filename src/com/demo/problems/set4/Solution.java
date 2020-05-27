package com.demo.problems.set4;

public class Solution {
	static int[] arr = { 4, 3, 5, 6, 7, 1, 3, 5, 2, 4, 5, 6, 8, 7, 4 };

	public static void main(String[] args) {
		int index = findElementIndex(2, arr.length);

		System.out.println("Element is at index=" + index);
	}

	public static int findElementIndex(int element, int length) {
		if (arr[length - 1] == element) {
			return length - 1;
		} else {
			return getElementIndex(0, length - 1, element);
		}
	}

	static int getElementIndex(int start, int end, int element) {

		if (start == end) {
			if (arr[start] == element) {
				return start;
			} else {
				return -1;
			}
		}

		int middle = divide(start, end);

		if (arr[middle] == element) {
			return middle;
		}

		int leftIndex = getElementIndex(start, middle - 1, element);
		int rightIndex = getElementIndex(middle + 1, end, element);

		if (leftIndex != -1 && arr[leftIndex] == element) {
			return leftIndex;
		} else if (rightIndex != -1 && arr[rightIndex] == element) {
			return rightIndex;
		} else {
			return -1;
		}
	}

	static int divide(int start, int end) {
		return start + ((end - start) / 2);
	}
}