package org.learnbay.bits_manipulations;

public class InvertBits {
	
	static void invertBits(int num) {
		
		int x = (int) (Math.log(num)/Math.log(2)) + 1;
		for(int i = 0; i < x; i++) 
			num = (num ^ (1 << i));
		System.out.println(num);
		
	}
	
	public static void main(String args[]) {
		invertBits(10);
		invertBits(11);
	}
}
