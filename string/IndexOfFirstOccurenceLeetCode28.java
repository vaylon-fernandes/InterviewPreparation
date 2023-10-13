package com.string;

public class IndexOfFirstOccurenceLeetCode28 {
	 public static int strStr(String haystack, String needle) {
	        int hLen = haystack.length();
	        int nLen = needle.length();
	        if(hLen<nLen) {
	        	return -1;
	        }
	        if(haystack.equals(needle))
	        	return 0;
	        for(int i=0;i<=hLen-nLen;i++) {
	        	int j = 0; 
	        	while(j<nLen&&haystack.charAt(i+j)==needle.charAt(j)) {
	        		j++;
	        	}
	        	if(j==nLen) {
	        		return i;
	        	}
	        }
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","issipi"));
		System.out.println(strStr("abc","c"));

	}

}
