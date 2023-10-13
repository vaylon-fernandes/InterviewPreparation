package com.math;

public class CheckPerfectNumberLeetCode507 {
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(28));
	}

}
