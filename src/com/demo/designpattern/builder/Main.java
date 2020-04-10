package com.demo.designpattern.builder;

public class Main {

	public static void main(String[] args) {
		Person person = new PersonBuilder().with($ -> {
			$.salutation = "Mr.";
			$.firstName = "John";
			$.lastName = "Doe";
			$.isFemale = false;
			$.isHomewOwner = true;
			$.address = new PersonBuilder.AddressBuilder().with($_address -> {
				$_address.city = "Pune";
				$_address.state = "MH";
				$_address.pin = "411001";
			}).createAddress();
		}).createPerson();

		System.out.println("Person=" + person.toString());
	}
}
