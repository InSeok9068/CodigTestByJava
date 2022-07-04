package 백준.알고리즘공부법.분할정복;

// 문제
// 정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.
//
// 입력
// 첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)
//
// 둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절댓값이 109보다 작거나 같은 정수이다.
//
// 출력
// 첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.
//
// 예제 입력 1
// 2 2
// 3 5
// 2 9
// 예제 출력 1
// 2 3 5 9
// 예제 입력 2
// 2 1
// 4 7
// 1
// 예제 출력 2
// 1 4 7
// 예제 입력 3
// 4 3
// 2 3 5 9
// 1 4 7
// 예제 출력 3
// 1 2 3 4 5 7 9

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
