package org.trie;

public class Trie {
	public char c;
	public boolean isWord;
	public Trie childNode[];
	
	Trie(char c){
		this.c=c;
		isWord=false;
		childNode=new Trie[26];
	}
}
