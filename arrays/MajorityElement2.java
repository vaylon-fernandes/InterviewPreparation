package com.arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement2 {
	
	public static List<Integer> majorityElement(int[] nums) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int num:nums) {
			if(countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num)+1);
			}
			else {
				countMap.put(num, 1);
			}
		}
		return countMap.entrySet()
				.stream()
				.filter(entry->entry.getValue()>(nums.length/3))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(new int[] {3,2,3}));
		System.out.println(majorityElement(new int[] {1,2}));

	}

}
