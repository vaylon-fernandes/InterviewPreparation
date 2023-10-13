package com.string;

public class shortestPalindromeLeetcode {
	
	public String shortestPalindrome(String s) {
        int startIdx = 0; 
        int endIdx = s.length() - 1; 
        
        while(endIdx>=0) {
        	if(s.charAt(startIdx)==s.charAt(endIdx)) {
        		startIdx++;
        	}
        	endIdx--;
        }
        if(s.length()==startIdx++) {
        	return s; 
        }
        
        String endStr = s.substring(startIdx);
        StringBuilder sbr = new StringBuilder(startIdx);
        String startStr = sbr.reverse().toString();
        
        return "";
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shortestPalindromeLeetcode sp = new shortestPalindromeLeetcode();
		System.out.println(sp.shortestPalindrome(""));
	}

}
