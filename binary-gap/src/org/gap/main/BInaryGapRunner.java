package org.gap.main;

public class BInaryGapRunner {
	public static int binaryGap(int N) {
		boolean started=false;
		int max=0,counter=0;
		String bString= Integer.toBinaryString(N);
		for(int i=0;i<bString.length();i++) {
			//String c= bString.substring(i,i+1);
			if(bString.charAt(i)=='1') {
				/*
				 * if(started) { findMax(counter,max); }
				 */
				max=counter>max?counter:max;
				counter=0;
				started=true;
			}
			if(bString.charAt(i)=='0' && started) {
				counter++;
			}
		}
		return max;
	}
	
	public static void findMax(int counter,int max) {
		if(counter>max) {
			max=counter;
		}
	}
	public static void main(String[] args) {
		System.out.println(binaryGap(54677));
	}
}
