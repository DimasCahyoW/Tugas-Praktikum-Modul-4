package javaapplication1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 */
public class AdjacencyList {
    public enum NodeColour { WHITE, GRAY, BLACK}
    
    public static class Node{
        int data;
        int distance;
        Node predecessor;
        NodeColour colour;
        
        public Node(int data){
            this.data = data;
        }
        @Override
        public String toString(){
            return "(" + data + ",d=" + distance + ")";
        }
    }
    Map<Node, List<Node>> nodes;
    
    public AdjacencyList(){
        nodes = new HashMap<Node,List<Node>>();
    }
    
    public void addEdge(Node n1, Node n2){
        if(nodes.containsKey(n1)){
            nodes.get(n1).add(n2);
        } else{
       ArrayList<Node> list = new ArrayList<Node>();
            list.add(n2);
            nodes.put(n1,list);
        }
    }
    
    public void bfs(Node s){
        Set<Node> keys = nodes.keySet();
        for(Node u : keys){
            if(u != s){
                u.colour = NodeColour.WHITE;
                u.distance = Integer.MAX_VALUE;
                u.predecessor = null;
            }
        }
        s.colour = NodeColour.GRAY;
        s.distance = 0;
        s.predecessor = null;
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(s);
        while(!q.isEmpty()){
            Node u = q.remove();
            List<Node> adj_u = nodes.get(u);
            if(adj_u != null){
                for(Node v : adj_u){
                    if(v.colour == NodeColour.WHITE){
                        v.colour = NodeColour.GRAY;
                        v.distance = u.distance + 1;
                        v.predecessor = u;
                        q.add(v);
                    }
                }
            }
            u.colour = NodeColour.BLACK;
            System.out.print(u + " ");
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        AdjacencyList graph = new AdjacencyList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        
        graph.addEdge(n1, n2);
        
        graph.addEdge(n2, n1);
        graph.addEdge(n2, n3);
        
        graph.addEdge(n3, n4);
        graph.addEdge(n3, n2);
        
        graph.addEdge(n4, n3);
        graph.addEdge(n4, n5);
        graph.addEdge(n4, n6);
        
        graph.addEdge(n5, n4);
        graph.addEdge(n5, n6);
        graph.addEdge(n5, n7);
        
        graph.addEdge(n6, n4);
        graph.addEdge(n6, n5);
        graph.addEdge(n6, n7);
        graph.addEdge(n6, n8);
        
        graph.addEdge(n7, n5);
        graph.addEdge(n7, n6);
        graph.addEdge(n7, n8);
        
        graph.addEdge(n8, n6);
        graph.addEdge(n8, n7);
        
        System.out.println("BFS starting from Node 3:");
        graph.bfs(n3);
        
        // Menentukan cara mencapai simpul 8, 6, dan 7 dari simpul awal (simpul 3)
        // To determine the shortest path from Node 3 to Node 8, 6, and 7, you can do the following:
        System.out.println("\nShortest path from Node 3 to Node 8: " + getShortestPath(n3, n8));
        System.out.println("Shortest path from Node 3 to Node 6: " + getShortestPath(n3, n6));
        System.out.println("Shortest path from Node 3 to Node 7: " + getShortestPath(n3, n7));
    }

    public static String getShortestPath(Node start, Node end) {
        if (end == null || end.distance == Integer.MAX_VALUE) {
            return "No path found.";
        }

        List<Node> path = new ArrayList<>();
        Node current = end;
        while (current != null) {
            path.add(current);
            current = current.predecessor;
        }

        StringBuilder pathString = new StringBuilder();
        for (int i = path.size() - 1; i >= 0; i--) {
            pathString.append(path.get(i).data);
            if (i != 0) {
                pathString.append(" -> ");
            }
        }

        return pathString.toString();
        
    }
}
