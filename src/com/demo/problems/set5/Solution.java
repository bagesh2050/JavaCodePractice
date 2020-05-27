package com.demo.problems.set5;

class Solution {
	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";

		System.out.println("Jewel Count=" + numJewelsInStones(J, S));
	}

	public static int numJewelsInStones(String J, String S) {
		int counter = 0;

		for (int i = 0; i < S.length(); i++) {
			for (int k = 0; k < J.length(); k++) {
				if (S.charAt(i) == J.charAt(k)) {
					counter++;
					break;
				}
			}
		}

		return counter;
	}
}