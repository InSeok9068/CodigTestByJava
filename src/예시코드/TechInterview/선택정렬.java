package 예시코드.TechInterview;

import java.util.Arrays;

// https://gyoogle.dev/blog/algorithm/Selection%20Sort.html

public class 선택정렬 {
}

class SelectionSort {
    void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length - 1; i++) {        // 1.
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {  // 2.
                if (arr[j] < arr[indexMin]) {           // 3.
                    indexMin = j;
                }
            }
            // 4. swap(arr[indexMin], arr[i])
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
