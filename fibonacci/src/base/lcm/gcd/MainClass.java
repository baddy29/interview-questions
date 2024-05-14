package base.lcm.gcd;

public class MainClass {
	public static void main(String[] args) {
		int x=120;
		int y=56;
		int gcd=1;
		int min=(x<y)?x:y;
		for(int i=1;i<min;i++) {
			if(x%i==0 && y%i==0) {
				gcd=i;
			}
		}
		int lcm=(x*y)/gcd;
		System.out.println(lcm+"^^^"+gcd);
	}
}
