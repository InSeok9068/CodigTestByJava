import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
//
//    StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 불러오기 및 " " 공백기준 문자열 자르기
//
//    int N = Integer.parseInt(st.nextToken()); // 공백기준 문자열 불러오기
//    
//    StringBuilder sb = new StringBuilder(); // 문자열 출력
//        list1.forEach(integer -> {
//        sb.append(integer).append(" ");
//    });

//    스택 : LIFO (늦게 들어간 데이터가 먼저 나옴) 예시) 브라우저의 뒤로가기
//    큐 : FIFO (먼저 들어간 데이터가 먼저 나옴) 예시) 순서대로 주문 받기

    public static void main(String[] args) {
//        int[][] arr = {{1, 0, 0, 0},
//                {0, 0, 0, 1},
//                {0, 0, 1, 0},
//                {0, 1, 1, 0}};

//        int[][] office = {{1, 0, 0},
//                {0, 0, 1},
//                {1, 0, 0}};
//
//        int k = 2;
//        int max = 0;
//        for (int i = 0; i < office.length - k + 1; i++) {
//            for (int j = 0; j < office[i].length - k + 1; j++) {
//                int cnt = 0;
//                for (int n = i; n < i + k; n++) {
//                    for (int m = j; m < j + k; m++) {
//                        if (office[n][m] == 1) {
//                            cnt++;
//                        }
//                    }
//                }
//                if (cnt > max) {
//                    max = cnt;
//                }
//            }
//        }
//
//        return max;
//
//        System.out.println(max);

//        int[] arr1 = {1, 3, 9, 27, 81, 243};
//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            arrList.add(arr1[i]);
//            for (int j = i + 1; j < arr1.length; j++) {
//                arrList.add(arr1[i] + arr1[j]);
//            }
//        }
//
//        System.out.println(arrList);

//        long n = 4;
//
//        Integer[] arr1 = new Integer[(int) n];
//        arr1[0] = 1;
//
//        for (int i = 1; i < n; i++) {
//            arr1[i] = arr1[i - 1] * 3;
//        }
//
//        List<Integer> sumList = new ArrayList<>();
//        List<Integer> newSumList = new ArrayList<>();
//
//        for (int i = 1; i < arr1.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                sumList.add(arr1[i] + arr1[j]);
//                if (sumList.size() > 1) {
//                    for (int k = sumList.size() - 1; k >= 0; k--) {
//                        newSumList.add(arr1[i] + sumList.get(k));
//                    }
//                }
//            }
//        }
//
//        HashSet<Integer> hs = new HashSet<>();
//        hs.addAll(Arrays.asList(arr1));
//        hs.addAll(sumList);
//        hs.addAll(newSumList);
//
//        Integer[] result = hs.stream().sorted().toArray(Integer[]::new);

//        int[] arr1 = {1, 3, 9, 27, 81, 243};
//        int[] arr2 = new int[arr1.length * 2 - 1];
//
//        int sum = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//            sum += arr1[i];
//            arr2[arr1.length + i] = sum;
//        }
//
//        System.out.println(Arrays.toString(arr2));

        long n = 11;
        Long[] arr1 = new Long[(int) n];
        arr1[0] = 1L;

        for (int i = 1; i < n; i++) {
            arr1[i] = arr1[i - 1] * 3;
        }

        List<Long> sumList = new ArrayList<>();
        List<Long> newSumList = new ArrayList<>();

        for (int i = 1; i < arr1.length; i++) {
            int size = sumList.size();
            for (int j = i - 1; j >= 0; j--) {
                sumList.add(arr1[i] + arr1[j]);
                if (size > 0) {
                    for (int k = 0; k < size; k++) {
                        newSumList.add(arr1[i] + sumList.get(k));
                    }
                }
            }
        }

        HashSet<Long> hs = new HashSet<>();
        hs.addAll(Arrays.asList(arr1));
        hs.addAll(sumList);
        hs.addAll(newSumList);

        Long[] result = hs.stream().sorted().toArray(Long[]::new);

        System.out.println(Arrays.toString(result));

        System.out.println(result[(int) n - 1]);

        int sum = 0; //총 악수 수

        for(int i=1; i<=n; i++){
            sum += i;
        }

        sum -= (int)Math.ceil(n/2.0);
    }
}