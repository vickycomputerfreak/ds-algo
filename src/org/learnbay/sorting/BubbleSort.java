package org.learnbay.sorting;

public class BubbleSort {	
	
	public void bubbleSort(int arr[]) {
		for(int i = 0; i < arr.length - 1; i ++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int[] addElements() {
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)Math.random() * 1000;
		}
		return arr;
	}
 	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int [] arrayELements = sort.addElements();
		sort.printArray(arrayELements);
		sort.bubbleSort(arrayELements);
		sort.printArray(arrayELements);
	}
}
