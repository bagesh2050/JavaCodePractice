package com.demo.thread.concurrency;

public class ThreadDemo {

	public static void main(String args[]) {

		Sample sam = new Sample(10);

		for (int i = 0; i < 100; i++) {
			final int a[] = new int[1];
			a[0] = i;

			Thread t1 = new Thread(() -> {
				try {
					// Thread.sleep(90);
					System.out.println(sam.increment(a[0]));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			t1.start();
		}

		for (int j = 0; j < 100; j++) {
			final int a[] = new int[1];
			a[0] = j;

			Thread t2 = new Thread(() -> {
				try {
					// Thread.sleep(50);
					System.out.println(sam.decrement(a[0]));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			t2.start();
		}

		Thread t3 = new Thread(() -> {
			try {
				System.out.println(sam.mutiply(2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		// t3.start();
	}
}
