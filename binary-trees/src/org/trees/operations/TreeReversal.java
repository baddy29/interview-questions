package org.trees.operations;

import org.trees.model.BinaryTree;

public class TreeReversal {
	public static void mirror(BinaryTree root) {
		if(root!=null) {
			mirror(root.getLeft());
			mirror(root.getRight());
			BinaryTree tempNode=new BinaryTree();
			tempNode=root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(tempNode);
		}
		return ;
	}
}
