package com.demo.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {

		System.out.println("\n#### First story - With No Method overridden #########");

		Map<EmployeeWithoutHashAndEquals, String> hashMap = new HashMap<>();

		EmployeeWithoutHashAndEquals e1 = new EmployeeWithoutHashAndEquals(1, "Bagesh");
		EmployeeWithoutHashAndEquals e2 = new EmployeeWithoutHashAndEquals(2, "Shiva");

		EmployeeWithoutHashAndEquals e3 = e1;

		// Now fourth object
		EmployeeWithoutHashAndEquals e4 = new EmployeeWithoutHashAndEquals(2, "Shiva");

		System.out.println("Same Reference obj Equals Method Comparison=" + e1.equals(e3));
		System.out.println("Same Reference obj HashCode Method Comparison=" + (e1.hashCode() == e3.hashCode()));

		System.out.println("HashCode e2=" + e2.hashCode() + "  e4=" + e4.hashCode());
		System.out.println("Equal Objects Equals Method Comparison=" + e2.equals(e4));
		System.out.println("Equal Objects HashCode Method Comparison=" + (e2.hashCode() == e4.hashCode()));

		hashMap.put(e1, e1.getName());
		hashMap.put(e2, e2.getName());
		hashMap.put(e3, e3.getName());
		hashMap.put(e4, e4.getName());

		System.out.println(hashMap);

		System.out.println("\n\n#### Second story - With both Equals and Hashcode overridden #########");

		Map<EmployeeWithHashAndEquals, String> hashMap1 = new HashMap<>();

		EmployeeWithHashAndEquals e11 = new EmployeeWithHashAndEquals(1, "Bagesh");
		EmployeeWithHashAndEquals e12 = new EmployeeWithHashAndEquals(2, "Shiva");

		EmployeeWithHashAndEquals e13 = e11;

		// Now fourth object
		EmployeeWithHashAndEquals e14 = new EmployeeWithHashAndEquals(2, "Shiva");

		System.out.println("Same Reference obj Equals Method Comparison=" + e11.equals(e13));
		System.out.println("Same Reference obj HashCode Method Comparison=" + (e11.hashCode() == e13.hashCode()));

		System.out.println("HashCode e12=" + e12.hashCode() + "  e14=" + e14.hashCode());
		System.out.println("Equal Objects Equals Method Comparison=" + e12.equals(e14));
		System.out.println("Equal Objects HashCode Method Comparison=" + (e12.hashCode() == e14.hashCode()));

		hashMap1.put(e11, e11.getName());
		hashMap1.put(e12, e12.getName());
		hashMap1.put(e13, e13.getName());
		hashMap1.put(e14, e14.getName());

		System.out.println(hashMap1);

		System.out.println("\n\n#### Third story - With Only Equals overridden #########");

		Map<EmployeeWithOnlyEquals, String> hashMap3 = new HashMap<>();

		EmployeeWithOnlyEquals e21 = new EmployeeWithOnlyEquals(1, "Bagesh");
		EmployeeWithOnlyEquals e22 = new EmployeeWithOnlyEquals(2, "Shiva");

		EmployeeWithOnlyEquals e23 = e21;

		// Now fourth object
		EmployeeWithOnlyEquals e24 = new EmployeeWithOnlyEquals(2, "Shiva");

		System.out.println("Same Reference obj Equals Method Comparison=" + e21.equals(e23));
		System.out.println("Same Reference obj HashCode Method Comparison=" + (e21.hashCode() == e23.hashCode()));

		System.out.println("HashCode e22=" + e22.hashCode() + "  e24=" + e24.hashCode());
		System.out.println("Equal Objects Equals Method Comparison=" + e22.equals(e24));
		System.out.println("Equal Objects HashCode Method Comparison=" + (e22.hashCode() == e24.hashCode()));

		hashMap3.put(e21, e21.getName());
		hashMap3.put(e22, e22.getName());
		hashMap3.put(e23, e23.getName());
		hashMap3.put(e24, e24.getName());

		System.out.println(hashMap3);

		System.out.println("\n\n#### Fourth story - With Only HashCode overridden #########");

		Map<EmployeeWithOnlyHashcode, String> hashMap4 = new HashMap<>();

		EmployeeWithOnlyHashcode e31 = new EmployeeWithOnlyHashcode(1, "Bagesh");
		EmployeeWithOnlyHashcode e32 = new EmployeeWithOnlyHashcode(2, "Shiva");

		EmployeeWithOnlyHashcode e33 = e31;

		// Now fourth object
		EmployeeWithOnlyHashcode e34 = new EmployeeWithOnlyHashcode(2, "Shiva");

		System.out.println("Same Reference obj Equals Method Comparison=" + e31.equals(e33));
		System.out.println("Same Reference obj HashCode Method Comparison=" + (e31.hashCode() == e33.hashCode()));

		System.out.println("HashCode e32=" + e32.hashCode() + "  e34=" + e34.hashCode());
		System.out.println("Equal Objects Equals Method Comparison=" + e32.equals(e34));
		System.out.println("Equal Objects HashCode Method Comparison=" + (e32.hashCode() == e34.hashCode()));

		hashMap4.put(e31, e31.getName());
		hashMap4.put(e32, e32.getName());
		hashMap4.put(e33, e33.getName());
		hashMap4.put(e34, e34.getName());

		System.out.println(hashMap4);
	}

}
