package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Child extends Parent {

	static String value = "Child Value";
	String name = "Child";

	public Child(int x) {
		super(x);

		System.out.println("Child constructor called");
	}

	public String show() {
		System.out.println("Hello Show child");
		return null;
	}

	public static void getValue() {
		System.out.println("Get Value of Child called");
	}

	public static void main(String... args) {
		
		Parent parent = new Child(5);

		Child ch = (Child) parent;

		parent.getValue();

		ch.getValue();

		parent.show();
		
		parent.wait();

		ch.show();
		ch.sds();
		ch.sds2();

		Collection<Number> list = new ArrayList<Number>();
		list.add(1);
		list.add(2);

		Integer elem[] = new Integer[] { 3, 4 };

		addAll(list, elem);

		List<? extends Parent> foo3 = new ArrayList<Parent>(); // Number
																// "extends"
																// Number (in
																// this context)
		List<? extends Fruit> foo1 = new ArrayList<Fruit>(); // Integer
																// extends
																// Number
		List<? extends Number> foo2 = new ArrayList<Double>();

		Parent parent1 = new Parent(10);
		Child p1 = new Child(10);
		foo3.add(p1);
		foo3.add(parent1);

		Parent m1 = foo3.get(0);

		foo1.add(new WaterMelon());

	}

	/*
	 * private static void addAll(Collection<Integer> list, Number[] elem) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 */

	public static <K, T> boolean addAll(Collection<? super T> c, K... elements) {

		return true;
	}

	{
		System.out.println("child instance block executed " + name);
	}

	static {
		System.out.println("static block executed " + value);
	}

}
