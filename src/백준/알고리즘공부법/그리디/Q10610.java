package 백준.알고리즘공부법.그리디;

//문제
//어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.
//
//미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.
//
//입력
//N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.
//
//출력
//미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.
//
//예제 입력 1
//30
//예제 출력 1
//30
//예제 입력 2
//102
//예제 출력 2
//210
//예제 입력 3
//2931
//예제 출력 3
//-1
//예제 입력 4
//80875542
//예제 출력 4
//88755420

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
