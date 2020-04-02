package com.demo;

class Person2 {
	private int id;
	private String name;
	private String org;

	Person2(int id, String name, String org) {
		this.id = id;
		this.name = name;
		this.org = org;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOrg() {
		return org;
	}

	
	public String toString() {
		return " Person id " + id + " name " + name + " Organization " + org;
	}
}