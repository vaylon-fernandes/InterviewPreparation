package com.map;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramLeetCode242 {
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
