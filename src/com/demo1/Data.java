package com.demo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

	public static void main(String args[]) {
		Map<String, HashMap<String, List<String>>> dataVal = new HashMap<String, HashMap<String, List<String>>>();

		List<String> list1 = new ArrayList<>();
		list1.add("sdf");
		list1.add("asf");

		List<String> list2 = new ArrayList<>();
		list2.add("sdf");
		list2.add("asf");

		HashMap<String, List<String>> mapData = new HashMap<String, List<String>>();
		mapData.put("map1", list1);
		mapData.put("map2", list2);

		List<String> list3 = new ArrayList<>();
		list3.add("sdf3");
		list3.add("asf");

		List<String> list4 = new ArrayList<>();
		list4.add("sdf4");
		list4.add("asf");

		HashMap<String, List<String>> mapData2 = new HashMap<String, List<String>>();
		mapData.put("map3", list3);
		mapData.put("map4", list4);

		dataVal.put("mainMap1", mapData);
		dataVal.put("mainMap2", mapData2);

		for (HashMap.Entry<String, HashMap<String, List<String>>> entry : dataVal.entrySet()) {
			System.out.println(entry.getKey());

			for (HashMap.Entry<String, List<String>> innerentry : entry.getValue().entrySet()) {
				System.out.println("# " + innerentry.getKey());

				List<String> list = innerentry.getValue();

				list.forEach(action -> {
					System.out.println("* " + action);
				});
			}

		}

	}
}
