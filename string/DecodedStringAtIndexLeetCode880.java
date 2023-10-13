package com.string;

public class DecodedStringAtIndexLeetCode880 {
	public static boolean isNum(char c) {
		return c-'0'>=0 && c -'0' <= 9;
	}
	public static String decodeAtIndex(String s, int k) {
//		String res = ""; 
//		for(int i=0;i<s.length();i++) {
//			if(!isNum(s.charAt(i))) {
//				res+=s.charAt(i);
//			}
//			else {
//				String temp = res;
//				for(int j=0;j<(s.charAt(i)-'0'-1);j++) {
//					res+=temp;
//					System.out.println(j);
//				}
//			}
//		}
//		return String.valueOf(res.charAt(k-1));
		long length = 0; 
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                length++;
                if (length == k) {
                    return Character.toString(c);
                }
            } else if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (length * digit >= k) {
                    return decodeAtIndex(s, (int) ((k - 1) % length + 1));
                } else {
                    length *= digit;
                }
            }
        }
		
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decodeAtIndex("leet2code3", 10));
	}

}
