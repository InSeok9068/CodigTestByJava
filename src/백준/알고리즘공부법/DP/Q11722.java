package 백준.알고리즘공부법.DP;

import java.util.Scanner;

public class Q11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int max = 0;

        // 입력 받은 수열 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 각 원소를 마지막으로 하는 감소하는 부분 수열의 길이 계산
        for (int i = 0; i < n; i++) {
            dp[i] = 1;  // 자기 자신이 하나의 수열이 될 수 있으므로 1로 초기화
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i] && dp[j] + 1 > dp[i]) { // arr[j]가 arr[i]보다 크고, j를 마지막으로 하는 수열의 길이 dp[j]에 1을 더한 값이 i를 마지막으로 하는 수열의 길이 dp[i]보다 크다면
                    dp[i] = dp[j] + 1; // i를 마지막으로 하는 감소하는 부분 수열의 길이를 dp[j] + 1로 갱신
                }
            }
            max = Math.max(max, dp[i]); // dp 배열에서 가장 큰 값이 가장 긴 감소하는 부분 수열의 길이가 된다
        }

        System.out.println(max);
        sc.close();
    }
}
