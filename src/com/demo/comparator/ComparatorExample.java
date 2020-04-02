package com.demo.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
		employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

		System.out.println("Employees : " + employees);

		List<Employee> newEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());

		System.out.println("\nEmployees (Sorted by Name new ) : " + newEmployees);

		Collections.sort(employees, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		System.out.println("\nEmployees (Sorted by Name Comparator ) : " + employees);

		// Sort employees by Name
		Collections.sort(employees, Comparator.comparing(Employee::getName));

		System.out.println("\nEmployees (Sorted by Name) : " + employees);

		// Sort employees by Salary
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
		System.out.println("\nEmployees (Sorted by Salary) : " + employees);

		// Sort employees by JoiningDate
		Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
		System.out.println("\nEmployees (Sorted by JoiningDate) : " + employees);

		// Sort employees by Name in descending order
		Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
		System.out.println("\nEmployees (Sorted by Name in descending order) : " + employees);

		// Chaining multiple Comparators
		// Sort by Salary. If Salary is same then sort by Name
		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));
		System.out.println("\nEmployees (Sorted by Salary and Name) : " + employees);

		Collections.sort(employees, new EmployeeSortByName());

		System.out.println("\nEmployees (Sorted by  Name) : " + employees);

		Collections.sort(employees, new EmployeeSortBySalary());

		System.out.println("\nEmployees (Sorted by  Salary) : " + employees);
	}
}

class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class EmployeeSortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}
}