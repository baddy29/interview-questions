package org.partotion.palindrome;

public class ManiClass {
	public static void main(String[] args) {
		String s = "banana";
		func(s,"");
	}

	public static void func(String s,String res) {
		if(s.length()==0) {
			System.out.println(res);
			return;
		}
		for(int i=0;i<s.length();i++) {
			String prefix=s.substring(0,i+1);
			String remString=s.substring(i+1);
			if(reverse(prefix)) {
				func(remString,res+"("+prefix+")");
			}
		}
	}
	public static boolean reverse(String sub) {
		String reverseString = "";
		for (int i = sub.length() - 1; i > -1; i--) {
			reverseString += sub.charAt(i);
		}
		return sub.equals(reverseString);
	}
}
