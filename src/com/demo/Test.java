package com.demo;

import java.lang.reflect.Method;

class Test {
	public static void main(String[] args) throws Exception {
		/*
		 * Person p1 = new Person(324, "Rajani", "CGI"); Person p2 = new
		 * Person(324, "Rajani", "CGI"); System.out.println(p1.hashCode());
		 * System.out.println(p2.hashCode()); System.out.println(p1.equals(p2));
		 * System.out.println(p1 == p2);
		 * 
		 * HashMap map1 = new HashMap<>(); map1.put(p1, "Hello"); map1.put(p2,
		 * "Hi");
		 * 
		 * HashMap map2 = new HashMap<>(); map2.put(new Person2(324, "Rajani",
		 * "CGI"), "Hello"); map2.put(new Person2(324, "Rajani", "CGI"), "Hi");
		 * 
		 * System.out.println("First Map=" + map1.entrySet());
		 * System.out.println("Second Map=" + map2.entrySet());
		 */

		System.out.println("Hello" + getEnumValuesAsStringByDelimiter(UserListingEnum.class, ","));
	}

	@SuppressWarnings("rawtypes")
	public static String getEnumValuesAsStringByDelimiter(Class<? extends Enum<?>> enumClass, String delimiter) {
		try {
			Method m = enumClass.getMethod("getValuesAsStringByDelimiter");
			return (String) m.invoke(null);
		} catch (Exception e) {
			// throw new GenericBusinessException(ReturnCode.INTERNAL_ERROR,
			// "");
		}
		return "";
	}
}