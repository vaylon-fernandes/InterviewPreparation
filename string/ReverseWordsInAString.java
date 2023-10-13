package com.string;

public class ReverseWordsInAString {
	
	 public static String reverseWords(String s) {
//			String res = "";
//			String ch [] = s.split(" ");
//			for(int i=0; i<ch.length;i++) {
//				String rev = "";
//				for(int j=ch[i].length()-1;j>=0;j--) {
//					rev+=ch[i].charAt(j);
//				}
//				res+=rev+" ";
//			}
//	        return res.strip();
		 	StringBuilder result = new StringBuilder();
		 	for(String word:s.split(" ")) {
		 		StringBuilder reversed = new StringBuilder(word);
		 		result.append(reversed.reverse()+" ");
		 	}
		 	return result.toString().strip();
	    }
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	} 

}
