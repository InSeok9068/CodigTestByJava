package 코딩인터뷰완전분석.Introduction.Big_O;

public class Ex_01 {
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int s = sum(4);
        System.out.println(s);
    }
}
