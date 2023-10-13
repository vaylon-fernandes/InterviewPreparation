package com.arrays;

public class ContainerWithMostWaterLeetCode11 {

	public static int maxArea(int[] height) {
		int start = 0, end = height.length - 1;
		int minR = 0, maxArea = 0;
		while (start < end) {
			minR = Math.min(height[start], height[end]);
			maxArea = Math.max(minR * (end - start), maxArea);
			if (height[start] < height[end]) {
				start++;
			} else {
				end--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		System.out.println(maxArea(new int[] { 1, 1 }));

	}

}
