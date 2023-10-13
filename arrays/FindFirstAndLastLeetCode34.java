package com.arrays;

import java.util.Arrays;

public class FindFirstAndLastLeetCode34 {
	public static int[] searchRange(int[] nums, int target) {
		int firstIdx = findFirst(nums, target);
		int lastIdx = findLast(nums, target);

		return new int[] { firstIdx, lastIdx };
	}

	public static int findFirst(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				if (mid == 0 || nums[mid - 1] != target) {
					return mid;
				} else {
					end = mid - 1;
				}
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int findLast(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				if (mid == nums.length - 1 || nums[mid + 1] != target) {
					return mid;
				} else {
					start = mid + 1;
				}
			} else if (nums[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));
	}

}
