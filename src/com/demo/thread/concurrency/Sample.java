package com.demo.thread.concurrency;

public class Sample {
	private Integer a;

	public Sample(int a) {
		this.a = a;
	}

	public int increment(int i) throws InterruptedException {
		synchronized (this) {
			System.out.println("Inside method increment i=" + i);

			Thread.sleep(50);

		}

		System.out.println("Outside method increment i=" + i);
		return ++a;
	}

	public int decrement(int i) throws InterruptedException {
		synchronized (this) {
			System.out.println("Inside method decrement i=" + i);
			// Thread.sleep(500);
		}

		System.out.println("Outside method decrement i=" + i);
		return --a;
	}

	public static synchronized int mutiply(int a) throws InterruptedException {
		System.out.println("Inside method mutiply");
		// Thread.sleep(1000);
		System.out.println("OutSide method mutiply");
		return a * ++a;
	}
}
