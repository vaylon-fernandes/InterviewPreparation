package com.Basic;

public class ReverseIntergerLeetCode {

	public int reverse(int x) {
        long revNum = 0; 
        int lastDigit = 0;
        while(x!=0){
            revNum=x%10+revNum*10;
            x=x/10;
        }
        
        if(revNum>Integer.MAX_VALUE || revNum<Integer.MIN_VALUE)
        	return 0;
        
        return (int)revNum;
        }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseIntergerLeetCode rv = new ReverseIntergerLeetCode();
		System.out.println(rv.reverse(321));

	}

}
