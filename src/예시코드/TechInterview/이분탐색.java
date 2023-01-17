package 예시코드.TechInterview;

import java.util.Arrays;
import java.util.NoSuchElementException;

// https://gyoogle.dev/blog/algorithm/Binary%20Search.html

public class 이분탐색 {
}

class BinarySearch {
    int solution(int[] arr, int M) { // arr 배열에서 M을 찾자

        Arrays.sort(arr); // 정렬

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (M == arr[mid]) {
                return mid;
            } else if (arr[mid] < M) {
                start = mid + 1;
            } else if (M < arr[mid]) {
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("타겟 존재하지 않음");
    }
}