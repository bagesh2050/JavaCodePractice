package com.demo1;

public class Child1 extends Parent1 {

	public Child1() {

	}

	public Child1(int a, int b) {
		super(a, b);
	}

	protected void show() {
		System.out.println("Show");
	}

	private void showPrivate() {
		System.out.println("Show Private");
	}

	void show(String hello, String defaultStr) {
		System.out.println("Show " + hello + " " + defaultStr);
	}

	public void showPublic() {
		System.out.println("Public Show ");
	}

	public static void main(String arg[]) {
		Child1 ch = new Child1(1, 2);
		ch.print();

		Child1 ch1 = new Child1();
		ch1.print();
	}

	public String showHello() {
		System.out.println("Child ShowHello");
		return null;
		
	}
}
