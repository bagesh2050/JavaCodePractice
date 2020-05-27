package com.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Java implementation of the approach 
class GFG {

	static List<Long> list = new ArrayList<>();

	static void decBinary(long m) {
		Stack<Long> stack = new Stack<>();
		while (m > 0) {
			stack.push(m % 2);
			m /= 2;
		}

		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
	}

	static long binaryDec(List<Long> list, long n) {
		long ans = 0;
		for (int i = 0; i < n; i++)
			ans += list.get(i) << (n - i - 1);
		return ans;
	}

	static int concat(long n) {

		for (int i = 1; i <= n; i++) {
			decBinary(i);
		}

		// Return the decimal equivalent
		// of the result
		return (binaryDec(list, list.size()));
	}

	// Driver code
	public static void main(String[] args) {
		long n = 3;

		System.out.println(concat(n));
	}
}

// This code is contributed by AnkitRai01
