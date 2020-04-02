package com.demo1;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String arr[] = reader.readLine().split(" ");

			for (String string : arr) {
				System.out.println(string);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);

		int aSize = 0;
		int bSize = 0;
		int cSize = 0;

		String s1 = scanner.nextLine();

		String[] aSizeArray = s1.split(" ");

		try {
			aSize = Integer.parseInt(aSizeArray[0]);
			bSize = Integer.parseInt(aSizeArray[1]);
			cSize = Integer.parseInt(aSizeArray[2]);
		} catch (Exception e) {
		}

		System.out.println("aSize=" + aSize + " bSize=" + bSize + " cSize=" + cSize);

		int[] aArray = new int[aSize];

		int b = 0;
		while (scanner.hasNext() && b < aSize) {
			aArray[b++] = scanner.nextInt();
		}

		for (int i = 0; i < aSize; i++) {
			aArray[i] = scanner.nextInt();
		}

		for (int i : aArray) {
			System.out.print(i + " ");
		}

		System.out.println(" ");

		int[] bArray = new int[bSize];

		for (int j = 0; j < bSize; j++) {
			bArray[j] = scanner.nextInt();
		}

		System.out.println("B Array");

		for (int i : bArray) {
			System.out.print(i + " ");
		}

		Balloon red = new Balloon("Red"); // memory reference 50
		Balloon blue = new Balloon("Blue"); // memory reference 100

		/*
		 * Balloon temp = red; red = blue; blue = temp;
		 */
		swap(red, blue);

		System.out.println("red color=" + red.getColor());
		System.out.println("blue color=" + blue.getColor());

		foo(blue);
		System.out.println("blue color=" + blue.getColor());

		LinkedList<Integer> list = new LinkedList<>();
		list.add(-10);
		list.add(8);
		list.add(-20);
		list.add(7);

		Comparator<Integer> comp = Comparator.reverseOrder();

		Collections.sort(list, comp);

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

	private static void foo(Balloon balloon) { // baloon=100
		balloon.setColor("Red"); // baloon=100
		balloon = new Balloon("Green"); // baloon=200
		balloon.setColor("Blue"); // baloon = 200
	}

	// Generic swap method
	public static void swap(Balloon o1, Balloon o2) {
		Balloon temp = o1;
		o1 = o2;
		o2 = temp;

		System.out.println("red color=" + o1.getColor());
		System.out.println("blue color=" + o2.getColor());
	}
}