package 코딩인터뷰완전분석.Ch_17._Hard.Q17_14_Smallest_K;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.AssortedMethods;

import java.util.Arrays;

public class QuestionA {

    public static int[] smallestK(int[] array, int k) {
        if (k <= 0 || k > array.length) {
            throw new IllegalArgumentException();
        }

        /* Sort array. */
        Arrays.sort(array);

        /* Copy first k elements. */
        int[] smallest = new int[k];
        System.arraycopy(array, 0, smallest, 0, k);
        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 9, 1, 11, 6, 13, 15};
        int[] smallest = smallestK(array, 3);
        System.out.println(AssortedMethods.arrayToString(smallest));
    }

}
