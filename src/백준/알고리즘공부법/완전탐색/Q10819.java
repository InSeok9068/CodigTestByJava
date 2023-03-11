package 백준.알고리즘공부법.완전탐색;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10819 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt(); // 숫자의 개수
        int[] arr = new int[n]; // 숫자들을 저장할 배열

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // 숫자 입력 받기
        }

        int maxDiffSum = 0; // 최대 인접한 두 수의 차이의 합을 저장할 변수

        // 숫자 배열의 모든 순열을 생성하고, 각 순열에 대해 인접한 두 수의 차이의 합을 계산
        ArrayList<int[]> permList = permutation(arr); // 배열의 모든 순열을 생성하는 함수 호출
        for (int[] perm : permList) { // 생성된 순열들을 하나씩 꺼내어 계산
            int diffSum = 0; // 각 순열에 대해 인접한 두 수의 차이의 합을 저장할 변수
            for (int i = 0; i < n - 1; i++) {
                diffSum += Math.abs(perm[i] - perm[i + 1]); // 인접한 두 수의 차이의 합을 계산하여 diffSum에 더하기
            }
            maxDiffSum = Math.max(maxDiffSum, diffSum); // 계산된 diffSum과 현재까지의 최대값을 비교하여 최대값 갱신
        }

        System.out.println(maxDiffSum); // 최대 인접한 두 수의 차이의 합 출력
    }

    // 배열의 모든 순열을 생성하는 함수
    public static ArrayList<int[]> permutation(int[] arr) {
        ArrayList<int[]> permList = new ArrayList<>(); // 배열의 모든 순열을 저장할 ArrayList
        boolean[] visited = new boolean[arr.length]; // 각 숫자가 이미 선택되었는지 여부를 저장하는 배열
        int[] perm = new int[arr.length]; // 순열을 저장할 배열
        permute(arr, permList, visited, perm, 0); // 재귀 함수 호출
        return permList; // 생성된 순열들을 담은 ArrayList 반환
    }

    public static void permute(int[] arr, ArrayList<int[]> permList, boolean[] visited, int[] perm, int depth) {
        if (depth == arr.length) { // 순열 생성이 완료되면
            permList.add(perm.clone()); // 순열을 ArrayList에 추가
            return; // 함수 종료
        }

        for (int i = 0; i < arr.length; i++) { // 각 숫자를 선택하는 과정
            if (!visited[i]) { // 아직 선택되지 않은 숫자일 경우
                visited[i] = true; // 해당 숫자를 선택으로 변경
                perm[depth] = arr[i]; // 선택한 숫자를 순열에 추가
                permute(arr, permList, visited, perm, depth + 1); // 재귀 함수 호출
                visited[i] = false; // 선택한 숫자
            }
        }
    }
}
