package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayOddEvenSplitMedian {

	public double findMedian(List<Integer> list) {
		double result = 0; 
		int n = list.size();
		
		
		return result; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> oddArr= new ArrayList<>();
		List<Integer> evenArr= new ArrayList<>();
		
		for(int n:arr) {
			if(n%2==0) {
				evenArr.add(n);
			}
			else {
				oddArr.add(n);
			}
		}
		
		Collections.sort(evenArr);
		Collections.sort(oddArr);
		
		
		
		System.out.println("Odd Arr: " + oddArr.toString());
		System.out.println("Even Arr: " + evenArr.toString());
	}

}
