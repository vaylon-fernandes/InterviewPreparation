package com.string;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteLeetCode383 {
	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		String res = "";
		if(ransomNote.length()>magazine.length())
			return false; 
		
		map.put(ransomNote, true);
		
		for(int i=0;i<magazine.length();i++) {
			res+=magazine.charAt(i);
			if(map.get(res)!=null) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canConstruct("aa", "ab"));
	}

}
