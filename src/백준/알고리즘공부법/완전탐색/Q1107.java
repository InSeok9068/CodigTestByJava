package 백준.알고리즘공부법.완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] broken = new boolean[10];

        for (int i = 0; i < m; i++) {
            int n = Integer.parseInt(st.nextToken());
            broken[n] = true;
        }

        int result = Math.abs(target - 100); //초기값 설정
        for (int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for (int j = 0; j < len; j++) {
                if (broken[str.charAt(j) - '0']) { //고장난 버튼을 눌러야 하면
                    isBreak = true;
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if (!isBreak) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(target - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(target - i)
                result = Math.min(min, result);
            }
        }

        System.out.println(result);
    }
}
