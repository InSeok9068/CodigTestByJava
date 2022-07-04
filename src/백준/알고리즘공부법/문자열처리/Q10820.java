package 백준.알고리즘공부법.문자열처리;

// 문제
// 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
//
// 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
//
// 입력
// 첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.
//
// 출력
// 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
//
// 예제 입력 1
// This is String
// SPACE    1    SPACE
// S a M p L e I n P u T
// 0L1A2S3T4L5I6N7E8
// 예제 출력 1
// 10 2 0 2
// 0 10 1 8
// 5 6 0 16
// 0 8 9 0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> textList = new ArrayList<>();
        textList.add(br.readLine());
        textList.add(br.readLine());
        textList.add(br.readLine());
        textList.add(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < textList.size(); j++) {
            int a = 0; // 소문자
            int b = 0; // 대문자
            int c = 0; // 숫자
            int d = 0; // 공백
            for (int i = 0; i < textList.get(j).length(); i++) {
                char s = textList.get(j).charAt(i);
                if (s == ' ') {
                    d += 1;
                } else if (s >= 'a' && s <= 'z') {
                    a += 1;
                } else if (s >= 'A' && s <= 'Z') {
                    b += 1;
                } else if (s >= '0' && s <= '9') {
                    c += 1;
                }
            }

            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append(" ");
        }

        System.out.println(sb);

    }
}
