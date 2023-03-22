package 예시코드.ChatGPT;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSExample {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    // constructor
    public BFSExample(int v) {
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

    // breadth-first search
    public void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // test the BFS algorithm
    public static void main(String[] args) {
        BFSExample g = new BFSExample(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS Traversal:");
        g.BFS(2);
    }
}
