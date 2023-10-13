package com.string;

public class RemoveDulplicateLettersLeetCode316 {
	public static String removeDuplicateLetters(String s) {
		char[] ch = s.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length-1; i++) {
			if (ch[i]>ch[i+1]&&!result.contains(ch[i] + "")) {
				result += ch[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDuplicateLetters("cbacdcbc"));
	}

}
