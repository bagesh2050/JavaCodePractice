package com.problems;

import java.util.concurrent.CountDownLatch;

class DoSomethingInAThread implements Runnable {
	CountDownLatch latch;

	public DoSomethingInAThread(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			System.out.println("Do some thing" + latch.getCount());
			latch.countDown();
		} catch (Exception err) {
			// err.printStackTrace();
			System.out.println(err);
		}
	}
}

public class CountDownLatchDemo {
	public static void main(String[] args) {
		try {
			CountDownLatch latch = new CountDownLatch(2);
			for (int n = 0; n < 1000; n++) {
				Thread t = new Thread(new DoSomethingInAThread(latch));
				t.start();
			}
			latch.await();
			System.out.println("In Main thread after completion of 1000 threads");
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}