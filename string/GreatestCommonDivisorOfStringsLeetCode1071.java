package com.string;

public class GreatestCommonDivisorOfStringsLeetCode1071 {
	public static String gcdOfStrings(String str1, String str2) {
		
//		int n = Math.min(str1.length(), str2.length());
//		String prefix = "";
//		int i=0;
////		while(i<n) {
////			if(str1.charAt(i)==str2.charAt(i)) {
////				int gcd = gcd(str1.length(),str2.length());
////				return str1.substring(0,gcd);
////			}
////			i++;
////		}
//		int gcd = gcd(str1.length(),str2.length());
//		while(i<n) {
//			if(gcd>n)
//				return "";
//			if(str1.substring(0,i).equals(str2.substring(0, i))) {
//				prefix = str1.substring(0,i);
//			}
//			i=i+gcd;
//		}
//		
//		return prefix;   
		
//	}
		
		if(!(str1+str2).equals(str2+str1)) {
			return "";
		}
		return str1.substring(0,gcd(str1.length(),str2.length()));
	}
	static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
 
        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return gcd(b, a % b);
    }
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		System.out.println(gcdOfStrings("ABCABC", "ABC"));
	}
//	class Solution {
//	    public static String gcdOfStrings(String str1, String str2) {
//			int n = Math.min(str1.length(), str2.length());
//			String prefix = "";
//			int i=0;
//			while(i<n) {
//				if(str1.charAt(i)==str2.charAt(i)) {
//					int gcd = gcd(str1.length(),str2.length());
//					return str1.substring(0,gcd);
//				}
//				i++;
//			}
//			
//			return prefix;
//		}
//		static int gcd(int a, int b)
//	    {
//	        // if b=0, a is the GCD
//	        if (b == 0)
//	            return a;
//	 
//	        // call the gcd() method recursively by
//	        // replacing a with b and b with
//	        // modulus(a,b) as long as b != 0
//	        else
//	            return gcd(b, a % b);
//	    }
//
//	}
	
}
