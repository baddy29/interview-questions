package org.trees.main;

import java.util.LinkedList;

import org.trees.model.BinaryTree;
import org.trees.operations.TreeOperation;
import org.trees.operations.TreeView;

public class Runner3 {
	public static void main(String[] args) {
		BinaryTree treeRoot = null;
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 15);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 10);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 20);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 5);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 11);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 2);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 17);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 6);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 16);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 18);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 19);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 14);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 3);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 9);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 13);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 12);
		LinkedList<BinaryTree> levelOrderList=new LinkedList<>();
		levelOrderList.addLast(treeRoot);
		TreeView.levelOrderTraversal(levelOrderList,2);
		System.out.println("\n ==");
		//TreeView.leftView(treeRoot, 1);
		System.out.println("\n ==");
		//TreeView.rightView(treeRoot, 1);
		TreeView.topView(treeRoot);
		
		// TreeOperation.traverse1(treeRoot); System.out.println("\n=================");
		 //TreeOperation.traverse2(treeRoot);
		
	}
	
}
/*
 * //[15] [10] [5] [20] [2] [19]
 */