package com.demo;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadExample extends Thread {

	ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

	public static void main(String arg[]) {
		Thread t1 = new Thread(new RunnableExample());
		t1.start();

		ThreadExample t2 = new ThreadExample();
		t2.start();

	}

	public void run() {
		System.out.println("Thread run");
	}

	public void start() {
		System.out.println("starting thread");
		super.start();
	}
}
