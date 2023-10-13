package com.arrays;

public class MonotonicArray {
	public static boolean isMonotonic(int[] nums) {
		boolean isInc=true,isDec=true;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]>nums[i+1]) {
				isInc=false;}
			if(nums[i]<nums[i+1])
				isDec=false;}
		return isInc||isDec;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,5,4,7,4};
		System.out.println(isMonotonic(arr));
	}

}
