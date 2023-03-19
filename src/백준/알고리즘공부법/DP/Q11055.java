package 백준.알고리즘공부법.DP;

import java.util.Scanner;

public class Q11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 받을 수열의 길이
        int[] arr = new int[n]; // 입력 받을 수열
        int[] dp = new int[n]; // 각 원소를 마지막으로 하는 최대 증가 부분 수열의 합을 저장하는 배열

        // 수열 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 첫 번째 원소는 항상 최대 증가 부분 수열이 자기 자신이므로 dp 배열의 첫 번째 원소에 해당 원소 값을 저장한다.
        dp[0] = arr[0];

        // 각 원소를 마지막으로 하는 최대 증가 부분 수열의 합을 구하기 위한 반복문
        for (int i = 1; i < n; i++) {
            dp[i] = arr[i]; // 현재 원소를 마지막으로 하는 증가 부분 수열의 합은 현재 원소 값으로 초기화한다.
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) { // 이전 원소(arr[j])보다 현재 원소(arr[i])가 크면 증가 부분 수열이므로
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]); // 이전에 저장된 최대 증가 부분 수열의 합(dp[j])과 현재 원소 값(arr[i])을 더한 값과 현재 저장된 최대 증가 부분 수열의 합(dp[i]) 중 더 큰 값을 dp[i]에 저장한다.
                }
            }
        }

        int max = dp[0]; // 최대 증가 부분 수열의 합 중 최댓값을 저장할 변수를 dp[0]으로 초기화한다.
        for (int i = 1; i < n; i++) {
            max = Math.max(max, dp[i]); // dp 배열을 돌며 최댓값을 찾는다.
        }
        System.out.println(max); // 최댓값 출력
    }

    // 이분 탐색 방법
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int[] dp = new int[n]; // dp 배열
//        int len = 0; // 증가 부분 수열 길이 변수
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            int idx = Arrays.binarySearch(dp, 0, len, arr[i]); // 이분 탐색
//            if (idx < 0) {
//                idx = -(idx + 1);
//            }
//            dp[idx] = arr[i];
//            if (idx == len) {
//                len++;
//            }
//        }
//
//        int sum = 0;
//        for (int i = 0; i < len; i++) {
//            sum += dp[i];
//        }
//        System.out.println(sum);
//    }
}
