package com.math;

public class powerOfTwoLeetCode {
	
	public static boolean isPowerOfTwo(int n) {
        if(n<=Integer.MIN_VALUE)
        {
        	return false;}

        return n!=0&&((n&(n-1))==0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(1));
	}

}
