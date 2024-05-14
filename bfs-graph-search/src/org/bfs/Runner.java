package org.bfs;

import java.util.LinkedList;

import org.bfs.datastructure.Graph;
import org.bfs.operation.BFSTraversal;
import org.bfs.operation.DFSTraversal;

public class Runner {
	public static void main(String[] args) {
		/*
		 * Graph graph = new Graph(4); LinkedList<Integer> linkedNodes=new
		 * LinkedList<>(); linkedNodes.add(1); linkedNodes.add(2);
		 * graph.addEdge(0,linkedNodes); linkedNodes=new LinkedList<>();
		 * linkedNodes.add(2); graph.addEdge(1, linkedNodes); linkedNodes=new
		 * LinkedList<>(); linkedNodes.add(0); linkedNodes.add(3); graph.addEdge(2,
		 * linkedNodes); linkedNodes=new LinkedList<>(); linkedNodes.add(3);
		 * graph.addEdge(3, linkedNodes);
		 */
		Graph graph = new Graph(9);
		LinkedList<Integer> linkedNodes=new LinkedList<>();
		linkedNodes.add(1);
		linkedNodes.add(2);
		graph.addEdge(1,linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(4);
		linkedNodes.add(5);
		linkedNodes.add(1);
		graph.addEdge(2, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(6);
		linkedNodes.add(7);
		linkedNodes.add(1);
		graph.addEdge(3, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(2);
		linkedNodes.add(8);
		graph.addEdge(4, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(2);
		linkedNodes.add(8);
		graph.addEdge(4, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(2);
		linkedNodes.add(8);
		graph.addEdge(5, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(3);
		linkedNodes.add(8);
		graph.addEdge(6, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(3);
		linkedNodes.add(8);
		graph.addEdge(7, linkedNodes);
		linkedNodes=new LinkedList<>();
		linkedNodes.add(4);
		linkedNodes.add(5);
		linkedNodes.add(6);
		linkedNodes.add(7);
		graph.addEdge(8, linkedNodes);
		System.out.println("vertices ="+graph.getVertices());
		for(int i=1;i<=8;i++) {
			System.out.println(i+"->"+graph.getAdj().get(i));	
		}
		BFSTraversal bfsTraversal=new BFSTraversal();

		System.out.println("=======================");
		bfsTraversal.traverse(graph, 1);
		DFSTraversal dfsTraversal=new DFSTraversal();
		dfsTraversal.traversal(graph, 1,new int[9]);
	}
	
}
