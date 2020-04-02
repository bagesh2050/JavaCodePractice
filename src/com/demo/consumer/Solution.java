package com.demo.consumer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'countBalancingElements' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */
	
	public int balance(List<Integer> arr){
        int size = arr.size();
        int[] leftOdd = new int[size], leftEven = new int[size];
        int[] rightOdd = new int[size], rightEven = new int[size];
        int odd = 0, even = 0;
        for(int i=0;i<size;i++){
            leftOdd[i] = odd;
            leftEven[i] = even;
            if(i%2==0) even += arr.get(i);
            else odd += arr.get(i);
        }
        odd = 0;
        even = 0;
        for(int i=size-1;i>=0;i--){
            rightOdd[i] = odd;
            rightEven[i] = even;
            if(i%2==0) even += arr.get(i);
            else odd += arr.get(i);
        }
        int count = 0;
        for(int i=0;i<size;i++){
            if(leftOdd[i] + rightEven[i] == leftEven[i] + rightOdd[i]){
                System.out.println("id:" + i);
                count++;
            }
        }
        return count;
    }

	public static int countBalancingElements(List<Integer> arr) {

		balance(arr);
		
		int sum = 0;
		for (int n : arr)
			sum += n;
		int res = 0;
		for (int i = 0; i < arr.size(); i++) {
			int oddSum = 0, oddPos = 0;
			if ((sum - arr.get(i)) % 2 > 0)
				continue;
			for (int j = 0; j < arr.size(); j++) {
				if (i == j) {
					oddPos++;
					continue;
				}
				if (j == 0 || j == oddPos) {
					oddSum += arr.get(j);
					oddPos += 2;
				}
			}
			if (sum - arr.get(i) == oddSum * 2)
				res++;
		}
		return res;

	}

}

public class Solution {