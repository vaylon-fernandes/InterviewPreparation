package com.bitwise;

public class AdditionOfTwoNumbersLeetCode371 {
	public static String addBinary(String a, String b) {
		//return Integer.toBinaryString((Integer.parseInt(a,2)+Integer.parseInt(b,2)));
		int i = a.length()-1; 
		int j = b.length()-1;
		int carry = 0; 
		int sum = 0; 
		StringBuilder result = new StringBuilder();
		while(i>=0||j>=0||carry==1) {
			sum = carry; 
			if(i>=0) {
				sum+=a.charAt(i)-'0';
			}
			if(j>=0) {
				sum+=b.charAt(j)-'0';
			}
			result.append((char)(sum%2+'0'));
			carry=sum/2;
			i--; 
			j--;
		}
		
		return result.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://iq.opengenus.org/addition-using-bitwise-operations/
		System.out.println(addBinary("11", "1"));
		System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}

}
