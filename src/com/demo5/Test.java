package com.demo5;

import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
       String cities[] = {"Banglore","Pune", "San Fran","New york"};
       MySort ms = new MySort();
	}
	
	static class MySort implements Comparator{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
