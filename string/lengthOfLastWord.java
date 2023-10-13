package com.string;

public class lengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String res [] = s.strip().split(" ");
		return res[res.length-1].length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}

}
