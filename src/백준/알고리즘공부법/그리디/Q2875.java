package 백준.알고리즘공부법.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int maxTeam = 0; // 최대 팀 수

        while (n >= 2 && m >= 1 && n + m >= k + 3) { // 여자 2명, 남자 1명이 팀을 이룰 수 있을 때까지 반복
            n -= 2;
            m -= 1;
            maxTeam += 1;
        }

        System.out.println(maxTeam);
    }
}
