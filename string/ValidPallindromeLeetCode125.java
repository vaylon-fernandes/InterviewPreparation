package com.string;

public class ValidPallindromeLeetCode125 {
	public static boolean isPalindrome(String s) {
//		StringBuilder sb = new StringBuilder();
//		for(char c:s.toCharArray()) {
//			if(Character.isAlphabetic(c)) {
//				sb.append(Character.toLowerCase(c));
//			}
//			if(Character.isDigit(c))
//			{
//				sb.append(c);
//			}
//		}
//		return sb.toString().equals(sb.reverse().toString());
		if(s.isEmpty())
			return true;
		int start = 0, end = s.length()-1;
		while(start<=end) {
			char charAtStart = s.charAt(start);
			char charAtEnd = s.charAt(end);
			if(!Character.isLetterOrDigit(charAtStart)) {
				start++;
			}
			else if(!Character.isLetterOrDigit(charAtEnd)) {
				end--;
			}
			else {
			if(Character.toLowerCase(charAtStart)!=Character.toLowerCase(charAtEnd)){
				return false;
			}
			start++;
			end--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("0P"));

	}

}
