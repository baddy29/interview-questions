package base.main;

public class MainClass2 {
	static int count = 0;

	public static void main(String[] args) {
		int n = 12;
		for (int k = 1; k <= n; k++) {
			numCount(k);
		}
		System.out.println(count);
	}

	public static int numCount(int n) {
		int i = n % 10;
		if (i != 0 || (n != 0 && i == 0)) {
			n /= 10;
			count++;
			return numCount(n);
		} else {
			return count;
		}
	}
}
