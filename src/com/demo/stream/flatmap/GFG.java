package com.demo.stream.flatmap;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GFG {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();

		LocalDate firstMonday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		
		System.out.println("First Monday="+firstMonday.getDayOfMonth());
		
		LocalDate secondFridayofNextMonth = now.with(TemporalAdjusters.dayOfWeekInMonth(6, DayOfWeek.FRIDAY));
		
		System.out.println("Second Friday of Month="+secondFridayofNextMonth.getDayOfMonth());

		// Creating a List of Strings
		List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

		// Using Stream flatMap(Function mapper)
		list.stream().flatMap(str -> Stream.of(str)).collect(Collectors.toList());

		list.stream().map(str -> str.charAt(2)).forEach(System.out::println);

		List<Stream<String>> list1 = Arrays.asList(Stream.of("Geeks1"), Stream.of("GFG1"), Stream.of("GeeksforGeeks1"),
				Stream.of("gfg1"));

		Stream<String> listStream = list1.stream().flatMap(str -> str);
		listStream.forEach(System.out::println);

		Stream<Stream<String>> list2 = Arrays
				.asList(Stream.of("Geeks2"), Stream.of("GFG2"), Stream.of("GeeksforGeeks2"), Stream.of("gfg2"))
				.stream();

		Predicate<String> predContainsLetterG = str -> str.contains("G");
		list2.map(str -> str.filter(predContainsLetterG)).flatMap(str -> str).forEach(System.out::println);

		Stream<Stream<String>> list3 = Arrays
				.asList(Stream.of("Geeks3"), Stream.of("GFG3"), Stream.of("GeeksforGeeks3"), Stream.of("gfg3"))
				.stream();
		list3.map(str -> str.map(str2 -> str2.concat(" Hello"))).flatMap(str -> str).forEach(System.out::println);
	}
}