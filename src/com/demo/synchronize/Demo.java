package com.demo.synchronize;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static List<String> arrayList = new ArrayList<>();

	public static void main(String... strings) {

		Thread thread1 = new Thread(new Thread1());
		thread1.start();

		Thread thread3 = new Thread(new Thread1());
		thread3.start();

		Thread thread4 = new Thread(new Thread1());
		thread4.start();

		Thread thread2 = new Thread(new Thread2());
		thread2.start();
	}
}
