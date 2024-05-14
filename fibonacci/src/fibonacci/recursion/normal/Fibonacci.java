package fibonacci.recursion.normal;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//for(int i=0;i<a;i++)
		System.out.print(printSeries(a)+" ");
	}
	
	public static int printSeries(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return printSeries(n-1)+printSeries(n-2);
	}
}
