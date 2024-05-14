package org.trees.commonnodes;

import java.util.HashMap;
import java.util.Map;

import org.trees.model.BinaryTree;
import org.trees.operations.TreeOperation;

public class RunClass {

	static HashMap<Integer,Integer> map=new HashMap<>();
	public static void addNodesToMap(BinaryTree tree,HashMap<Integer,Integer> map2) {
		if(tree!=null) {
		addNodesToMap(tree.getLeft(),map2);
		addNodesToMap(tree.getRight(),map2);
		map2.put(tree.getData(),tree.getData());

		}
	}
	
	public static void main(String[] args) {
		BinaryTree treeRoot = null;
		BinaryTree treeRoot2 = null;
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 15);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 10);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 20);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 40);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 5);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 11);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 2);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 17);
		treeRoot = TreeOperation.insertBSTNode(treeRoot, 6);
		HashMap<Integer,Integer> mappedNodes=new HashMap<>();
		addNodesToMap(treeRoot,mappedNodes);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 40);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 5);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 11);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 2);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 17);
		treeRoot2 = TreeOperation.insertBSTNode(treeRoot, 6);
		HashMap<Integer,Integer> map2=new HashMap<>();
		addNodesToMap(treeRoot2,map2);
		int i=0;
		for(Map.Entry<Integer, Integer>e:mappedNodes.entrySet()) {
			if(map2.containsKey(e.getKey())) {
				System.out.println(++i);
			}
		}
		
		
	}
}