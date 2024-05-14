package product.main;

public class MainClass {

	class Solution{
		
		public int[] productExcept(int []ar) {
			
			int output[]=new int[ar.length];
			int product=1;
			if(ar.length<1)
				return ar;
			
			for(int j=ar.length-1;j>0;j--) {
				output[j]=ar[j-1]*product;
				product=ar[j]*product;
			}
			output[0]=product;
			return output;
		}
	}
	public static void main(String[] args) {
		MainClass m=new MainClass();
		Solution s=m.new Solution();
		int ar[]= {5,6,7};
		int output[]= s.productExcept(ar);
		for(int i:output){
			System.out.print(i+" ,");
		}
	}
}
