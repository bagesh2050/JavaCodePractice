package com.demo.problems.set7;

import java.util.Stack;

class Solution2 {

	public static void main(String[] args) {
		// String exp = "55+22/33*23-6*2+7*2/3+434";

		String exp = "3*2/5";

		// assertEquals(481, calculate(" 55 + 22 / 33 * 23 - 6 * 2 + 7 * 2 / 3 +
		// 434 "));

		System.out.println("Answer=" + calculate(exp));
	}

	public static int calculate(String s) {
		Stack<Integer> st = new Stack<>();
		char sign = '+';
		s = s.replaceAll(" ", "");

		int digit = 0;

		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);

			if (Character.isDigit(cur)) {
				digit = digit * 10 + Character.getNumericValue(cur);
				if (i < s.length() - 1)
					continue;
			}

			switch (sign) {
				case '+':
					st.push(digit);
					break;
				case '-':
					st.push(-digit);
					break;
				case '/':
					st.push(st.pop() / digit);
					break;
				case '*':
					st.push(st.pop() * digit);
					break;
				}
				sign = cur;
				digit = 0;
		}
		
		return st.stream().mapToInt(Integer::intValue).sum();
	}
}