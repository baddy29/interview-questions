package org.bfs.operation;

import org.bfs.datastructure.Graph;

public class DFSTraversal {

	public void traversal(Graph graph, int startNode,int isVisited[]) {
		int exploreNode = startNode;
		System.out.print(exploreNode+" ");
		isVisited[exploreNode] = 1;
		for (int j = 0; j < graph.getAdj().get(exploreNode).size(); j++) {
			if (isVisited[graph.getAdj().get(exploreNode).get(j)] != 1) {
				exploreNode = graph.getAdj().get(exploreNode).get(j);
				traversal(graph, exploreNode,isVisited);
			}
		}
	}
}
