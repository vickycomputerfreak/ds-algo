package org.learnbay.sorting;

public class QuickSort {
	
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i ++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i + 1];
		arr [i + 1] = arr [high];
		arr[high] = temp;
		
		return i + 1;
	}
	
	public int[] addElements(int size) {
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000);
		}
		return arr;
	}
 	
	
	public void sort(int arr[], int low, int high) {
		if( low < high ) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi + 1, high);
		}
	}
	
	public void printArray(int arr[], String content) {
		System.out.println(content);
		for(int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		QuickSort quick = new QuickSort();
		int arr[] = quick.addElements(30);
		int length = arr.length;
		quick.printArray(arr, "Input : ");
		quick.sort(arr, 0, length - 1 );
		quick.printArray(arr, "Output : ");
		
	}
	
}
