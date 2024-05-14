package peak.pkg;

public class MainClass {
	public static void main(String[] args) {
		int ar[] = { 5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4 };
		int n = ar.length;
		int max = Integer.MIN_VALUE;
		int highestPoint = 0;
		for (int i = 1; i < n - 2;) {
			if (ar[i - 1] < ar[i] && ar[i + 1] < ar[i]) {
				int cnt = 1;
				int j = i;
				highestPoint = ar[i];
				while (j >= 1 && ar[j - 1] < ar[j]) {
					j--;
					cnt++;
				}
				while (i <= n - 2 && ar[i + 1] < ar[i]) {
					i++;
					cnt++;
				}
				if (cnt > max) {
					max = cnt;
					highestPoint = ar[i];
				}
			} else {
				i++;
			}
		}
		System.out.println(max+ " "+highestPoint);
	}
}
