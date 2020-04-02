package com.demo;

class Solution {
	public static String solution(int A, int B) {
		// write your code in Java SE 8
		StringBuilder str = new StringBuilder();

		while (A > 0 || B > 0) {
			if (A > B) {

				str.append(appendCharToStr(A,str,"a"));
				if (A > 0) {
					str = str + 'a';
					--A;
				}

				if (A > 0) {
					str = str + 'a';
					--A;
				}

				if (B > 0) {
					str = str + 'b';
					--B;
				}
			} else if (B > 0 && B > A) {
				if (B > 0) {
					str = str + 'b';
					--B;
				}

				if (B > 0) {
					str = str + 'b';
					--B;
				}

				if (A > 0) {
					str = str + 'a';
					--A;
				}
			} else {
				if (A > 0) {
					str = str + 'a';
					A--;
				}

				if (B > 0) {
					str = str + 'b';
					B--;
				}
			}
		}

		return str;
	}

	private static StringBuilder appendCharToStr(int A, StringBuilder str, String character) {
		if (A > 0) {
			return str.append(character);
		}
		return str;
	}

	public static void main(String... strings) {
		int A = 2, B = 6;
		System.out.println(solution(A, B));
	}
}