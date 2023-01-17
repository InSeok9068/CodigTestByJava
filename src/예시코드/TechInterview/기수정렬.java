package 예시코드.TechInterview;

// https://gyoogle.dev/blog/algorithm/Radix%20Sort.html

public class 기수정렬 {
}

class Radixsort {
//    void countSort(int arr[], int n, int exp) {
//        int buffer[ n];
//        int i, count[ 10] ={
//            0
//        } ;
//
//        // exp의 자릿수에 해당하는 count 증가
//        for (i = 0; i < n; i++) {
//            count[(arr[i] / exp) % 10]++;
//        }
//        // 누적합 구하기
//        for (i = 1; i < 10; i++) {
//            count[i] += count[i - 1];
//        }
//        // 일반적인 Counting sort 과정
//        for (i = n - 1; i >= 0; i--) {
//            buffer[count[(arr[i] / exp) % 10] - 1] = arr[i];
//            count[(arr[i] / exp) % 10]--;
//        }
//        for (i = 0; i < n; i++) {
//            arr[i] = buffer[i];
//        }
//    }
//
//    void radixsort(int arr[], int n) {
//        // 최댓값 자리만큼 돌기
////        int m = getMax(arr, n);
//
//        // 최댓값을 나눴을 때, 0이 나오면 모든 숫자가 exp의 아래
//        for (int exp = 1; m / exp > 0; exp *= 10) {
//            countSort(arr, n, exp);
//        }
//    }
//
//    int main() {
//        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
//        int n = sizeof(arr) / sizeof(arr[0]);            // 좋은 습관
//        radixsort(arr, n);
//
//        for (int i = 0; i < n; i++) {
//            cout << arr[i] << " ";
//        }
//        return 0;
//    }
}