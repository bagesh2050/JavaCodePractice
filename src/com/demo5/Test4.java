package com.demo5;

public class Test4 {
 public static void main(String[] args) {
	 
	 try {
	System.out.println(doMethod(args));
	 }catch (Exception e) {
		System.out.println("hello");
	}
	
	doMethod(args);
}
 
 static int doMethod(String[] args) {
	 return Integer.parseInt(args[0]);
 }
}
