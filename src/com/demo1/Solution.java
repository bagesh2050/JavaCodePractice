package com.demo1;
import java.util.Arrays;

class Solution {
	public static void moveZeroes(int[] nums, int a) {
		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[counter] = nums[i];
				counter++;
			}
		}

		while (counter < nums.length) {
			nums[counter++] = 0;
		}

		a = 10;
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String arg[]) {
		int[] nums = { 0, 1, 0, 3, 12 };

		int a = 1;
		moveZeroes(nums, a);

		System.out.println(Arrays.toString(nums));

		System.out.println("a=" + a);
	}
}