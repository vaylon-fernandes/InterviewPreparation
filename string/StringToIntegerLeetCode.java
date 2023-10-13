package com.string;

public class StringToIntegerLeetCode {
	public static int myAtoi(String s) {
		int sign = 1, i = 0, base = 0;
		if(s.strip().equals(""))
            return 0;
		while (s.charAt(i) == ' ') {
			i++;
		}
		if (s.charAt(i) == '-') {
			sign = -1;
			i++;
		} else if (s.charAt(i) == '+') {
			sign = 1;
			i++;
		}
		while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
				if (sign == 1) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
			base = 10 * base + (s.charAt(i++) - '0');
		}
		return base * sign;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2147483648";
		System.out.println(myAtoi(s));
	}

}
