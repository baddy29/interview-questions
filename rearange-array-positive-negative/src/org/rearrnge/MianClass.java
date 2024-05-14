package org.rearrnge;

public class MianClass {
	public static void main(String[] args) {
		int a[]= {4, -2, -3, 9, -5, 7, -7, -8, 5};
		int n=a.length;
		int i=0,j=a.length-1;
		while(i<=j) {
			if(a[i]<0 && a[j]>0) {
				swap(a,i,j);
				i++;
				j--;
			}else if(a[i]>0&&a[j]<0) {
				i++;
				j--;
			}else if(a[i]>0) {
				i++;
			}else if(a[j]<0) {
				j--;
			}
		}
		int k=0;
		while(k<n && i<n) {
			swap(a,k,i);
			k+=2;
			i++;
		}
		
		for(int x:a) {
			System.out.print(x+",");
		}
	}
	public static void swap(int a[],int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
