package pkg;

public class MainClass {
	public static void main(String[] args) {
		int MATRIX[][] = { {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 0, 0, 0},
		           {0, 0, 1, 0}  };
		int iKnows[]=new int[4];
		int jKnown[]=new int[4];
		boolean celebfound = false;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(MATRIX[i][j]==1) {
					iKnows[i]+=1;
					jKnown[j]+=1;
				}
			}
		}
		for(int k=0;k<4;k++) {
			if(iKnows[k]==0 && jKnown[k]==3) {
				System.out.println(k);
				celebfound=true;
			}
		}
		if(!celebfound)
			System.out.println("No celeb");
	}
}
