package com.demo.naggrao;

public class Test1 {

	public static void main(String[] args) {
		convert();
	}

	static void convert() {
		String result = "";

		//String input = "this_is_a_variable";
		//String input = "thisIs_a_variable";
		//String input = "thisIsAVariable";
		String input = "thisIsAVariable";

		int underscoreCount = 0;

		char c[] = input.toCharArray();

		/*
		 * if (input.contains("_")) { isCVariable = true; }
		 */

		for (int i = 0; i < c.length; i++) {

			if (Character.isUpperCase(c[i]) && underscoreCount == 0) {
				result += "_" + Character.toLowerCase(c[i]);

			} else if (c[i] == '_') {

				if (underscoreCount == 0) {
					result = input.substring(0, i);
				}

				i++;

				char chr = Character.toUpperCase(c[i]);

				result += chr;

				underscoreCount++;
			} else {
				result += c[i];

			}
		}

		System.out.println("Result =" + result);
	}

}
