package com.demo.designpattern.builder;

import java.util.function.Consumer;

public class PersonBuilder {
	public String salutation;
	public String firstName;
	public String middleName;
	public String lastName;
	public String suffix;
	public Address address;
	public boolean isFemale;
	public boolean isEmployed;
	public boolean isHomewOwner;

	public PersonBuilder with(Consumer<PersonBuilder> builderFunction) {
		builderFunction.accept(this);
		return this;
	}

	public Person createPerson() {
		return new Person(salutation, firstName, middleName, lastName, suffix, address, isFemale, isEmployed,
				isHomewOwner);
	}

	static class AddressBuilder {
		public String city;
		public String state;
		public String pin;

		public AddressBuilder with(Consumer<AddressBuilder> builderFunction) {
			builderFunction.accept(this);
			return this;
		}

		public Address createAddress() {
			return new Address(city, state, pin);
		}
	}
}