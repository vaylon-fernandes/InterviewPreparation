package com.arrays;

import java.util.Arrays;

public class SortArrayByParityLeetCode905 {
	public static int[] sortArrayByParity(int[] nums) {
		int result [] = new int[nums.length];
		int evenIdx=0;
		int oddIdx=nums.length-1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				result[evenIdx++] = nums[i];
			}
			else {
				result[oddIdx--] = nums[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {2,1,4,3,6};
		System.out.println(Arrays.toString(sortArrayByParity(arr)));
	}

}
