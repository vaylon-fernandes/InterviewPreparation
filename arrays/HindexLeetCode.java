package com.arrays;

import java.util.Arrays;

public class HindexLeetCode {
	 public int hIndex(int[] citations) {
			int hIdx = 1,n=citations.length;
			Arrays.sort(citations);
	        
			for(int i=0;i<n-1;i++) {
				if(citations[i]>hIdx) {
					hIdx++;
				}
//                System.out.println(citations[i]);

			}
			return hIdx;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HindexLeetCode hid = new HindexLeetCode();
		int [] h = {3,0,6,1,5};
		System.out.println(hid.hIndex(h));
	}

}
