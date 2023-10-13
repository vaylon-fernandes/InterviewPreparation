package com.arrays;

public class SignOfProductsOfArrayLeetCode {
	public static int arraySign(int[] nums) {
		int sign=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)
				return 0; 
			if(nums[i]<0)
				sign*=-1;
		}
		return sign;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {-1,1,-1,1};
		System.out.println(arraySign(arr));
	}

}
