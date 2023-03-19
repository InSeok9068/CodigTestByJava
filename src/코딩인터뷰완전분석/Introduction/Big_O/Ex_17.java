package 코딩인터뷰완전분석.Introduction.Big_O;

public class Ex_17 {
    public static int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }
}
