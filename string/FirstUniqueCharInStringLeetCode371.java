package com.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInStringLeetCode371 {
	public static int firstUniqChar(String s) {
		Map<Character, Integer> charCounter = new HashMap<>();
		for(char c:s.toCharArray()) {
			charCounter.put(c, charCounter.getOrDefault(c, 0)+1);
		}
		for(int i=0;i<s.length();i++) {
			if(charCounter.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
	}

}
