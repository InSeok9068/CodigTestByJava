package 백준.알고리즘공부법.그리디;

import java.util.Scanner;

public class Q1783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 세로 크기
        int m = sc.nextInt(); // 가로 크기

        int count = 1; // 최소 이동 횟수를 저장할 변수

        if (n == 2) {
            count = Math.min(4, (m + 1) / 2); // 수직 이동을 두 번 이상 해야하는 경우
        } else if (n >= 3) {
            if (m <= 6) {
                count = Math.min(4, m); // 한 줄씩 이동하는 경우
            } else {
                count = m - 2; // 최대 이동 횟수
            }
        }

        System.out.println(count);
    }
}

//    입력값 n, m을 받습니다. n은 세로 크기, m은 가로 크기를 나타냅니다.
//    최소 이동 횟수를 저장할 변수 count를 1로 초기화합니다.
//    이동을 시작하는 위치가 (1,1)인 경우, 수평 이동만 가능하므로 count를 1로 설정합니다.
//    n이 2인 경우, 수직 이동을 두 번 이상 해야하는 경우가 있으므로 count 값을 계산합니다.
//    n이 3 이상인 경우, 가로 길이 m에 따라 count 값을 계산합니다.
//    계산된 count 값을 출력합니다.
