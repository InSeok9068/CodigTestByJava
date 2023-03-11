package 백준.알고리즘공부법.DP;

import java.util.Scanner;

public class Q11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수열의 크기 n을 입력받음
        int n = sc.nextInt();

        // 수열 a와 dp 배열을 생성
        int[] a = new int[n];
        int[] dp = new int[n];

        // 수열 a를 입력받고 dp 배열을 모두 1로 초기화
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dp[i] = 1; // 모든 수는 길이가 1인 부분 수열이므로 1로 초기화
        }

        // dp 배열을 채워나가는 과정
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // A[i]보다 작은 수들 중에서 dp 값이 가장 큰 것을 찾아서 1을 더해줌
                if (a[j] < a[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // dp 배열에서 가장 큰 값을 찾아 출력해줌
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max); // 가장 긴 증가하는 부분 수열의 길이 출력
    }
}

//    코드를 실행하면 먼저 Scanner 클래스를 이용하여 입력을 받습니다.
//    입력받은 수열의 크기를 n 변수에 저장합니다.
//    수열 a와 dp 배열을 생성합니다. dp 배열은 가장 긴 증가하는 부분 수열의 길이를 저장할 것입니다.
//    for문을 이용하여 배열 a에 수열 A를 입력받습니다. 이 때, dp 배열은 모든 수가 길이가 1인 부분 수열이므로 1로 초기화됩니다.
//    이중 for문을 이용하여 dp 배열을 채워줍니다. dp[i]를 구하기 위해서는 A[1]부터 A[i-1]까지의 수열 중에서 A[i]보다 작은 수들 중에서 dp 값이 가장 큰 것을 찾아서 1을 더해주면 됩니다.
//    마지막으로, dp 배열에서 가장 큰 값을 찾아 출력해주면 됩니다. 이 값이 주어진 수열 A의 가장 긴 증가하는 부분 수열의 길이가 됩니다.
