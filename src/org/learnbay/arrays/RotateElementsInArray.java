package org.learnbay.arrays;

public class RotateElementsInArray {
	
	public static void main(String[] args) {
		
		int originalArr[] = new int[10];
		
		int rotatedArr[] = new int[10];
		
		int rotateAfter = 3;
		
		System.out.println( "***Original Array*** \n" );
		for(int i = 0 ; i < originalArr.length; i ++) {
			
			originalArr[i] = (int)(Math.random() * 100);
			System.out.print(originalArr[i] + " ");
	
		}
		
		System.out.println(" \n\n***Rotated Array*** \n");
		
		for(int i = 0; i < rotatedArr.length; i ++ ) {
			
			int rotatedIndex = (i + rotateAfter) % rotatedArr.length;
			rotatedArr[i] = originalArr[rotatedIndex];
			System.out.print(rotatedArr[i] + " ");
			
		}
		
		
	}
}
