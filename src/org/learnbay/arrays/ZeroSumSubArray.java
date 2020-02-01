package org.learnbay.arrays;

public class ZeroSumSubArray {
	public static void main(String[] args) {
		int arr[ ] = new int[10];
		for(int i = 0; i < arr.length ; i ++) {
			arr[ i ] = (int)(Math.random() * 10);
			System.out.println(arr[ i ]);
		}
		System.out.println();
	}
}
