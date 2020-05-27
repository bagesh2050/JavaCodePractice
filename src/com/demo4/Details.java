package com.demo4;

import java.math.BigInteger;

public class Details {

	public long BinaryToDecimal(BigInteger binaryNumber) {

		BigInteger decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber.intValue() == 0) {
				break;
			} else {
				BigInteger temp = binaryNumber.remainder(BigInteger.valueOf(10));
				decimal = decimal.add(temp.multiply(BigInteger.valueOf((long) Math.pow(2, p))));
				binaryNumber = binaryNumber.remainder(BigInteger.valueOf(10));
				p++;
			}
		}
		return decimal.longValue();
	}

	public static void main(String args[]) {
		Details obj = new Details();
		System.out.println("110 --> " + obj.BinaryToDecimal(110));
		System.out.println("1101 --> " + obj.BinaryToDecimal(1101));
		System.out.println("100 --> " + obj.BinaryToDecimal(100));
		System.out.println("1101111111111111111111111111111111111111111111111111111111111111111 --> "
				+ obj.BinaryToDecimal(BigInteger.bin));
	}
}