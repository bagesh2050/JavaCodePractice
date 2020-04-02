package com.demo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Food {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int numberOfDay = in.nextInt();
		ArrayList<String> fullingret = new ArrayList<>(numberOfDay);
		ArrayList<String> ingret = new ArrayList<>(numberOfDay);

		for (int i = 0; i < numberOfDay; i++) {
			String item = in.next();
			fullingret.add(item);
			if (item.startsWith("FAT")) {
				ingret.add("F");
			} else if (item.startsWith("FIBER")) {
				ingret.add("B");
			} else if (item.startsWith("CARB")) {
				ingret.add("C");
			}
		}

		Iterator<String> itr = ingret.iterator();

		int root = 0;
		int next = 1;

		while (itr.hasNext()) {
			numberOfDay = ingret.size();
			// String item = itr.next();

			if (root < numberOfDay - 2 && next < numberOfDay - 1) {
				if (ingret.get(root).equals(ingret.get(next)) && next > root + 1) {
					System.out.println(
							fullingret.get(root) + " " + fullingret.get(root + 1) + " " + fullingret.get(next));
					ingret.remove(root);
					ingret.remove(root + 1);
					ingret.remove(next);

					root = root + 2;
					next = next + 1;
				} else if (ingret.get(root + 1).equals(ingret.get(next)) && next > root + 2) {
					System.out.println(
							fullingret.get(root) + " " + fullingret.get(root + 1) + " " + fullingret.get(next));
					ingret.remove(root);
					ingret.remove(root + 1);
					ingret.remove(next);
					root = root + 2;
					next = next + 1;
				} else {
					next++;
				}
			}
		}
	}
}
