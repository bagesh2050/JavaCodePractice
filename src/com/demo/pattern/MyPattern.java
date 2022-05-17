package com.demo.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPattern {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^[\\w-.�\u002C@�������������\\s]{0,35}$");
		Matcher m = p.matcher("Town 12A_-,a2�@�����������-,_.����");
		boolean b = m.matches();

		System.out.println("match=" + b);
	}
}

