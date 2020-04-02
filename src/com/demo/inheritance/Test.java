package com.demo.inheritance;

import java.io.IOException;

public class Test {
	public static void main(String... strings) throws IOException {
		Parent p1 = new Parent();
		Parent p2 = new Child();

		p1.show();

		p2.show();
	}
}
