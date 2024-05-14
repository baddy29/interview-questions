package org.trees.operations;

import java.util.Scanner;

import org.trees.model.BinaryTree;

public class TreeOperation {
	public static int countLeaves(BinaryTree root) {
		if(root==null)
			return 0;
		if(root.getRight()==null && root.getLeft()==null)
			return 1;
		else
			return (countLeaves(root.getLeft())+countLeaves(root.getRight()));//space time= O(n)
	}
	
	public static int countNode(BinaryTree root) {
		if(root!=null) {
			return (1+countNode(root.getLeft())+countNode(root.getRight()));//space time= O(n)
		}
		return 0;
	}

	public static void traverse1(BinaryTree root) {
		if (root != null) {
			traverse1(root.getLeft());
			traverse1(root.getRight());
			System.out.print(root.getData()+",");
		}

	}
	public static void traverse2(BinaryTree root) {
		if (root != null) {
			traverse2(root.getLeft());
			System.out.print(root.getData()+",");
			traverse2(root.getRight());
		}

	}
	
	public static BinaryTree create() {
		BinaryTree treeNode=new BinaryTree();
		Scanner sc =new Scanner(System.in);
		System.out.println("Press -1 to end the node or enter number");
		int data = sc.nextInt();
		if(data==-1) {
			return null;
		}
		treeNode.setData(data);
		System.out.println("Enter left child of"+data);		
		treeNode.setLeft(create());
		System.out.println("Enter right child of"+data);
		treeNode.setRight(create());
		return treeNode;
	}
	
	public static BinaryTree insertBSTNode(BinaryTree root,int data) {
		if(root==null) {
			root=new BinaryTree();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
			return root;
		}
		else if(root.getData()==data) {
			return root;
		}
		else if(data<root.getData()) {
			root.setLeft(insertBSTNode(root.getLeft(), data));
		}
		else {
			root.setRight(insertBSTNode(root.getRight(), data));
		}
		return root;
	}
	
	public static int countFullNodes(BinaryTree root) {
		if(root==null || (root.getLeft()==null && root.getRight()==null))
			return 0;
		if(root.getLeft()!=null && root.getRight()!=null)
			return countFullNodes(root.getLeft())+countFullNodes(root.getRight()) +1;
		else
			return countFullNodes(root.getLeft())+countFullNodes(root.getRight());	
	}
	
	public static int heightOfTree(BinaryTree root) {
		if(root==null || (root.getLeft()==null && root.getRight()==null))
			return 0;
		else {
			int leftHeight=heightOfTree(root.getLeft());
			int rightHeight = heightOfTree(root.getRight());
			return (leftHeight>rightHeight?leftHeight:rightHeight)+1;
		}			
	}
	
	public static BinaryTree minBST(BinaryTree root) {
		if(root.getLeft()==null)
			return root;
		return minBST(root.getLeft());
	}
	
	public static int maxBST(BinaryTree root) {
		while(root.getRight()!=null)
			root=root.getRight();
		return root.getData();
	}
	
	public static BinaryTree deleteNode(BinaryTree root,int data) {
		if(root==null)
			return root;
		else if(data<root.getData())
			root.setLeft(deleteNode(root.getLeft(),data));
		else if( data>root.getData())
			 root.setRight(deleteNode(root.getRight(), data));
		else {
			if(root.getLeft()==null && root.getRight()==null) {
				root=null;
			}else if(root.getLeft()==null) {
				root.setData(root.getRight().getData());
				root.setRight(null);
			}else if(root.getRight()==null) {
				root.setData(root.getLeft().getData());
				root.setLeft(null);
			}else {
				BinaryTree node=minBST(root.getRight());
				root.setData(node.getData());
				root.setRight(deleteNode(root.getRight(),root.getData()));
			}
		}
		return root;
	}
}
