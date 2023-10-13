package com.arrays;

public class Pattern132LeetCode456 {
	public static boolean find132pattern(int[] nums) {
//		for(int i=0;i<nums.length;i++) {
//			int j = i+1;
//			int k = nums.length-1;
//			
//			while(j<k) { 
//				if(nums[i]<nums[j]&&nums[j]>nums[k]&&nums[i]<nums[k]) {
//					return true;
//				}
//				j++;
//				k--;
//			}
//		}

//		for(int i=0;i<nums.length;i++) {
//			for(int j=i+1;j<nums.length;j++) {
//				for(int k=j+1;k<nums.length;k++) {
//					if(nums[i]<nums[k]&&nums[j]>nums[k]) {
//						return true;
//					}
//				}
//			}
//		}
		int n = nums.length;
		if (n < 3) {
			return false;
		}
		int minElement[] = new int[n];
		minElement[0] = nums[0];

		for (int i = 1; i < n; i++) {
			minElement[i] = Math.min(nums[i - 1], nums[i]);

		}
		int maxElement = Integer.MIN_VALUE;
		for(int j=n-1;j>=0;j--) {
			if(nums[j]>minElement[j]) {
				if(nums[j]<maxElement) {
					return true;
				}
			}
			  maxElement = nums[j];
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find132pattern(new int[] { 1, 2, 3, 4 }));
		System.out.println(find132pattern(new int[] { 3, 1, 4, 2 }));
	}

}
