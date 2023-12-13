package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GraphLogic {
	HashMap<Integer, ArrayList<Edges>> vertices=new HashMap<Integer, ArrayList<Edges>>();
	public GraphLogic() {
		// TODO Auto-generated constructor stub
	}
	
	public void addEdge(int source,int dest) {
		Edges edge=new Edges(source,dest);
		ArrayList<Edges> edges;
	    if(vertices.get(source)!=null)
	    	edges=vertices.get(source);
	    else
	    	edges= new ArrayList<Edges>();
	    edges.add(edge);
	    vertices.put(source, edges);
	    if(!vertices.containsKey(edges)) {//condition false means get in to it
	    	vertices.put(dest,new ArrayList<Edges>());//creats a new arraylist for this 
	    }
	    	
	}
	public void BFS(int startValue) {
		HashMap<Integer, Boolean> verified=new HashMap<Integer, Boolean>();
		vertices.keySet().forEach(key ->{
			verified.put(key, false);
		});
		Queue<Integer> queueArr=new LinkedList<>();
		queueArr.add(startValue);
		verified.put(startValue, true);
		
		while(queueArr.size()!=0) {
			startValue=queueArr.poll();
			System.out.println(startValue);
			
			ArrayList<Edges> startNodeEdges= vertices.get(startValue);
			for(int i=0;i<startNodeEdges.size();i++) {
				int destinationValue=startNodeEdges.get(i).getDestination();
				if(!verified.get(destinationValue)) {
					verified.put(destinationValue, true);
					queueArr.add(destinationValue);
				}
			}
		}
	}
	public void DFSRecursive(int startValue,HashMap<Integer, Boolean> verified) {
		ArrayList<Edges> startNodeEdges= vertices.get(startValue);
		System.out.println(startValue);
		for(int i=0;i<startNodeEdges.size();i++) {
			int destinationValue=startNodeEdges.get(i).getDestination();
			if(!verified.get(destinationValue)) {
				verified.put(destinationValue, true);
				DFSRecursive(destinationValue, verified);
			}
		}
	}
	public void DFS(int startValue) {
		HashMap<Integer, Boolean> verified=new HashMap<Integer, Boolean>();
		vertices.keySet().forEach(key ->{
			verified.put(key, false);
		});
		verified.put(startValue,true);
		DFSRecursive(startValue, verified);
	}
	public void print() {
		/*edges.forEach(edge ->{
			System.out.println(edge.getSource()+","+edge.getDestination());
		});*/	
		//normal for loop
		/*for(int i=0;i<edges.size();i++) {
			Edges edge=edges.get(i);
			System.out.println(edge.getSource()+","+edge.getDestination());
		}*/
		vertices.keySet().forEach(key ->{
			vertices.get(key).forEach(edge ->{
				System.out.println(edge.getSource()+","+edge.getDestination());
			});
		});
		}
}
