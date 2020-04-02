package com.demo.thread.concurrency.synchronised;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		Person ajay = new Person();
		ajay.getName("Ajay", "Thread1");
		ajay.getAge(30, "Thread1");
	}
}
