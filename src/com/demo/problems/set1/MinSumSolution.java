package com.demo.problems.set1;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'minSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * following parameters: 1. INTEGER_ARRAY num 2. INTEGER k
	 */

	public static int minSum(List<Integer> num, int k) {
		
		System.out.println(num.toString());
		
		System.out.println("k="+k);
		
		// Write your code here
		for (int i = 0; i < k; i++) {
			int max = Collections.max(num);

			num.remove(new Integer(max));

			int newValue = (int) Math.ceil((double) max / 2);

			num.add(newValue);
		}

		return sum(num);
	}

	public static int sum(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

}

public class MinSumSolution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int numCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> num = IntStream.range(0, numCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		int k = Integer.parseInt(bufferedReader.readLine().trim());

		//System.out.println("k=" + k);

		int result = Result.minSum(num, k);

		System.out.println("Result=" + result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
