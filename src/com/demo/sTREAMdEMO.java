package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sTREAMdEMO {

	public static void main(String arg[]) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		
		List<Integer> trp = number.stream().map(x->x*3).collect(Collectors.toList());
		
		List<Integer> vtrp = number.stream().filter(x->x>3).collect(Collectors.toList());
		
		List<String> strList = new ArrayList(){{add("Hello"); add("sdgdfg"); add("sdfdgrtjt");}};
		
		List<String> str = strList.stream().filter(x->x.equals("Hello")).collect(Collectors.toList());
		
		System.out.println(square);
		System.out.println(trp);
		System.out.println(vtrp);
		System.out.println(str);
	}
}
