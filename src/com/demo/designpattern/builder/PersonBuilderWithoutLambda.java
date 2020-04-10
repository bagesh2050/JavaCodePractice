package com.demo.designpattern.builder;

public class PersonBuilderWithoutLambda {
	private String salutation;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private Address address;
	private boolean isFemale;
	private boolean isEmployed;
	private boolean isHomewOwner;

	public PersonBuilderWithoutLambda withSalutation(String salutation) {
		this.salutation = salutation;
		return this;
	}

	public PersonBuilderWithoutLambda withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilderWithoutLambda withMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public PersonBuilderWithoutLambda withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilderWithoutLambda withSuffix(String suffix) {
		this.suffix = suffix;
		return this;
	}

	public PersonBuilderWithoutLambda withAddress(Address address) {
		this.address = address;
		return this;
	}

	public PersonBuilderWithoutLambda withIsFemale(boolean isFemale) {
		this.isFemale = isFemale;
		return this;
	}

	public PersonBuilderWithoutLambda withIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
		return this;
	}

	public PersonBuilderWithoutLambda withIsHomewOwner(boolean isHomewOwner) {
		this.isHomewOwner = isHomewOwner;
		return this;
	}

	public Person createPerson() {
		return new Person(salutation, firstName, middleName, lastName, suffix, address, isFemale, isEmployed,
				isHomewOwner);
	}
}