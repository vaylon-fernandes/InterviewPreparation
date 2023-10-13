package com.arrays;

import java.util.Arrays;

public class PlusOneLeetCode {
	public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]++;
				System.out.println("jdjd");
				return digits;
			}
			digits[i]=0;				
		}
		int newNum [] = new int[digits.length+1];
		newNum[0]=1;
		return newNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0};
		System.out.println(Arrays.toString(plusOne(arr)));
	}

}
