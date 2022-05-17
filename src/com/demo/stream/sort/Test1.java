package com.demo.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<Person> list1 = Arrays.asList(new Person("Bagesh", 34), new Person("Ajay", 31), new Person("Ajay", 50),
				new Person("Rakesh", 32), new Person("Sanjeev", 44));

		long count = list1.stream().count();

		System.out.println("Number of persons = " + count);

		System.out.println(list1.stream().allMatch(p -> p.getAge() > 35));

		System.out.println(list1.stream().anyMatch(p -> p.getAge() > 35));

		Comparator<Person> nameComparator = Comparator.comparing(Person::getName, (s1, s2) -> {
			return s2.compareTo(s1);
		});

		Comparator<Person> ageComparator = Comparator.comparing(Person::getAge, (s1, s2) -> {
			return s1.compareTo(s2);
		});

		Comparator<Person> comp1 = (p1, p2) -> p1.getName().compareTo(p2.getName());
		Comparator<Person> comp2 = (p1, p2) -> p2.getAge() - p1.getAge();

		list1.stream().sorted(comp1.thenComparing(comp2)).forEach(p -> {
			System.out.print(p.getName());
			System.out.print("  ");
			System.out.println(p.getAge());
		});

	}
}
