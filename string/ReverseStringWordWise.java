package com.string;

import java.util.Arrays;

public class ReverseStringWordWise {
	
	public static void main(String[] args) {
		String str = "a good   example"; 
		String rev = "";
		String ch [] = str.split(" ");
		System.out.println(Arrays.toString(ch));
		for(int i=ch.length-1; i>=0;i--) {
			if(!ch[i].equals(""))
				rev+=ch[i]+" ";
		}
		
		System.out.println(rev.strip());
	} 

}
