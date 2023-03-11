package 백준.알고리즘공부법.그래프;

import java.util.Scanner;

public class Q11724 {
    static int[][] graph; // 인접행렬 그래프
    static boolean[] visited; // 방문여부를 저장할 배열
    static int count = 0; // 연결 요소의 개수를 저장할 변수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정점의 개수
        int m = sc.nextInt(); // 간선의 개수

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        // 그래프 생성
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = graph[v][u] = 1; // 양방향 그래프이므로 대칭적으로 추가
        }

        // 모든 정점에 대해 DFS 수행
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++; // DFS가 종료될 때마다 연결 요소의 개수 증가
            }
        }

        System.out.println(count); // 연결 요소의 개수 출력
    }

    // 깊이 우선 탐색 (DFS)
    static void dfs(int v) {
        visited[v] = true; // 현재 정점 방문 처리

        for (int i = 1; i < graph.length; i++) {
            // 연결되어 있고, 방문하지 않은 정점인 경우 재귀 호출
            if (graph[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
