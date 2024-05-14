package sum;

import java.util.Arrays;

public class MainClass {
	static int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
	static int targetSum = 18;

	public static void main(String[] args) {
		Arrays.sort(ar);
		for (int i = 0; i < ar.length - 3; i++) {
			pairSum(ar, ar[i], i);
		}

	}

	public static void pairSum(int ar[], int currSum, int index) {
		int i = index + 1;
		int j = ar.length - 1;
		int totalSum = 0;
		while (i < j) {
			totalSum = currSum + ar[i] + ar[j];
			if (totalSum == targetSum) {
				System.out.println(currSum + "," + ar[i] + "," + ar[j]);
				i++;
				j--;
			} else if (totalSum < targetSum)
				i++;
			else if (totalSum > targetSum)
				j--;
		}
	}
}
