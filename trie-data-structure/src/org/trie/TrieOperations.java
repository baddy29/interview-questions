package org.trie;

public class TrieOperations {

	private static Trie root = null;

	public static void initTrie() {
		root = new Trie('\0');
	}

	public static void insert(String word) {
		Trie currNode = root;
		for (int i = 0; i < word.length(); i++) {
			char currChar = word.charAt(i);
			if (currNode.childNode[currChar - 'a'] == null)
				currNode.childNode[currChar - 'a'] = new Trie(currChar);
			currNode = currNode.childNode[currChar - 'a'];
		}
		currNode.isWord = true;
	}

	public static Trie getNode(String word) {
		Trie currNode = root;
		for (int i = 0; i < word.length(); i++) {
			char currChar = word.charAt(i);
			if (currNode.childNode[currChar - 'a'] == null)
				return null;
			currNode = currNode.childNode[currChar - 'a'];
		}
		return currNode;
	}

	public static boolean search(String word) {
		Trie node = getNode(word);
		return node != null && node.isWord;
	}

	public static boolean prefixSearch(String word) {
		return getNode(word) != null;
	}
}
