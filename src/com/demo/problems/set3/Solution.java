package com.demo.problems.set3;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int len = s.length();
		long counter = 0;

		/*
		 * char[] arr;
		 * 
		 * for(int i=0;i<len;i++){ arr[i]=s.charAt(index) }
		 */

		if (len == 0)
			return 0;
		else if (len == 1 && s.equals("a"))
			return n;
		else {
			long divisor = n / len;

			long aCounts = 0;

			for (int i = 0; i < len; i++) {
				if (s.charAt(i) == 'a') {
					aCounts++;
				}
			}

			counter = divisor * aCounts;

			//
			long remd = n % len;

			for (int i = 0; i < remd; i++) {
				if (s.charAt(i) == 'a') {
					counter++;
				}
			}
		}

		return counter;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long startTime = System.currentTimeMillis();
		long result = repeatedString(s, n);

		System.out.println("Result=" + result + " Time=" + (System.currentTimeMillis() - startTime));

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		// kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm
		// 736778906400
		scanner.close();
	}
}
