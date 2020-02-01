package org.learnbay.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int arr[] = sort.addElements();
		sort.printArray(arr);
		sort.sort(arr);
		sort.printArray(arr);
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
	
	public void sort(int arr[]) {
		int length = arr.length;
		for(int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >=0 && arr[j] > key) {
				arr[j + 1] = arr [j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

}
