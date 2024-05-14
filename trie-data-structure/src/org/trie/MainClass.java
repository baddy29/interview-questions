package org.trie;

public class MainClass {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TrieOperations.initTrie();
		TrieOperations.insert("abc");
		TrieOperations.insert("efg");
		TrieOperations.insert("efc");
		System.out.println(TrieOperations.search("efc"));
		System.out.println(TrieOperations.prefixSearch("ab"));
		System.out.println(TrieOperations.prefixSearch("zx"));
		System.out.println(TrieOperations.search("efk"));

	}
}
