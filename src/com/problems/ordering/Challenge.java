package com.problems.ordering;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge {
	public static int[] reorderDigits(int[] arr, String orderBy) {
		int[] output = new int[arr.length];
		AtomicInteger counter = new AtomicInteger(0);
		IntStream.of(arr).boxed().map(String::valueOf).forEach(s -> {
			Comparator<Integer> comp1 = Comparator.naturalOrder();
			if (orderBy.equalsIgnoreCase("desc")) {
				comp1 = Comparator.reverseOrder();
			}
			String formatted = Stream.of(s.split("")).map(Integer::parseInt).sorted(comp1).map(String::valueOf)
					.collect(Collectors.joining());
			output[counter.getAndIncrement()] = Integer.parseInt(formatted);
		});
		return output;
	}
}