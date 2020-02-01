package org.learnbay.arrays;

import java.util.HashMap;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int arr [] = new int[10];
		
		for(int i = 0; i < 10; i ++) {
			arr[i] = (int) (Math.random() * 10);
			System.out.println(arr[ i ] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i ++ ) {
			int count = 1;
			if(map.containsKey(arr[ i ])) {
				count = map.get(arr[ i ]) + 1;
			} 
			map.put(arr[ i ] , count);
			
			if(count == 2) {
				System.out.println("The dupicates in the array 	 found at index: " + i + " elements being: " + arr[i]);
			}
		}
 	}
}
