package com.demo.consumer;

import java.util.Arrays;
import java.util.List;

public class BasicConsumer {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		names.forEach(name -> System.out.println("Hello, " + name));
	}
}
