package 예시코드.ChatGPT;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_깊이우선탐색 {
}

class BFS {

    private int numV;   // 정점의 개수
    private LinkedList<Integer> adj[]; // 인접 리스트

    // 생성자
    BFS(int v) {
        numV = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);
    }

    // 노드 연결
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // s를 시작 노드로 한 너비 우선 탐색
    void BFS(int s) {
        // 방문한 노드를 저장하는 배열
        boolean visited[] = new boolean[numV];

        // 큐(Queue) 생성
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // 현재 노드를 방문한 것으로 표시하고 큐에 삽입
        visited[s] = true;
        queue.add(s);

        // 큐가 빌 때까지 반복
        while (queue.size() != 0) {
            // 큐에서 원소 꺼내기
            s = queue.poll();
            System.out.print(s + " ");

            // 방문한 노드와 인접한 모든 노드를 가져오기
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // 방문하지 않은 노드면 방문하고 큐에 삽입
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}