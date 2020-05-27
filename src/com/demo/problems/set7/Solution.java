package com.demo.problems.set7;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		// String exp = "55+22/33*23-6*2+7*2/3+434";

		String exp = "14/3*2";

		assertEquals(481, calculate("  55 + 22 / 33 * 23 - 6 * 2 + 7 * 2 /  3 +    434  "));

		System.out.println("Answer=" + calculate(exp));
	}

	public static int calculate(String s) {

		if (s.contains("."))
			return 0;

		double answer = 0;

		List<String> list = new ArrayList<>();

		int i = 0;

		long firstValue = 1;
		String prevOpr = "";

		StringBuilder num = new StringBuilder();

		while (i < s.length()) {
			char ch = s.charAt(i);

			if (ch >= 48 && ch <= 57) {
				num.append(ch);
			} else if (String.valueOf(ch).trim().isEmpty()) {
				i++;
				continue;
			} else {
				String opr = String.valueOf(ch);

				long newValue = Long.parseLong(num.toString());

				if (firstValue == 1 && prevOpr.equals("")) {
					if (opr.equals("+") || opr.equals("-")) {
						list.add(num.toString());
						list.add(opr);
					} else if (opr.equals("*") || opr.equals("/")) {
						firstValue = newValue;
						prevOpr = opr;
					}
				} else {
					if (opr.equals("+") || opr.equals("-")) {

						if (prevOpr.equals("*") || prevOpr.equals("/")) {
							if (prevOpr.equals("*")) {
								firstValue = firstValue * newValue;
							} else {
								firstValue = firstValue / newValue;
							}

							list.add(String.valueOf((long) firstValue));
							list.add(opr);

							firstValue = 1;
							prevOpr = "";
						} else {
							System.out.println("opr found =" + opr);
						}
					} else if (opr.equals("*") || opr.equals("/")) {

						if (prevOpr.equals("*")) {
							firstValue = firstValue * newValue;
						} else {
							firstValue = firstValue / newValue;
						}

						prevOpr = opr;
					}
				}

				num.setLength(0);
			}

			i++;
		}

		// add last element to stack
		if (i == s.length() && num.length() > 0) {
			long item = Long.parseLong(num.toString());

			if (prevOpr.equals("*")) {
				list.add(String.valueOf(firstValue * item));
			} else if (prevOpr.equals("/")) {
				list.add(String.valueOf((long) (firstValue / item)));
			} else {
				list.add(String.valueOf(item));
			}
		}

		// iterate list
		String opt = "";

		for (int k = 0; k < list.size(); k++) {

			if (k == 0) {
				answer = Double.parseDouble(list.get(k));
			} else {
				if (k % 2 >= 1) {
					opt = list.get(k);
				} else {
					double secondItem = Double.parseDouble(list.get(k));
					if (opt.equals("+")) {
						answer = answer + secondItem;
					} else if (opt.equals("-")) {
						answer = answer - secondItem;
					}

					opt = "";
				}
			}
		}

		return (int) answer;
	}
}