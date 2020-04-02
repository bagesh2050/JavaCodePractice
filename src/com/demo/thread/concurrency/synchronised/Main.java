package com.demo.thread.concurrency.synchronised;

public class Main {
	public static void main(String args[]) {
		Thread thread1 = new Thread(new Thread1());
		Thread thread2 = new Thread(new Thread2());

		thread1.start();
		thread2.start();
	}
}
