package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.IntroductionSynchronization;

public class MyClass extends Thread {
    private final String name;
    private final MyObject myObj;

    public MyClass(MyObject obj, String n) {
        name = n;
        myObj = obj;
    }

    public void run() {
        if (name.equals("1")) {
            MyObject.foo(name);
        } else if (name.equals("2")) {
            MyObject.bar(name);
        }
    }
}
