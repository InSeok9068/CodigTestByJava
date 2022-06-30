package 순열_조합;

import java.util.Arrays;

// https://rutgo-letsgo.tistory.com/221
// swap 방식
public class 순열알고리즘 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        perm(arr, 0, arr.length, arr.length);
    }

    public static void perm(int[] arr, int depth, int n, int r) {
        if (depth == r) { // 한번의 depth가 k로 도달하면 사이클을 한번 돈거다.)
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, r);
            swap(arr, i, depth);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
