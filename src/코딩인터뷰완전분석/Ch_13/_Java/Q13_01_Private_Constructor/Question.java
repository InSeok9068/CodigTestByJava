package 코딩인터뷰완전분석.Ch_13._Java.Q13_01_Private_Constructor;

public class Question {
    private Question() {
        System.out.println("Q");
    }

    public static void main(String[] args) {
        new B();
    }

    static class A {
        private A() {
        }
    }

    static class B extends A {
        public B() {
        }
    }

}
