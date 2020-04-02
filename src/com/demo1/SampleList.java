package com.demo1;
import java.util.ArrayList;
import java.util.List;

class SampleList {
	static class SampleListM {

		int size1 = 1;

		// AtomicInteger size = new AtomicInteger(1);

		// AtomicBoolean isFull = new AtomicBoolean(false);

		/** needs to be synchronized to ensure correctness of this program **/
		public synchronized void modifyList(List<String> someList) {

			int randomNo = (int) ((Math.random()) * 100 % 5);

			if (someList.size() <= 10) {

				/* ++size1; */

				System.out.println(Thread.currentThread().getName() + "  Adding " + randomNo + " : " + someList.size());

				someList.add("Number " + randomNo);

			} else {
				System.out.println(Thread.currentThread().getName() + " List is full " + someList.size());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block e.printStackTrace();
				}

			}
		}
	}

	/**
	 * main method creates the shared list and passes it to the instances that
	 * modify it via method reference. Running this will show that that
	 * conditional check of list size < 10 for insert is not seen by all threads
	 * and list size goes beyond the size expected.
	 * 
	 * To fix this - we can synchronize the access to "modifyList" method
	 */
	public static void main(String[] args) {
		SampleListM listObj = new SampleListM();
		List<String> mList = new ArrayList<String>(10);

		for (int i = 0; i < 2; i++) {
			Thread t1 = new Thread(() -> {
				while (true) {
					new SampleListM().modifyList(mList);
					/*
					 * try { Thread.sleep(1000); } catch (InterruptedException
					 * e) { // TODO Auto-generated catch block
					 * e.printStackTrace(); }
					 */
				}
			});
			t1.start();
		}
	}
}