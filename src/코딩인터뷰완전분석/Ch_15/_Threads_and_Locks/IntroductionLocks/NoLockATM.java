package 코딩인터뷰완전분석.Ch_15._Threads_and_Locks.IntroductionLocks;

public class NoLockATM {
    private int balance = 100;

    public NoLockATM() {
    }

    public int withdraw(int value) {
        int temp = balance;
        try {
            Thread.sleep(300);
            temp = temp - value;
            Thread.sleep(300);
            balance = temp;
        } catch (InterruptedException e) {
        }
        return temp;
    }

    public int deposit(int value) {
        int temp = balance;
        try {
            Thread.sleep(300);
            temp = temp + value;
            Thread.sleep(300);
            balance = temp;
        } catch (InterruptedException e) {
        }
        return temp;
    }

    public int getBalance() {
        return balance;
    }
}
