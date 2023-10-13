package com.arrays;

public class SingleNotDuplicateLeetCode540 {

	public static int singleNonDuplicate(int[] nums) {
		   int result = 0; 
		   for (int i=0;i<nums.length;i++) {
			   result = result^nums[i];
		   }
		   return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(arr));
	}

}
