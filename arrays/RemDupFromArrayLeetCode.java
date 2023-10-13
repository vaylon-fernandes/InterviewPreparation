package com.arrays;

import java.util.Arrays;

public class RemDupFromArrayLeetCode {
	
	
	public int removeElement(int[] nums, int val) {
		int shift = 0, k=0; 
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=val) {
				nums[shift++] = nums[i];
			}
			else {
				k++;
			}
		}
		nums[shift++] = nums[nums.length-1];
		System.out.println(Arrays.toString(nums));
		return k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {0,0,1,1,1,2,2,3,3,4,4,4};
		int arr[] = {0,1,2,2,3,0,4,2};
		RemDupFromArrayLeetCode rm = new RemDupFromArrayLeetCode();
		System.out.println(rm.removeElement(arr,2));
	}

}
