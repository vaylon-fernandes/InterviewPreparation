package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinOperationsToMakeArrayContinuousLeetCode2009 {
	public static int minOperations(int[] nums) {
		//Arrays.sort(nums);
		
		int count=0; 
        Set<Integer> set = new HashSet<>();
        for(int n:nums) {
        	set.add(n);
        }
//        for(int n:set) {
//        	System.err.println(n);
//        }
        Integer nArr []= set.toArray(new Integer[0]);
//        for (Integer integer : nArr) {
//			System.out.println(integer);
//		}
        //nArr = (Integer[]) set.toArray();
		for(int i=1;i<nArr.length;i++) { 
			if(nArr[i-1]+1==nArr[i]) {
				count++;
			}
//			System.out.println(nums[i-1]+" "+nums[i]);
		
		}
		//System.out.println(count);
		//System.out.println(count);
		System.out.println("k"+nArr.length+"v"+nums.length);
		return nums.length>=nArr.length?nums.length-count-1:nArr.length-count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,2,5,3};
		int [] arr2 = {1,10,100,1000};
		int [] arr3 = {8,5,9,9,8,4};


		System.out.println(minOperations(arr));
		System.out.println(minOperations(arr2));
		minOperations(arr3);
		System.out.println(minOperations(arr3));

	}

}
