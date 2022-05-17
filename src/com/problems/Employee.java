package com.problems;

public class Employee {
	private String employeeName;
	private String departmentName;
	private int salary;

	public Employee(String employeeName, String departmentName, int salary) {
		super();
		this.employeeName = employeeName;
		this.departmentName = departmentName;
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
