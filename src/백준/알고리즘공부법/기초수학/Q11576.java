package 백준.알고리즘공부법.기초수학;

import java.util.Scanner;
import java.util.Stack;

// 진법 변환
public class Q11576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (arr[i] * Math.pow(a, i));
        }

        Stack<Integer> stack = new Stack<Integer>();
        while (result != 0) {
            stack.add(result % b);
            result = result / b;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb);
    }
}
