package org.array.minimum;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
		int[] ar= {30, 5, 20, 9};
		Arrays.sort(ar);
		int min= Integer.MAX_VALUE;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i+1]-ar[i]<min)
				min=ar[i+1]-ar[i];
		}
		System.out.println(min);
	}
}
