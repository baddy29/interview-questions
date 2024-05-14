package pkg;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String exp = "K+L-M*N+(O^P)*W/U/V*T+Q";
		String res = "";
		Stack<Character> s = new Stack<>();
		boolean validExp=true;
		for (int i = 0; i < exp.length(); i++) {
			if (Character.isLetterOrDigit(exp.charAt(i))) {
				res += exp.charAt(i);
			}
			else if (exp.charAt(i) == '(') {
				s.push(exp.charAt(i));
			} else if (exp.charAt(i) == ')') {
				while (!s.isEmpty() && s.peek() != '(') {
					res += s.pop();
				}
				s.pop();
			} else {
				while (!s.isEmpty() && precedence(exp.charAt(i)) <= precedence(s.peek())) {
					res += s.pop();
				}
				s.push(exp.charAt(i));
			}
		}
		while(!s.isEmpty()) {
			if(s.peek()=='(') {
				validExp=false;
			}
			res+=s.pop();
		}
		if(validExp)
			System.out.println(res);
		else
			System.out.println("Invalid expression");

	}

	public static int precedence(char c) {
		if (c == '+' || c == '-') {
			return 1;
		}
		if (c == '/' || c == '*') {
			return 2;
		}
		if (c == '^') {
			return 3;
		}
		return -1;
	}
}
