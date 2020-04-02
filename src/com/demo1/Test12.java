package com.demo1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test12 {

	public static void main(String arg[]) {
		// Test12 testObj = (Test12)null;

		test("");
	}

	static void test(String s) {

		try (BufferedReader r = new BufferedReader(new FileReader("Food.java"));) {
			System.out.println("String class");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void test(Object o) {
		System.out.println("Object class");
	}
}
