package org.trees.operations;

import org.trees.model.BinaryTree;

public class TreeStatus {
	public static boolean isCompleteTree(BinaryTree root) {
		if (root == null)
			return true;
		else if (root.getLeft() == null && root.getRight() == null)
			return true;
		else if (root.getLeft() != null && root.getRight() != null)
			return (isCompleteTree(root.getLeft()) && isCompleteTree(root.getRight()));
		else
			return false;

	}
}
