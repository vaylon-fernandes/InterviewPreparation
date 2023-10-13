package com.arrays;

public class MinCostClimbingStairsLeetCode746 {
	public static int minCostClimbingStairs(int[] cost) {

		for(int i=cost.length-3;i>=0;i--) {
			cost[i]+=Math.min(cost[i+1],cost[i+2]);
		}
		return Math.min(cost[0], cost[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}

}
