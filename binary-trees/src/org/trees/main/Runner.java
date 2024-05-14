package org.trees.main;

import org.trees.model.BinaryTree;
import org.trees.operations.TreeOperation;
import org.trees.operations.TreeStatus;

public class Runner {

	public static void main(String[] args) {
//		BinaryTree treeRoot = TreeOperation.create();
		BinaryTree treeRoot = null;
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 15);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 10);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 20);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 40);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 5);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 11);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 2);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 17);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 6);
		TreeOperation.traverse2(treeRoot);
		System.out.println("========");
		System.out.println("No. of nodes=" + TreeOperation.countNode(treeRoot));
		System.out.println("No. of leaves=" + TreeOperation.countLeaves(treeRoot));
		System.out.println("No. of full nodes=" + TreeOperation.countFullNodes(treeRoot));
		System.out.println("Height of tree=" + TreeOperation.heightOfTree(treeRoot));
		System.out.println("Min of tree=" + TreeOperation.minBST(treeRoot).getData());
		System.out.println("Max of tree=" + TreeOperation.maxBST(treeRoot));
		System.out.println("Complete tree=" + TreeStatus.isCompleteTree(treeRoot));

		TreeOperation.deleteNode(treeRoot, 15);
		TreeOperation.traverse1(treeRoot);
		System.out.println("========");
		TreeOperation.traverse2(treeRoot);

	}
}
