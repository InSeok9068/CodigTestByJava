package 코딩인터뷰완전분석.Ch_13._Java.Introduction;

public abstract class Shape {
    public void printMe() {
        System.out.println("I am a shape.");
    }

    public abstract double computeArea();
}
