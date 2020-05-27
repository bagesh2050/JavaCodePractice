package com.demo.problems.set6;

import static org.junit.Assert.assertEquals;

class Solution {
	public static void main(String[] args) {

		String num = "143912";
		int k = 3;

		assertEquals("1219", removeKdigits("1432219", 3));

		assertEquals("200", removeKdigits("10200", 1));

		assertEquals("0", removeKdigits("10", 1));

		assertEquals("11", removeKdigits("112", 1));

		assertEquals("33", removeKdigits("5337", 2));

		assertEquals("1111", removeKdigits("1111111", 3));

		System.out.println("Smallest Number after K digit removal=" + removeKdigits(num, k));
	}

	public static String removeKdigits(String num, int k) {
		StringBuilder str = new StringBuilder(num);

		if (k < num.length()) {
			int i = 0;
			int j = 0;

			while (i < k) {

				while (j < str.length()) {
					if (j < str.length() - 1 && str.charAt(j) > str.charAt(j + 1)) {
						str.deleteCharAt(j);

						if (j > 0) {
							j--;
						}

						break;
					} else if (j == str.length() - 1 && str.charAt(j) >= str.charAt(j - 1)) {
						str.deleteCharAt(j);

						if (j > 0) {
							j--;
						}

						break;
					}

					j++;
				}

				i++;
			}
		} else {
			return "0";
		}

		while (str.length() > 1 && str.charAt(0) == 48) {
			str.deleteCharAt(0);
		}

		return str.toString();
	}
}