package com.demo.biconsumer;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Freddy", 24);
		ages.put("Samuel", 30);
		 
		ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
		
		String hello = "Hello";
		
		hello.chars()
        .mapToObj(i -> i)
        .forEach(System.out::println);

	}
}
