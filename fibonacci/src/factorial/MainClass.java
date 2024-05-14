package factorial;

public class MainClass {
	public static void main(String[] args) {
		int n=7;
		System.out.println(factorial(n));
	}
	public static int factorial(int num) {
		if(num==0 )
			return 1;
		return num*factorial((num-1));
	}
}
