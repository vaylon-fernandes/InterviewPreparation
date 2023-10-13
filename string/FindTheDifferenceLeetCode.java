package com.string;

import java.util.Arrays;

public class FindTheDifferenceLeetCode {
	public static char findTheDifference(String s, String t) {
        char chS [] = s.toCharArray();
        char chT [] = t.toCharArray();
        char diff = 0; 
        for(int i=0;i<chS.length;i++) {
        	diff^=chS[i];
        }
        for(int i=0;i<chT.length;i++) {
        	diff^=chT[i];
        }
        return diff;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findTheDifference("abcd", "abcde"));
	}

}
