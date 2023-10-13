package com.arrays;

import java.util.Arrays;

public class RemDupFromArrayLeetCode2 {
	
	
	public int removeDuplicates(int[] nums) {
		int shift = 1, count=1; 
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				count++;
				//continue;
			}
			else {
				count=1;
			}
			if(count<=2) {
				nums[shift++]=nums[i];
			}
		}
		
		return shift;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {0,0,1,1,1,2,2,3,3,4,4,4};
		int arr[] = {1,1,1,2,2,3};
		RemDupFromArrayLeetCode2 rm = new RemDupFromArrayLeetCode2();
		System.out.println(rm.removeDuplicates(arr));
	}

}
