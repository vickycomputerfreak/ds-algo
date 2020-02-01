package org.learnbay.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int arr[] = sort.addElements();
		sort.printArray(arr);
		sort.sort(arr);
		sort.printArray(arr);
	}
	
	
	public void sort(int arr[]) {
		//Selection Sort
		for(int i = 0; i < arr.length - 1 ; i++) {
			for(int j =  i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public int[] addElements() {
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000);
		}
		return arr;
	}
 	
	
	public void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
