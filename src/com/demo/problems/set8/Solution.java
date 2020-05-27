package com.demo.problems.set8;

import java.util.HashMap;

class Solution {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ccccbbbbaaaa";

		System.out.println("Match found=" + checkInclusion(s1, s2));
	}

	
	public static boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for(char c : s1.toCharArray()) map[c - 'a']++;
        int j = 0, i = 0;
        int count_chars = s1.length();
        while(j < s2.length()){
            if(map[s2.charAt(j++) - 'a']-- > 0)
                count_chars--;
            if(count_chars == 0) return true;
            if(j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0)
                count_chars++;
        }
        return false;
    }
	
	/*public static boolean checkInclusion(String p, String s) { // renamed s1 to p, s2 to s
        int[] cnt = new int[128];
        
        for (char c : p.toCharArray()) cnt[c]--;
        
        for (int r = 0, l = 0; r < s.length(); r++) {
            if (++cnt[s.charAt(r)] > 0) { // If number of characters `s[r]` is more than our expectation
                while (s.charAt(l) != s.charAt(r)) // Remove until we found char `s[r]`
                    cnt[s.charAt(l++)]--;
                cnt[s.charAt(l++)]--; // Remove char `s[r]` so cnt[s[r]] can be 0
            } else if (r - l + 1 == p.length()) { // If the size of our range == p.length 
                                                // and there are no characters have greater numbers than we expect
                return true; // Found the result
            }
        }
        return false;
    }*/
	
	/*public static boolean checkInclusion(String s1, String s2) {

		int sumS1 = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		for (int k = 0; k < s1.length(); k++) {
			char firstStringChar = s1.charAt(k);
			sumS1 += firstStringChar;
			map.compute(firstStringChar, (key, val) -> (val == null) ? 1 : val + 1);
		}

		int sum = 0;
		int i = 0;

		while (i < s2.length()) {
			if (i < s1.length()) {
				sum += s2.charAt(i);
			} else {
				if (sum == sumS1) {
					return true;
				} else {
					sum = sum - s2.charAt(i - s1.length()) + s2.charAt(i);
				}
			}

			i++;
		}

		if (sum == sumS1) {
			return true;
		} else {
			return false;
		}
	}*/
}