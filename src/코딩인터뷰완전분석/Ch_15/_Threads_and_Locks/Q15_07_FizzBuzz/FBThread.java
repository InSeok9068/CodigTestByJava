package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.Q15_07_FizzBuzz;

import java.util.function.Function;
import java.util.function.Predicate;

public class FBThread extends Thread {
    private static final Object lock = new Object();
    protected static int current = 1;
    private final int max;
    private final Predicate<Integer> validate;
    private final Function<Integer, String> printer;
    int x = 1;

    public FBThread(Predicate<Integer> validate, Function<Integer, String> printer, int max) {
        this.validate = validate;
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                if (current > max) {
                    return;
                }
                if (validate.test(current)) {
                    System.out.println(printer.apply(current));
                    current++;
                }
            }
        }
    }
}
