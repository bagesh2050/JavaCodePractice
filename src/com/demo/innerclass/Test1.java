package com.demo.innerclass;

public class Test1 {
	private int i = 10;
	protected static int j = 5;

	protected void show() {
		System.out.println("I am outer");
	}

	private void display() {
		System.out.println("I am outer");
	}

	protected static class Inner1 {
		private static final int k = 4;

		protected void show() {
			System.out.println("I am Inner");
		}

		private void display() {
			System.out.println("I am Inner");
		}

		private void printOuterValues() {
			//System.out.println(i);
			System.out.println(j);
		}
	}

	public static void main(String args[]) {

		System.out.println(Inner1.k);

		Inner1 inner1 = new Inner1();
		System.out.println(inner1.k);

		inner1.display();
		inner1.show();
		
		inner1.printOuterValues();
	}
}
