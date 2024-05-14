package org.trees.main;

import org.trees.model.BinaryTree;
import org.trees.operations.AVLOperations;
import org.trees.operations.TreeOperation;

public class Runner2 {
	public static void main(String[] args) {
		BinaryTree root=null;
		root=AVLOperations.avlInsertion(root, 21);
		root=AVLOperations.avlInsertion(root,26);
		root=AVLOperations.avlInsertion(root,30);
		root=AVLOperations.avlInsertion(root,9);
		root=AVLOperations.avlInsertion(root,4);
		root=AVLOperations.avlInsertion(root,14);
		root=AVLOperations.avlInsertion(root,28);
		root=AVLOperations.avlInsertion(root,18);
		root=AVLOperations.avlInsertion(root,15);
		root=AVLOperations.avlInsertion(root,10);
		root=AVLOperations.avlInsertion(root,2);
		root=AVLOperations.avlInsertion(root,3);
		root=AVLOperations.avlInsertion(root,7);
		TreeOperation.traverse1(root);
		System.out.println("\n=================");
		TreeOperation.traverse2(root);
	}
}
