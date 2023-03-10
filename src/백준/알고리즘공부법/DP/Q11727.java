package 백준.알고리즘공부법.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        // d[i]는 2xi 크기의 직사각형을 채우는 방법의 수
        int[] d = new int[N + 1];

        // 초기값 설정
        d[0] = 1;
        d[1] = 1;

        // 점화식을 이용하여 d[i] 계산
        for (int i = 2; i <= N; i++) {
            d[i] = d[i - 1] + 2 * d[i - 2];
            d[i] %= 10007;
        }

        System.out.println(d[N]);
    }
}
