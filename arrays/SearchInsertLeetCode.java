package com.arrays;

import java.lang.annotation.Target;

public class SearchInsertLeetCode {

	public static int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length - 1; 
        int mid = (first+last)/2; 
        
        if(target>nums[last]) {
        	return last+1;
        }
        
        if(target<nums[first]) {
        	return first;
        }
        
        while(first <= last) {
        	if(nums[first]<target) {
        		first = mid+1;
        	}
        	
        	if(nums[first]==target) {
        		return nums[first];
        	}
        	
        	if(nums[first]>target)  {
        		last = mid - 1;
        	}
        	mid = (first+last)/2;
        }
        return first; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,3,5,6};
		int target = 5;
		
		System.out.println(searchInsert(nums, target));
	}

}
