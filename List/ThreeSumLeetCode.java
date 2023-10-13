package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSumLeetCode {
	public List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int j = i+1;
			int k = nums.length - 1; 
			while(j<k) {
				
				int sum = nums[i] + nums[j] + nums[k];
				
				if(sum==0) {
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					while(j<k&&nums[j]==nums[j+1]) {
						j++;
					}
					while(j<k&&nums[k]==nums[k-1]) {
						k--;
					}
					j++;
					k--;
				}
				else if (sum<0) {
					j++;
				}
				else {
					k--;
				}
			}
		}
		return result;
//		Arrays.sort(nums);
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		int n = nums.length;
//		
//		for(int i=0; i<n-2;i++) {
//			for(int j=i+1;j<n-1;j++) {
//				for(int k=j+1;k<n;k++) {
//					int sum = nums[i] + nums[k] + nums[j];
//					if (sum == 0) {
//						List<Integer> subList = Arrays.asList(nums[i],nums[j],nums[k]);
//						Collections.sort(subList);
//						result.add(subList);
//					}
//				
//				}
//			}
//		}
//		Set<List<Integer>> rs = new HashSet<List<Integer>>(result);
//
//		return rs.stream().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumLeetCode t = new ThreeSumLeetCode();
		int arr [] = {-1,0,1,2,-1,-4};
		System.out.println(t.threeSum(arr));
	}

}
