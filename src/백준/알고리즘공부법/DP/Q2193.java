package 백준.알고리즘공부법.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long d[] = new long[count + 1];
        // d[n] = n자리 이친수.
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= count; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[count]);
    }
}