package com.demo.synchronize;

public class Demo2 {

	volatile static int value = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 1050; i++) {
			Runnable r = () -> {
				increment();
			};

			Thread t = new Thread(r);
			t.start();

			/*
			 * try { t.join(); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		}

		System.out.println("Increment Value=" + value);
	}

	static synchronized void increment() {
		value++;
	}
}
