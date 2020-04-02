package com.demo1;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Child extends Parent {

	private static final Charset UTF_8 = Charset.forName(StandardCharsets.UTF_8.name());
	private static final Charset UTF_16 = Charset.forName(StandardCharsets.UTF_16.name());
	private static final Charset ASCII = Charset.forName(StandardCharsets.US_ASCII.name());
	private static final Charset ISO = Charset.forName("ISO-8859-1");
	private static final Charset UTF_32 = Charset.forName("UTF_32");

	public void test(String i, int j) {
		System.out.println("Hello test param child");
	}

	public static void main(String[] args) {
		// Child p = new Child();

		GFG gfc = new GFG();

		System.out.println(gfc);

		HashMap<String, String> adsf = new HashMap<>();
		adsf.put("asdasd", "sdfsd");
		adsf.put("asdassd", "sdfsd");
		adsf.put("assdasd", "sdfsd");
		System.out.println(adsf);

		String test = new String("test");
		String internTest = "test";
		String internTest1 = "test";
		String nonInternTest = new String("test");

		System.out.println(test == internTest); // prints false
		System.out.println(test != nonInternTest); // prints true
		System.out.println(test.equals(nonInternTest)); // prints true

		String str;

		Map<String, String> map = new HashMap<>();
		map.put("sfc", "sdfd");
		Map<String, String> map1 = new HashMap<>();
		map1.put("dfd", "sdfd");

		Map<Map<String, String>, String> newMap = new HashMap<>();
		newMap.put(null, null);
		newMap.put(map, null);
		newMap.put(map1, "xvyx");

		System.out.println(newMap.size());

		int sf[] = new int[] { 'a', 'Ω', 'स', '¶', '\uD840' };

		char c = 'Ї';

		int k = 0x0000;
		int h = 0xFFFF;

		System.out.println(k);
		System.out.println(h);

		char uniChar = 'Ω';

		System.out.println(c);

		System.out.println(uniChar);

		String textwithaccent = "हिन्दीЇÑäThís ís a text with accent";

		String hello = "Hello";

		// String textwithletter = "Ñandú";

		byte b[] = textwithaccent.getBytes(UTF_8);

		byte c3[] = textwithaccent.getBytes(UTF_8);

		String text1 = new String(b, UTF_32);
		// String text2 = new String(textwithletter.getBytes(ISO), UTF_8);

		String text3 = new String(b, UTF_16);

		System.out.println(textwithaccent);

		// System.out.println(textwithletter);

		System.out.println(text1);

		// System.out.println(text2);

		System.out.println(text3);

	}

	public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
		Objects.requireNonNull(cmp);
		return (Comparator<Map.Entry<K, V>> & Serializable) (c1, c2) -> cmp.compare(c1.getKey(), c2.getKey());
	}

}
