package 코딩인터뷰완전분석.Ch_10._Sorting_and_Searching.Q10_11_Peaks_and_Valleys;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.AssortedMethods;

import java.util.Arrays;

public class QuestionA {
    public static void sortValleyPeak(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i += 2) {
            swap(array, i - 1, i);
        }
    }

    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {48, 40, 31, 62, 28, 21, 64, 40, 23, 17};
        System.out.println(AssortedMethods.arrayToString(array));
        sortValleyPeak(array);
        System.out.println(AssortedMethods.arrayToString(array));
        System.out.println(Tester.confirmValleyPeak(array));
    }

}
