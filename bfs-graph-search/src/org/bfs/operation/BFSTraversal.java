package org.bfs.operation;

import java.util.LinkedList;

import org.bfs.datastructure.Graph;

public class BFSTraversal {

	public void traverse(Graph graph, int start) {

		int exploreNode = start;
		int noOfNodes = graph.getVertices();
		int isVisted[] = new int[noOfNodes];
		isVisted[exploreNode] = 1;
		System.out.print(exploreNode + " ");
		for(int k=0;k<noOfNodes;k++) {
			if(isVisted[k]!=1) {
				search(noOfNodes,exploreNode,isVisted,graph);
			}
		}
		System.out.println("\n=================");
	}
	
	public void search(int noOfNodes,int exploreNode,int isVisted[],Graph graph){
		LinkedList<Integer> queue = new LinkedList<>();
			for (int j = 0; j <graph.getAdj().get(exploreNode).size(); j++) {
				int weight=graph.getAdj().get(exploreNode).get(j);
				if (isVisted[weight] != 1) {
					queue.add(weight);
					isVisted[weight] = 1;
				}

			}
			if (queue.isEmpty()) {
				return;
			}
			exploreNode=queue.getFirst();
			System.out.print(exploreNode + " ");
			queue.removeFirst();
		
	}

}
