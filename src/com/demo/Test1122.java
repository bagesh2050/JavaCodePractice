package com.demo;

public class Test1122 {

	public static void main(String... strings) {
		Test1122 test1 = new Test1122();

		synchronized (test1) {

			try {
				test1.wait();
				
				test1.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Hello");
	}

}
