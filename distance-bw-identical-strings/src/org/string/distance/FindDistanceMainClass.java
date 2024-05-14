package org.string.distance;

public class FindDistanceMainClass {
	public static void main(String[] args) {
		String s = "he quick the brown quick brown the frog";
		String ar[]=s.split(" ");
		int distance=findDistance("quick", "frog",ar);
		System.out.println(distance);
	}
	public static int findDistance(String w1,String w2,String ar[]){
		int pos1=0,pos2=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i].equals(w1)) {
				pos1=i;
			}if(ar[i].equals(w2)) {
				pos2=i;
			}
		}
		int dis=Math.abs(pos1-pos2);
		return dis!=0?dis-1:0;
	}
}
