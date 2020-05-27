package com.demo.problems.set9;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Maximum Sum=" + getMaxSum(new int[] { 4, 2, 2, 7, 8, 1, 2, 8, 8, 3 }, 3));
	}

	static int getMaxSum(int[] arr, int k) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			if (i >= k - 1) {
				maxSum = Math.max(maxSum, currentSum);
				currentSum -= arr[i - (k - 1)];
			}
		}

		return maxSum;
	}
}
