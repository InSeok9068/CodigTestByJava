package 코딩인터뷰완전분석.Ch_05._Bit_Manipulation.Q5_07_Pairwise_Swap;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.AssortedMethods;

public class Question {

    public static int swapOddEvenBits(int x) {
        return (((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1));
    }

    public static void main(String[] args) {
        int a = 234321;
        System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
        int b = swapOddEvenBits(a);
        System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
    }

}
