package com.map;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsLeetCode205 {
	public static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> mapS = new HashMap<>();
		Map<Character, Character> mapT = new HashMap<>();
		
		if(s.length()!=t.length())
			return false; 
		
		for(int i=0; i<s.length();i++) {
			if(!mapS.containsKey(s.charAt(i))) {
				mapS.put(s.charAt(i), t.charAt(i));
			}
			if(!mapT.containsKey(t.charAt(i))) {
				mapT.put(t.charAt(i), s.charAt(i));
			}
			if(mapS.get(s.charAt(i))!=t.charAt(i)||mapT.get(t.charAt(i))!=s.charAt(i)) {
				return false; 
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("egg", "adf"));
		
	}

}
