package com.problems.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ProducerExtendsExample {
	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3);
		System.out.println("sum of integer list " + sum(ints));

		List<Double> doubles = Arrays.<Double>asList(2.78, 3.14);
		System.out.println("sum of double list " + sum(doubles));

		List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);
		System.out.println("sum of numeric list " + sum(nums));
		
		List<Integer> int2s = new ArrayList<Integer>();
		int2s.add(1);
		int2s.add(2);
		List<? extends Number> num2s = int2s;
		num2s.add(null);  // ok
		//num2s.add(int2s);
		//num2s.add(doubles);
		//num2s.add(nums);
		
		System.out.println(num2s);

	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;

		for (Number num : nums)
			s += num.doubleValue();

		return s;
	}

}