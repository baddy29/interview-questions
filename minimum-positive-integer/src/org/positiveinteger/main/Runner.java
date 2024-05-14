package org.positiveinteger.main;

import java.util.HashSet;

public class Runner {
	public static void main(String[] args) {
		int a[]= {1, 2, 3};
		
		HashSet<Integer> setInt=new HashSet<>();
		for(int x :a) {
			if(x>0)
				setInt.add(x);
		}
		for(int i=1;i<=a.length+1;i++) {
			if(!setInt.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
