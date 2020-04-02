package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Base {

	void show(int... i) {
		System.out.println("Array like input" + i[0]);
	}

	void show(int i, int j, int k) {
		System.out.println("Individual Input i=" + i);
	}

	void show(String str) {
		System.out.println(str + " Parent");
	}

	public static void main(String... strings) {

		/*for (String str : TimeZone.getAvailableIDs())
			System.out.println(str);*/

		//LocalDate todayDate = LocalDate.now(ZoneId.of("Africa/Asmera"));

		/*ZoneId zoneId = ZoneId.of("UTC+5:30").normalized();
		String Id = ZoneOffset.of("UTC+5:30").getId();*/
		
		/*ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");
		OffsetDateTime date = OffsetDateTime.now(zoneOffSet);*/
		
		//System.out.println("date="+date.getYear());
		
		//LocalDate todayDateNew = LocalDate.now(zoneId);

		//System.out.println("Date="+Id);

		/*System.out.println("Time=" + todayDate);

		Base b = new Base();
		b.show(1, 2, 3);

		b.show(1, 2);

		b.show(1);

		b.show(1, 2, 3, 4);*/
		
		TreeSet set = new TreeSet<>();
		//set.add(new Person(1,"Bagesh","sdsd"));
		//set.add(set);
		//set.add(null);
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(-1);
		hashSet.add(-1);
		hashSet.add(-4);
		hashSet.add(4);
		hashSet.add(null);
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(-1);
		linkedHashSet.add(-1);
		linkedHashSet.add(-4);
		linkedHashSet.add(4);
		linkedHashSet.add(null);
		
		System.out.println("Set="+set.size());
		System.out.println("HashSet Set="+hashSet.size());
		System.out.println(hashSet);
		System.out.println(linkedHashSet);
		
	}
}