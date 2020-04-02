package com.demo.synchronize;

public class Thread2 implements Runnable {

	@Override
	public void run() {

		getCall();
	}

	public static void getCall() {
		System.out.println("Inside synchronized of Thread2");

		System.out.println("Notify called from Thread2");

	}
}
