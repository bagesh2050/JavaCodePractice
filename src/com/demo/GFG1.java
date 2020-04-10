package com.demo;

class GFG1 { 
	static int countOddSum(int ar[], 
						int n) 
	{  
		int temp[] = { 1, 0 }; 
 
		int result = 0, val = 0; 

		for (int i = 0; i <= n - 1; i++) { 
			// 2 is added to handle 
			// negative numbers 
			val = ((val + ar[i]) % 2 + 2) % 2; 

			// Increment even/odd count 
			temp[val]++; 
		} 

		// An odd can be formed by an even-odd pair 
		result = temp[0] * temp[1]; 

		return (result); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 

		int ar[] = { 5, 4, 4, 5, 1, 3 }; 
		int n = ar.length; 

		System.out.println("The Number of Subarrays"
						+ " with odd sum is " + countOddSum(ar, n)); 
	} 
} 
