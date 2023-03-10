package 백준.알고리즘공부법.문자열처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        List<String> alphabet = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (String x : alphabet) {
            sb.append(S.indexOf(x)).append(" ");
        }

        System.out.println(sb);
    }
}
