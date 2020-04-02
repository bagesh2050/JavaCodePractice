package com.demo.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Fruit {
	@Override
	public String toString() {
		return "I am a Fruit !!";
	}
}

class Apple extends Fruit implements Comparable<Apple> {
	private String name;

	public Apple() {

	}

	public Apple(String name) {
		this.setName(name);
	}

	@Override
	public String toString() {
		return "I am an Apple !!";
	}

	@Override
	public int compareTo(Apple arg0) {
		return this.getName().compareTo(arg0.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class RedApple extends Apple {
	@Override
	public String toString() {
		return "I am a RedApple !!";
	}
}

class GreenApple extends Apple{

	private String name;

	public GreenApple() {

	}

	public GreenApple(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "I am a GreenApple !!";
	}

	@Override
	public int compareTo(Apple arg0) {
		return this.name.compareTo(arg0.getName());
	}
}

public class GenericsExamples {
	public static void main(String[] args) {
		// List of apples
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());
		apples.add(new Apple());

		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit());
		fruits.add(new Fruit());
		fruits.addAll(apples);
		fruits.add(new GreenApple());
		fruits.add(new RedApple());

		// We can assign a list of apples to a basket of fruits;
		// because apple is subtype of fruit
		List<? extends Fruit> basket = fruits;

		// Here we know that in basket there is nothing but fruit only
		for (Fruit fruit : basket) {
			System.out.println(fruit);
		}

		// basket.add(new Apple()); //Compile time error
		// basket.add(new Fruit()); //Compile time error

		System.out.println("\n\n");

		List<? super Fruit> newList = new ArrayList<>();
		newList.add(new RedApple());
		newList.add(new Apple());
		newList.add(new GreenApple());
		newList.add(new Fruit());

		for (Object fruit : newList) {
			System.out.println(fruit);
		}

		System.out.println("\n\n");
		
		SortedSet sortSet = new TreeSet<>();
		sortSet.add(new Apple("Apple"));
		sortSet.add(new GreenApple("GreenApple"));
		sortSet.add(new GreenApple("GreenApple"));

		System.out.println(sortSet);

	}
}