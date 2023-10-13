package com.string;

public class IsSubsequenceLeetCode392 {

	public static boolean  isSubsequence(String s, String t) {
		int sLen = s.length();
		int tLen = t.length();
		int j=0,i=0;
		while(i<sLen&&j<tLen) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		return sLen==i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc", "afdsbddc"));
		System.out.println(isSubsequence("acb", "afdsbddc"));

	}

}
