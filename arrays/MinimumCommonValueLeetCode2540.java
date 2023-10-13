package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValueLeetCode2540 {
	public int getCommon(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		int res=0;
		for(int n:nums1) {
			set.add(n);
		}
		for(int n:nums2) {
			if(set.contains(n)) {
				res=n;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
