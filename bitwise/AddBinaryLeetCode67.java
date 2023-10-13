package com.bitwise;

public class AddBinaryLeetCode67 {
	public static int getSum(int a, int b) {
		while (b!=0){
			int carry = a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://iq.opengenus.org/addition-using-bitwise-operations/
		System.out.println(getSum(2, 100));
	}

}
