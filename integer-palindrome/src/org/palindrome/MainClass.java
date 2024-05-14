package org.palindrome;

public class MainClass {
	public static void main(String[] args) {
		int originalNum=999;
		Integer rem=originalNum%10;
		String newNumString="";
		int newNum=originalNum;
		while(newNum!=0) {
			newNumString+=rem.toString();
			newNum/=10;
			rem=newNum%10;
		}
		if(String.valueOf(originalNum).equals(newNumString)) {
			newNumString.length();
			newNumString.charAt(newNumString.length()-1);
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
}
