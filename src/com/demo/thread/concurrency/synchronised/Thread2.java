package com.demo.thread.concurrency.synchronised;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		Person pooja = new Person();
		pooja.getName("Pooja", "Thread2");
		pooja.getAge(20, "Thread2");
		
	}
}
