package com.arrays;

import java.util.Arrays;

public class RotateArrayLeetCode {
	public static void reverse(int [] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public void rotate(int[] nums, int k) {
		k = k%nums.length;
		System.out.println(k);
		reverse(nums,0,nums.length-k-1);
		reverse(nums,nums.length-k,nums.length-1);
		reverse(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArrayLeetCode rt = new RotateArrayLeetCode(); 
		int arr [] = {1,2,3,4,5,6,7};
		rt.rotate(arr, 1);
	}

}
