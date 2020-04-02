package com.demo.thread.concurrency.synchronised;

public class Person {

	public  synchronized void getName(String name, String threadName) {
		System.out.println("Calling getName Method from " + threadName);
		long startTime = System.currentTimeMillis();

		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Name is " + name + "  Time=" + (endTime - startTime) + " " + threadName);
	}

	public static synchronized void getAge(int age, String threadName) {
		System.out.println("Calling getAge Method from " + threadName);
		long startTime = System.currentTimeMillis();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Age =" + age + "  Time=" + (endTime - startTime) + " " + threadName);
	}
}
