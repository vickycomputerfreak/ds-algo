package org.learnbay.sorting;

public class HeapSort {
	
	public static void main(String[] args) {
		HeapSort sort = new HeapSort();
		int arr[] = sort.addElements();
		sort.printArray(arr, "Input : ");
		sort.sort(arr);
		sort.printArray(arr, "Output : ");
	}
	
	public int[] addElements() {
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 1000);
		}
		return arr;
	}
 	
	
	public void printArray(int arr[], String content) {
		System.out.println(content);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public void sort(int arr[]) {
		int length = arr.length;
		for(int i = length/2 - 1; i >= 0; i --)
			heapify(arr, length, i);
		for(int i = length -1; i >= 0; i --) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i , 0);
		}
	}
	
	public void heapify(int arr[], int n , int i) {
		int largest = i;
		int l = 2 * i  + 1;
		int r = 2 * i + 2;
		if( l < n && arr[l] > arr[largest] )
			largest = l;
		if( r < n && arr[r] > arr[largest] )
			largest = r;
		if( largest != i ) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, n, largest);
		}
	}
}
