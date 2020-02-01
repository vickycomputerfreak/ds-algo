package org.learnbay.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int arr[] = sort.addElements(20);
		sort.printArray(arr, "Input : ");
		sort.sort(arr);
		sort.printArray(arr, "Output : ");
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
	
	public int[] addElements(int size) {
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000);
		}
		return arr;
	}
 	
	
	public void printArray(int arr[], String content) {
		System.out.println(content);
		for(int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
}
