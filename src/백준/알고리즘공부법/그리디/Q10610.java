package 백준.알고리즘공부법.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Q10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        char[] ch = n.toCharArray(); // 문자열을 char 배열로 변환
        int[] num = new int[ch.length]; // 숫자 배열 생성

        for (int i = 0; i < ch.length; i++) {
            num[i] = ch[i] - '0'; // char 값을 int로 형변환하여 저장
        }

        if (Arrays.binarySearch(num, 0) < 0 || Arrays.stream(num).sum() % 3 != 0) {
            System.out.println(-1);
        } else {
            List<Integer> resultList = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            StringBuilder sb = new StringBuilder();
            for (Integer result : resultList) {
                sb.append(result);
            }

            System.out.println(sb);
        }
    }
}
