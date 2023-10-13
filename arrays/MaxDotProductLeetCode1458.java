package com.arrays;

public class MaxDotProductLeetCode1458 {
	public static int maxDotProduct(int[] nums1, int[] nums2) {
		int m = nums1.length;
	    int n = nums2.length;
	    
	    // Create a 2D DP array
	    int[][] dp = new int[m + 1][n + 1];
	    
	    for (int i = 1; i <= m; i++) {
	        for (int j = 1; j <= n; j++) {
	            // Calculate the maximum dot product for subsequences ending at nums1[i-1] and nums2[j-1]
	            dp[i][j] = Math.max(dp[i-1][j-1] + nums1[i-1] * nums2[j-1], Math.max(nums1[i-1] * nums2[j-1], Math.max(dp[i-1][j], dp[i][j-1])));
	        }
	    }
	    
	    return dp[m][n];
	   	}
//	public static int maxDotProduct(int[] nums1, int[] nums2) {
//		int n = nums1.length;
//		int m = nums2.length; 
//		
//		int [][] dotProd = new int[n+1][m+1];
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=m;j++) {
//				dotProd[i][j]=Math.max(dotProd[i-1][j-1]+nums1[i-1]*nums2[j-1], 
//						Math.max(nums1[i-1] * nums2[j-1], Math.max(dotProd[i-1][j], dotProd[i][j-1])));
//			}
//		}
//		
//		return dotProd[n][m];
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {-1,-1};
	    int[] nums2 = {1,1};
	    
		System.out.println(maxDotProduct(nums1, nums2));
	}

}
