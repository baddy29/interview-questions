package pkg;

import java.util.Stack;

public class MainClass2 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		int MATRIX[][] = { {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 0, 0, 0},
		           {0, 0, 1, 0}  };
		for(int i=0;i<4;i++) {
			s.push(i);			
		}
		while(s.size()>=2) {
			int j=s.pop();
			int k=s.pop();
			if(MATRIX[j][k]==1) {
				s.push(k);
			}else {
				s.push(j);
			}
		}
		int l=s.pop();
		int count=0;
		for(int i =0;i<3;i++) {
			if(MATRIX[l][i]==0) {
				count++;
			}
		}
		if(count==3) {
			System.out.println(l);
		}else {
			System.out.println("no celeb");
		}
	}
}
