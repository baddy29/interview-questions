package com.practice;

public class QuickSort {
	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int partition = partition(arr, high, low);
			quickSort(arr, low, partition - 1);
			quickSort(arr, partition + 1, high);
		}
	}

	public static int partition(int arr[], int high, int low) {
		int pivot = arr[high];
		int k = low - 1;
		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				k++;
				Swapper.swapArrayElement(arr, k, i);
			}
		}
		Swapper.swapArrayElement(arr, k + 1, high);
		return k + 1;
	}
}
