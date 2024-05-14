package org.pkg;

public class MainClass {
	public static void main(String[] args) {
		String s = "0001101000";
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (s.charAt(i) == '0' && i < j) {
				i++;
			}
			while (s.charAt(j) == '1' && i < j) {
				j--;
			}
			if (i < j) {
				StringBuilder s1 = new StringBuilder(s);
				s1.setCharAt(i, '0');
				s1.setCharAt(j, '1');
				i++;
				j--;
				s = s1.toString();
			}
		}
		System.out.println(s);

	}
}
