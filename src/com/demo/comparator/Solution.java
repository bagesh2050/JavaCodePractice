package com.demo.comparator;

// A Java program for merging overlapping intervals 
import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public static int solution(int[] A, int[] B) {

		if ((A.length <= 0 || B.length <= 0) && A.length != B.length)
			return 0;

		Interval arr[] = new Interval[A.length];

		for (int i = 0; i < A.length; i++) {
			arr[i] = new Interval(A[i], B[i]);
		}

		Stack<Interval> stack = new Stack<>();

		Arrays.sort(arr, (interval1, interval2) -> {
			return interval1.start - interval2.start;
		});

		stack.push(arr[0]);

		for (int m = 1; m < arr.length; m++) {
			Interval first = stack.peek();

			if (first.end < arr[m].start)
				stack.push(arr[m]);
			else if (first.end < arr[m].end) {
				first.end = arr[m].end;
				stack.pop();
				stack.push(first);
			}
		}
/*
		// Print contents of stack
		System.out.print("The Merged Intervals are: ");

		int length = stack.size();
		while (!stack.isEmpty()) {
			Interval t = stack.pop();
			System.out.print("[" + t.start + "," + t.end + "] ");
		}

*/		return stack.size();
	}

	public static void main(String args[]) {
		int[] A = { 1, 12, 42, 70, 36, -4, 43, 15 };
		int[] B = { 5, 15, 44, 72, 36, 2, 69, 24 };
		System.out.println("Count=" + solution(A, B));
	}
}

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
// This code is contributed by Gaurav Tiwari
