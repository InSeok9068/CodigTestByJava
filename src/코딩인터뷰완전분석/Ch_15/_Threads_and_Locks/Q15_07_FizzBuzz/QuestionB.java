package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.Q15_07_FizzBuzz;

public class QuestionB {

    public static void main(String[] args) {
        int n = 100;
        Thread[] threads = {new FizzBuzzThread(true, true, n, "FizzBuzz"),
                new FizzBuzzThread(true, false, n, "Fizz"),
                new FizzBuzzThread(false, true, n, "Buzz"),
                new NumberThread(false, false, n)};
        for (Thread thread : threads) {
            thread.start();
        }
    }

}
