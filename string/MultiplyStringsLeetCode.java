package com.string;

import java.util.Arrays;

public class MultiplyStringsLeetCode {
	public static String multiply(String num1, String num2) {
		int n1Idx = num1.length();
		int n2Idx = num2.length();
		int result []= new int[n1Idx+n2Idx]; 
		
		for(int i=n1Idx-1;i>=0;i--) {
			for(int j=n2Idx-1;j>=0;j--) {
				int product = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int sum=product+result[i+j+1];
				result[i+j] += sum/10;
				result[i+j+1] = sum%10;
				System.out.println(num1.charAt(i)+" "+num2.charAt(j));
				System.out.println(			Arrays.toString(result));
			}
			System.out.println(			Arrays.toString(result));
		}
		StringBuilder sb = new StringBuilder();
		for(int num:result) {
			if(!(sb.length()==0&&num==0)) {
				sb.append(num);
			}
		}
		return sb.length()==0?"0":sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String num1 = "123", num2 = "456";
        String result = multiply(num1, num2);
        System.out.println("The product is: " + result);

	}

}
