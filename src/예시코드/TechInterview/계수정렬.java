package 예시코드.TechInterview;

// https://gyoogle.dev/blog/algorithm/Counting%20Sort.html

public class 계수정렬 {
    public static void main(String[] args) {
//        int arr[ 5];        // [5, 4, 3, 2, 1]
//        int sorted_arr[ 5];
//        // 과정 1 - counting 배열의 사이즈를 최대값 5가 담기도록 크게 잡기
//        int counting[ 6];    // 단점 : counting 배열의 사이즈의 범위를 가능한 값의 범위만큼 크게 잡아야 하므로, 비효율적이 됨.
//
//        // 과정 2 - counting 배열의 값을 증가해주기.
//        for (int i = 0; i < arr.length; i++) {
//            counting[arr[i]]++;
//        }
//        // 과정 3 - counting 배열을 누적합으로 만들어주기.
//        for (int i = 1; i < counting.length; i++) {
//            counting[i] += counting[i - 1];
//        }
//        // 과정 4 - 뒤에서부터 배열을 돌면서, 해당하는 값의 인덱스에 값을 넣어주기.
//        for (int i = arr.length - 1; i >= 0; i--) {
//            counting[arr[i]]--;
//            sorted_arr[counting[arr[i]]] = arr[i];
//        }
    }
}

class CountingSort {

}