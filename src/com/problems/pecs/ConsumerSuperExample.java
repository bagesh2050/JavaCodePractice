package com.problems.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ConsumerSuperExample {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<Integer>();
		count(ints, 5);
		System.out.println("values Added successfully for Integer" + ints);

		List<Number> nums = new ArrayList<Number>();
		count(nums, 5);
		System.out.println("values Added successfully for Number" + nums);
		
		List<Object> objs = Arrays.<Object>asList(1,"two");
		List<? super Integer> int2s = objs;
		String str = "";
		for (Object obj : int2s) str += obj.toString();
		System.out.println(str);

	}

	public static void count(Collection<? super Integer> ints, int n) {
		for (int i = 0; i < n; i++) {
			ints.add(i);
		}
	}

}