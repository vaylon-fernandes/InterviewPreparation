package com.arrays;

public class MergeStringsAlternativelyLeetCode {

	public static String mergeStrings(String word1, String word2) {
		StringBuilder sbr = new StringBuilder();
		int i = 0;
		int j;
		for(i=0;i<word1.length()||i<word2.length();i++)
//		while (i < word1.length() || i < word2.length())
		{
			if (i < word1.length())
				sbr.append(word1.charAt(i));
			if (i < word2.length())
				sbr.append(word2.charAt(i));
		}

		return sbr.toString();
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeStrings(word1, word2));
	}

}
