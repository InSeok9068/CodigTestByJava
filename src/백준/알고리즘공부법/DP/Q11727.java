package 백준.알고리즘공부법.DP;

//문제
//2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
//
//아래 그림은 2×17 직사각형을 채운 한가지 예이다.
//
//
//
//입력
//첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
//
//출력
//첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
//
//예제 입력 1
//2
//예제 출력 1
//3
//예제 입력 2
//8
//예제 출력 2
//171
//예제 입력 3
//12
//예제 출력 3
//2731

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
