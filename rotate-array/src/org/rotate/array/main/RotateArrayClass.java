package org.rotate.array.main;

public class RotateArrayClass {
	public static void main(String[] args) {
		int a[]= {7,3,8,2,4,5};
		int rotateFactor=1;
		int n=a.length;
		int k=rotateFactor%n;
		reverse(a,0,n-1);
		reverse(a,0,k-1);
		reverse(a,k,n-1);
		for(int i:a) {
			System.out.println(i);			
		}
	}
	public static void reverse(int a[],int start,int end) {
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
	}
}
