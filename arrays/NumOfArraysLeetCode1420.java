package com.arrays;

import java.util.Arrays;

public class NumOfArraysLeetCode1420 {
	public static int numOfArrays(int n, int m, int k) {
		long res[][][] = new long[n][k][m];
		long overFlowMod = 1000000007;
		Arrays.fill(res[0][0], 1);

		for (int i = 1; i < n; i++) {
			for (int cost = 0; cost < Math.min(i + 1, k); cost++) {
				for (int max = 0; max < m; max++) {
					res[i][cost][max] = (res[i][cost][max] + (max + 1)) * res[i - 1][cost][max] % overFlowMod;
					if (cost != 0) {
						long sum = 0;
						for (int j = 0; j < max; j++) {
							sum += res[i - 1][cost - 1][j];
							sum %= overFlowMod;
						}
						res[i][cost][max] = (res[i][cost][max] + sum) % overFlowMod;
					}
				}
			}
		}
		long result = 0;
		for (int max = 0; max < m; max++) {
			result+=res[n-1][k-1][max];
			result%=overFlowMod;
		}
		return (int)result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numOfArrays(2, 3, 1));

	}

}
