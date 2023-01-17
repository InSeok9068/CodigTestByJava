package 예시코드.TechInterview;

// https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html

import java.util.Arrays;

public class 삽입정렬 {
}

class InsertionSort {
    void insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) { // 1.
            int temp = arr[index];
            int prev = index - 1;
            while ((prev >= 0) && (arr[prev] > temp)) {    // 2.
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;                           // 3.
        }
        System.out.println(Arrays.toString(arr));
    }
}