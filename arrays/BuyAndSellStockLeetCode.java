package com.arrays;

public class BuyAndSellStockLeetCode {

	public int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE, max = 0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<min) {
				min = prices[i];
			}
			if(max<(prices[i]-min)) {
				max=prices[i]-min;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuyAndSellStockLeetCode b = new BuyAndSellStockLeetCode();
		int a [] = {7,1,5,3,6,4};
		System.out.println(b.maxProfit(a));
	}

}
