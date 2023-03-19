package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.Q15_06_Synchronized_Methods;

public class Foo {
    private final String name;

    public Foo(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void pause() {
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodA(String threadName) {
        System.out.println("thread " + threadName + " starting: " + name + ".methodA()");
        pause();
        System.out.println("thread " + threadName + " ending: " + name + ".methodA()");
    }

    public void methodB(String threadName) {
        System.out.println("thread " + threadName + " starting: " + name + ".methodB()");
        pause();
        System.out.println("thread " + threadName + " ending: " + name + ".methodB()");
    }
}
