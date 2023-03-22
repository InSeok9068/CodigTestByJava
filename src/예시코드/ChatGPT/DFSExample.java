package 예시코드.ChatGPT;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSExample {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    // constructor
    public DFSExample(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    // add an edge to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // depth-first search
    public void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFS(n, visited);
            }
        }
    }

    // test the DFS algorithm
    public static void main(String[] args) {
        DFSExample g = new DFSExample(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS Traversal:");
        boolean[] visited = new boolean[4];
        g.DFS(2, visited);
    }
}
