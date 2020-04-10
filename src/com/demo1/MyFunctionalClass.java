package com.demo1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MyFunctionalClass implements MyFunctionIn {

	@Override
	public void sdf() {
		System.out.println("Hello functional method");

	}

	public static void main(String... arg) {
		MyFunctionIn.abcd();

		MyFunctionIn xfsd = () -> System.out.println("functional method bypassed");

		xfsd.cff();
		xfsd.sdf();
		xfsd.toString();

		MyFunctionIn scsd = new MyFunctionalClass();
		scsd.sdf();

		Function<Integer, String> intToString = String::valueOf;
		Function<String, String> quote = s -> "'" + s + "'";
		Function<Integer, String> quoteIntToString = quote.compose(intToString);
		System.out.println(quoteIntToString.apply(5));
		
		List<String> places = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
		
		//List<String> places = List.of("Buenos Aires", "Córdoba", "La Plata");
		
		String s1 ="SITA";
		String s2 ="RAM";
		
		StringBuffer sb = new StringBuffer("SITA");
		
		System.out.println(s1.charAt(0)>s2.charAt(0));
		System.out.println(sb.equals(s1));
		
	}
}
