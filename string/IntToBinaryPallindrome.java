package com.string;

import java.util.Scanner;

public class IntToBinaryPallindrome {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num = sc.nextInt();
//
//		String binNum = Integer.toBinaryString(num);
//		String rev = "";
//		for (int i = binNum.length() - 1; i >= 0; i--) {
//			rev = rev + binNum.charAt(i);
//		}
//		System.out.println("Binary: " + binNum);
//		System.out.println("Reversed: " + rev);
//
//		if (binNum.equals(rev)) {
//			System.out.println("is pallindrome");
//		} else {
//			System.out.println("not pallindrome");
//		}

		System.out.println("for array of elements:::::::");
		System.out.println("enter the no of elements in the array:::");
		int number = sc.nextInt();
		int[] array1 = new int[number];
		System.out.println("enter the array elements");
		for (int i = 0; i < number; i++) {
			array1[i] = sc.nextInt();
		}
		String[] basic = new String[number];
		for (int i = 0; i < array1.length; i++) {
			basic[i] = Integer.toBinaryString(array1[i]);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(basic[i]);
		}
		String[] rev1 = new String[number];
		StringBuilder[] sb = new StringBuilder[number];
		System.out.println("checking for palindrome::::");
		for (int i = basic.length - 1; i >= 0; i--) {
			
			rev1[i] += basic[i].charAt(i);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(rev1[i]);
		}
		sc.close();
	}

}
