package com.string;

import java.security.DrbgParameters.Reseed;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRomanLeetCode12 {
	public static String intToRoman(int num) {
		Map<Integer, String> romanMap = new LinkedHashMap<>();

		romanMap.put(1000, "M");
		romanMap.put(900, "CM");
		romanMap.put(500, "D");
		romanMap.put(400, "CD");
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(1, "I");
		StringBuilder romanNum = new StringBuilder();
		for(Map.Entry<Integer, String> entry:romanMap.entrySet()) {
			int val = entry.getKey();
			String digit = entry.getValue();
			while(num>=val) {
				romanNum.append(digit);
				num-=val;
			}
		}
		return romanNum.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(10));
	}

}
