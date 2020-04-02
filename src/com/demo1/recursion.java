package com.demo1;
class recursion {
	int func(int n) {
		int result;
		if (n == 1)
			return 1;
		result = func(n - 1);
		return result;
	}
}
