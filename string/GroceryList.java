package com.string;

import java.util.Arrays;

public class GroceryList {
	public static int list(String s) {
        s = s.replaceAll("[^a-zA-Z0-9\\s]+", " ").replaceAll("\\s+", " ");
		
		String sArr [] = s.split(" ");
		//System.out.println(s);
		//System.out.println(Arrays.toString(sArr));

		int sum=0; 
		//for(int i=0;i<sArr.length;i++) {
			try {
				sum=Integer.parseInt(sArr[1])*Integer.parseInt(sArr[2]);
			} catch (NumberFormatException e) {
				
			}
		//}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(list("test 11 12"));
//		System.out.println(list("test2_11 12"));
//		System.out.println(list("test3;11:12"));
//		System.out.println(list("test4;11,12"));
		
		String  [] arr = {"test 1 8","test 2 10","test:2;10","test_2/10"};
		int sum = 0;
		for (String string : arr) {
			sum+=list(string);
		}
		System.out.println(sum);
	}

}
