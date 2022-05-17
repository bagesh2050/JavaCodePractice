package com.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGrouping {

	public static void main(String... strings) {
		List<String> objects = Arrays.asList("red", "orange", "red", "yellow", "orange", "red");

		Map<String, Long> countForId = objects.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

		System.out.println(countForId);

		List<Employee> employees = Arrays.asList(new Employee("Jaideep", "OLPS", 10), new Employee("Ajay", "CVS", 40),
				new Employee("Kamal", "OLPS", 30), new Employee("Amit", "OLPS", 70), new Employee("Rajeev", "CVS", 50),
				new Employee("Mohita", "XCL", 30));

		Map<String, List<Employee>> byDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentName));

		Set<Entry<String, List<Employee>>> employeeMap = byDept.entrySet();
	}
}
