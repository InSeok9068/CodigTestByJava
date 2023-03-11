package 백준.알고리즘공부법.기초수학;

import java.util.Scanner;

public class Q10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   // A 입력 받기
        int B = sc.nextInt();   // B 입력 받기
        int C = sc.nextInt();   // C 입력 받기

        // 각각의 연산 결과 출력
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
