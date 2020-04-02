package com.demo.synchronize;

public class Thread1 implements Runnable {

	@Override
	public void run() {

		getCall();

		System.out.println(Demo.arrayList);
	}

	public void getCall() {

		synchronized (Demo.arrayList) {

			System.out.println("Inside synchronized of Thread1");

			Demo.arrayList.add("Hello");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("wait called");
		}
	}
}
