package com.arrays;

import java.util.Arrays;

public class FindMissingAndRepeatingNumberPrototech {
	public static int [] findMissingNum(int [] nums) {
		int missingRepeating [] = new int[2];
		int n = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < n - 1; i++) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index]>0) {
            	nums[index] = -nums[index];
            }
            else {
            	missingRepeating[1] = Math.abs(nums[index]);
            }
        }

        if (nums[n - 1] != n) {
        	missingRepeating[0] = n;
        	return missingRepeating;
        }
		
		for(int i=0;i<n;i++) {
			if(nums[i]>0) {
				missingRepeating[0]=i+1;
				break;
			}
		}
		return missingRepeating;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,4,5,6,7,7,8,9};
		System.out.println(Arrays.toString(findMissingNum(arr)));
		int arr2 []= {2,2,3};
		System.out.println(Arrays.toString(findMissingNum(arr2)));

	}

}
