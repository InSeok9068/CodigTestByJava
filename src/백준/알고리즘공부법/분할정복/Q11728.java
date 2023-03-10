package 백준.알고리즘공부법.분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Q11728 {

    // 틀린문제
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list1.add(br.read());
        }

        for (int i = 0; i < M; i++) {
            list2.add(br.read());
        }

        list1.addAll(list2);

        list1.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        list1.forEach(integer -> {
            sb.append(integer).append(" ");
        });

        System.out.println(sb);
    }
}
