package org.bfs.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

	private int vertices;
	private ArrayList<LinkedList<Integer>> adj= new ArrayList<>(vertices);
	
	 public Graph(int v){
		vertices=v;
		for(int i=1;i<=vertices;i++) {
			adj.add(new LinkedList<Integer>());
		}
	}
	 public void addEdge(int v,LinkedList<Integer> adjList) {
		 adj.set(v, adjList);
	 }
	public int getVertices() {
		return vertices;
	}
	public void setVertices(int vertices) {
		this.vertices = vertices;
	}
	public ArrayList<LinkedList<Integer>> getAdj() {
		return adj;
	}
	public void setAdj(ArrayList<LinkedList<Integer>> adj) {
		this.adj = adj;
	}
	 
	 	 
}
