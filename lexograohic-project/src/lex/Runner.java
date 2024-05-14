package lex;

public class Runner {
	public static void main(String[] args) {
		String arr[]= {"Orange","Grapes","Mango","Apple","Guava"};
		String temp=null;
		for(int i=0 ; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(String i:arr) {
			System.out.println(i+" ");
		}
	}
}
