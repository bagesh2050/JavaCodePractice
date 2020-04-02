package com.demo.consumer;

import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {

		Supplier<Person> supplier = () -> {
			return new Person("Varun", 30, "Programmer");
		};

		Person p = supplier.get();
		System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());

		Supplier<Employee> supplier2 = () -> {
			return new Employee(1, "Robert", 35, "Manager");
		};

		Employee emp = supplier2.get();
		System.out.println(emp.getDesignation());

	}
}