package org.rotate.twod.array;

import java.util.Scanner;

public class TwoDRotation {
	static int n = 3;
	static int[][] array = new int[n][n];

	public static void main(String[] args) {
		createArray();
		printArray();
		leftRotate();
		rotateRight();
	}

	public static void createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	public static void printArray() {
		System.out.println("Array entered is");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void rotateRight() {
		transpose();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=array[i][j];
				array[i][j]=array[i][n-1-j];
				array[i][n-1-j]=temp;
			}
		}
		System.out.println("+++++++++Right Rotated array+++++++++\n");
		printArray();
	}
	
	public static void leftRotate() {
		transpose();
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				int temp=array[i][j];
				array[i][j]=array[n-1-i][j];
				array[n-1-i][j]=temp;
			}
		}
		System.out.println("+++++++++Left Rotated array+++++++++\n");
		printArray();
	}

	public static void transpose() {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
	}
}
