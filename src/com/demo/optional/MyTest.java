package com.demo.optional;

public class MyTest {

	public static void main(String[] args) {
		Integer id = 10;

		System.out.println("Optional " + Optional.ofNullable(id).map(t -> t * 2).orElse(getMyDefault()));

		System.out.println("Optional " + Optional.ofNullable(id).map(t -> t * 2).orElseGet(this::getMyDefault()));
	}

	public void getData() {
		System.out.println("Optional " + Optional.ofNullable(id).map(t -> t * 2).orElseGet(this::getMyDefault()));
	}

	public Integer getMyDefault() {
		System.out.println("Getting Default Value");
		return 12;
	}
}
