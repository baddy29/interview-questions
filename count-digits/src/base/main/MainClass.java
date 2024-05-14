package base.main;

public class MainClass {
	public static void main(String[] args) {
		int n=11;
		int count=0;
		for(int i=1;i<=n;i++) {
			count+=numberOfDigits(i,0);
		}
		System.out.println(count);
	}
	
	public static int numberOfDigits(int n, int count) {
		if(n==0)
			return count;
		count++;
		n/=10;
		return numberOfDigits(n, count);
			
	}
}
