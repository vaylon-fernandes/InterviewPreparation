package com.arrays;

import java.util.Arrays;

public class RemValFromArrayLeetCode {
	
	
	public int removeElement(int[] nums, int val) {
		int shift = 0, k=0; 
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[shift++] = nums[i];
			}
		}
	
		//System.out.println(Arrays.toString(nums));
		return shift;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {0,0,1,1,1,2,2,3,3,4,4,4};
		int arr[] = {3,2,2,3};
		RemValFromArrayLeetCode rm = new RemValFromArrayLeetCode();
		System.out.println(rm.removeElement(arr,2));
	}

}
