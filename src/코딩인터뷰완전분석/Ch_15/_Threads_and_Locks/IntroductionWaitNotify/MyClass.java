package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.IntroductionWaitNotify;

public class MyClass extends Thread {
    private final String name;
    private final MyObject myObj;

    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    public void run() {
        try {
            myObj.wait(1000);
            myObj.foo(name);
            myObj.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
