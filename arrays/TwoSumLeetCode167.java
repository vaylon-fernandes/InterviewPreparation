package com.arrays;

import java.util.Arrays;

public class TwoSumLeetCode167 {
	public static int[] twoSum(int[] numbers, int target) {
//		int sum = 0; 
//		int result [] = new int[2];
//		for(int i=0;i<numbers.length;i++) {
//			int j=i+1;
//			while(j<numbers.length) {
//				sum=numbers[i]+numbers[j];
//				if(sum==target) {
//					result[0]=i+1;
//					result[1]=j+1;
//					return result;
//				}
//				j++;
//			}
//		}
//		return result;
		int start = 0,end=numbers.length-1;
		
		while(start<end) {
			int sum = numbers[start]+numbers[end];
			if(sum<target) {
				start++;
			}
			else if(sum==target) {
				return new int[] {start+1, end+1};
			}
			else {
				end--;
			}
			}
		
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(arr, 9)));
		int arr2 [] = {2,3,4};
		//System.out.println(Arrays.toString(twoSum(arr2, 6)));

	}

}
