package 백준.알고리즘공부법.DP;

import java.util.Scanner;

public class Q2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1]; // 포도주 잔에 들어있는 포도주의 양을 저장하는 배열
        int[][] dp = new int[n + 1][3]; // DP를 위한 2차원 배열

        // 포도주 잔에 들어있는 포도주의 양 입력 받기
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // 초기값 설정
        dp[1][0] = 0; // i번째 잔을 마시지 않는 경우
        dp[1][1] = a[1]; // i번째 잔을 마시고 i-1번째 잔을 마시지 않는 경우
        dp[1][2] = 0; // i번째 잔을 마시고 i-1번째 잔도 마시는 경우

        // DP로 최대로 마실 수 있는 포도주의 양 구하기
        for (int i = 2; i <= n; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2]));
            dp[i][1] = dp[i - 1][0] + a[i];
            dp[i][2] = dp[i - 1][1] + a[i - 1];
        }

        // 결과 출력
        System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
    }
}
