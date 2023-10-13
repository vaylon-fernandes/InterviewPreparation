package com.arrays;

public class SingleNumberLeetCode {
	public static int singleNumber(int[] nums) {
		int result=nums[0];
		for(int i=1;i<nums.length;i++) {
			result^=nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}

}
