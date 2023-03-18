package 코딩인터뷰완전분석.재귀와동적프로그래밍해법;

import java.util.Arrays;

public class Q8_1 {
    public static void main(String[] args) {
        System.out.println(countWays(20));
    }

    public static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }

    public static int countWays(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) +
                    countWays(n - 3, memo);
            return memo[n];
        }
    }
}
