package org.fizz.buzz;

public class MainClass2 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String s = "";
		int n = 50;
		for (int i = 1; i <= n; i++) {
			x++;
			y++;
			if (x == 3) {
				s += "fizz";
				x = 0;
			}
			if (y == 5) {
				s += "buzz";
				y = 0;
			}
			System.out.println(i+"- "+s);
			s="";

		}
	}
}
