package com.arrays;

public class DifferenceInSumLeetCode2535 {
	public static int differenceOfSum(int[] nums) {
		int sum = 0, digitSum = 0;
		for(int n:nums) {
			sum+=n;
		}
		for(int i=0;i<nums.length;i++) {
			int temp=nums[i];
			while(temp>0) {
				digitSum+=temp%10;
				temp=temp/10;
			}
		}
		return Math.abs(sum-digitSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
