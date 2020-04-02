package com.demo.function;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		short[] array = {(short) 1, (short) 2, (short) 3};
		byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));
		 
		byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};
		
		System.out.println(Arrays.toString(expectedArray));
		
		System.out.println(Arrays.toString(transformedArray));
		
		assertArrayEquals(expectedArray, transformedArray);
	}
	
	public static byte[] transformArray(short[] array, ShortToByteFunction function) {
	    byte[] transformedArray = new byte[array.length];
	    for (int i = 0; i < array.length; i++) {
	        transformedArray[i] = function.applyAsByte(array[i]);
	    }
	    return transformedArray;
	}
}
