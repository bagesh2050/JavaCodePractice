package com.demo.designpattern.builder;

public class Address {
	private final String city;
	private final String state;
	private final String pin;

	public Address(String city, String state, String pin) {
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "city : " + city + "\n state : " + state + "\n pin : " + pin;
	}
}