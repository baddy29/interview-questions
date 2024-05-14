package org.count.frequency;

public class MainClass3 {
	public static void main(String[] args) {
		System.gc();
		System.out.println("in main");
	}
	@Override
	protected void finalize() {
		System.out.println("hg");
	}
}
