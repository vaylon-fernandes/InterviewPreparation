package com.math;

public class GreatestPrimeDivisorYugenSys {
	public static int getMaxPrimeDivisor(int num) {
		int maxDivisor = -1; 
		for(int i=1;i<=num;i++) {
			if(num%i==0&&isPrime(i)) {
				maxDivisor=i;
			}
		}
		
		return maxDivisor;
	}
	
	public static boolean isPrime(int n) { 
		if(n<2) {
			return false;
		}
		
		if(n%2==0||n%3==0) {
			return false;
		}
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0||n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMaxPrimeDivisor(20));
	}

}
