package org.fizz.buzz;

public class MainClass {

	static int i = 1, fizz = 0, buzz = 0, n = 50;

	public static void main(String[] args) {
		while (i <= n) {
			fizz++;
			buzz++;
			if (fizz == 3 && buzz == 5) {
				System.out.println("FizzBuzz");
				fizz = 0;
				buzz = 0;
			} else if (fizz == 3) {
				System.out.println("Fizz");
				fizz = 0;
			} else if (buzz == 5) {
				System.out.println("Buzz");
				buzz = 0;
			} else {
				System.out.println(i);
			}
			i++;
		}	
	}
}
