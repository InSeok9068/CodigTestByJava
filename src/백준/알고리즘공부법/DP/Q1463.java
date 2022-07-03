package 백준.알고리즘공부법.DP;

// 문제
// 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//
// X가 3으로 나누어 떨어지면, 3으로 나눈다.
// X가 2로 나누어 떨어지면, 2로 나눈다.
// 1을 뺀다.
// 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
//
// 입력
// 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
//
// 출력
// 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
//
// 예제 입력 1
// 2
// 예제 출력 1
// 1
// 예제 입력 2
// 10
// 예제 출력 2
// 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.print(recur(N));

    }

    static int recur(int N) {

        if (dp[N] == null) {
            // 6으로 나눠지는 경우
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
            }
            // 3으로만 나눠지는 경우
            else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            // 2로만 나눠지는 경우
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = recur(N - 1) + 1;
            }
        }
        return dp[N];
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int N = in.nextInt();
//        System.out.println(recur(N, 0));
//    }
//
//    static int recur(int N, int count) {
//        // N이 2 미만인 경우 누적된 count값을 반환
//        if (N < 2) {
//            return count;
//        }
//        return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));
//
//    }
}
