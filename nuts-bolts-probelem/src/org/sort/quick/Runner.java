package org.sort.quick;

public class Runner{
	public static void main(String[]args){
		char nuts[]={'^','&','%','@','#','*','$','~','!'};
		char bolts[]={'~','#','@','%','&','*','$','^','!'};
		NutBoltSorter.quickSort(nuts, bolts, 0, 8);
		for(char character : nuts) {
			System.out.print(character+" ");
		}
		System.out.println();
		for(char character : bolts) {
			System.out.print(character+" ");
		}
	}
}
