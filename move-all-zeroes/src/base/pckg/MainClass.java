package base.pckg;

public class MainClass {
	public static void main(String[] args) {
		int a[]= {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		int count=0;
		for(int i =0;i<a.length;i++) {
			if(a[i]!=0)
				a[count++]=a[i];
		}
		while(count<a.length) {
			a[count++]=0;
		}
		for(int x:a) {
			System.out.print(x+",");
		}
	}
	public static void swap(int a[],int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
