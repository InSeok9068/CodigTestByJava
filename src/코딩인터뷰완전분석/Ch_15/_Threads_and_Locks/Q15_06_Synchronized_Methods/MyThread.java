package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.Q15_06_Synchronized_Methods;

public class MyThread extends Thread {
    private final Foo foo;
    public String name;
    public String firstMethod;

    public MyThread(Foo f, String nm, String fM) {
        foo = f;
        name = nm;
        firstMethod = fM;
    }

    public void run() {
        if (firstMethod.equals("A")) {
            foo.methodA(name);
        } else {
            foo.methodB(name);
        }
    }
}
