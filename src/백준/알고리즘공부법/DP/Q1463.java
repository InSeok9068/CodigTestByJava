package 백준.알고리즘공부법.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1]; // 연산 횟수를 저장할 배열

        // 1은 이미 1이므로 연산 횟수는 0
        dp[1] = 0;

        // i가 2부터 n까지 반복하며 최소 연산 횟수를 계산
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 뺀 경우
            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) { // 2로 나눌 수 있는 경우
                dp[i] = dp[i / 2] + 1;
            }
            if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) { // 3으로 나눌 수 있는 경우
                dp[i] = dp[i / 3] + 1;
            }
        }

        System.out.println(dp[n]); // n까지의 최소 연산 횟수 출력

    }
}

//    입력값 n을 받습니다.
//    연산 횟수를 저장할 배열 dp를 생성합니다.
//    1은 이미 1이므로 연산 횟수는 0으로 초기화합니다.
//    i가 2부터 n까지 반복하며 최소 연산 횟수를 계산합니다.
//    i-1번째 연산 횟수에 1을 더하는 경우와 i/2번째 연산 횟수에 1을 더하는 경우, i/3번째 연산 횟수에 1을 더하는 경우 중에서 가장 작은 값을 i번째 연산 횟수로 저장합니다.
//    n까지의 최소 연산 횟수를 출력합니다.
