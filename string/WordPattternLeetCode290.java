package com.string;

import java.util.HashMap;
import java.util.Map;

public class WordPattternLeetCode290 {
	public static boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();
		Map<String, Character> mapWord = new HashMap<>();
		
		
		String[] arr = s.strip().split(" ");
		if(pattern.length()!=arr.length) {
			return false;
		}
		for (int i = 0; i < pattern.length(); i++) {
			if (!map.containsKey(pattern.charAt(i))) {
				map.put(pattern.charAt(i), arr[i]);
			}
		}

		for (int i = 0; i < pattern.length(); i++) {
			if (!mapWord.containsKey(arr[i])) {
				mapWord.put(arr[i], pattern.charAt(i));
			}
		}
		for (int i = 0; i < pattern.length(); i++) {
			if (!map.get(pattern.charAt(i)).equals(arr[i]) || !mapWord.get(arr[i]).equals(pattern.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}

}
