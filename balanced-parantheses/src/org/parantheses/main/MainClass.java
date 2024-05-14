package org.parantheses.main;

import java.util.ArrayList;

public class MainClass {
	static int count = 0;

	public static void main(String[] args) {
		int open = 3;
		int close = 3;
		String parentheses1 = new String();
		ArrayList<String> balanced = new ArrayList<>();
		if (open == close) {
			balance(open, close, parentheses1,balanced);
			for (String s : balanced) {
				System.out.println(s);
			}

		} else {
			System.out.println("Invalid input");
		}
	}

	public static void balance(int open, int close, String parentheses,ArrayList<String> balancedStrings) {
		if (open == 0 && close == 0) {
			balancedStrings.add(parentheses);
			return;
		}
		if (open > 0) {
			String openParentheses = parentheses;
			openParentheses += "(";
			balance(open - 1, close, openParentheses,balancedStrings);
		}
		if (close > open) {
			String closeParentheses = parentheses;
			closeParentheses += ")";
			balance(open, close - 1, closeParentheses,balancedStrings);
		}
	}
}
