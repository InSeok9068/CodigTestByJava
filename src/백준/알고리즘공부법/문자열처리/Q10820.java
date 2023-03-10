package 백준.알고리즘공부법.문자열처리;

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
