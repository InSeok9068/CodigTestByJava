package 백준.집합과맵;

// 문제
// 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
//
// 입력
// 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
//
// 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
//
// 출력
// 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
//
// 예제 입력 1
// 5
// 6 3 2 10 -10
// 8
// 10 9 -5 2 3 4 5 -10
// 예제 출력 1
// 1 0 0 1 1 0 0 1

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드 {
    // 내가 한거
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        // list 계열 중 하나를 쓰면 된다.
//        ArrayList<Float> list1 = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            list1.add(Float.parseFloat(br.readLine()));
//        }
//
//        int Z = Integer.parseInt(br.readLine());
//
//        // list 계열 중 하나를 쓰면 된다.
//        ArrayList<Float> list2 = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            list2.add(Float.parseFloat(br.readLine()));
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (float number : list2) {
//            if (list1.contains(number)) {
//                sb.append("1").append(" ");
//            } else {
//                sb.append("0").append(" ");
//            }
//        }
//
//        System.out.println(sb);
//    }

    // 정답
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards); // 이분탐색할 배열은 정렬되어 있어야 함.
        int M = Integer.parseInt(br.readLine()); // 구별할 수의 개수

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, N, temp) + " ");
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }

            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }

        return 0;
    }
}
