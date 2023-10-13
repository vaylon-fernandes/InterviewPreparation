package com.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntLeetCode {
	public static Map<Character, Integer> romanToIntegerMap() {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

	public int romanToInt(String s) {
		int intNum = 0;
		
		Map<Character, Integer> map = romanToIntegerMap();
		
		for(int i=0;i<s.length();i++) {
			if(i+1==s.length()||map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
				intNum+=map.get(s.charAt(i));
			}
			else {
				intNum-=map.get(s.charAt(i));
			}
		}
		
		return intNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToIntLeetCode num = new RomanToIntLeetCode();
		System.out.println(num.romanToInt("III"));
	}

}
