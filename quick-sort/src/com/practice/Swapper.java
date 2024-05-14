package com.practice;

public class Swapper {

	public static void swapArrayElement(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
