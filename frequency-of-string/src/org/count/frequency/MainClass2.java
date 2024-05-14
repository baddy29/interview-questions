package org.count.frequency;

public class MainClass2 {
	public static void main(String[] args) {

		String s = "geeksforGeeks";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				continue;
			} else {
				System.out.print(""+s.charAt(i) + count);
				count = 1;
			}

		}
		if (s.charAt(s.length() - 1) != s.charAt(s.length() - 2)) {
			System.out.print(s.charAt(s.length() - 1) + "1");
		}else {
			System.out.print(""+s.charAt(s.length() - 1) + count);
		}
	}
}
