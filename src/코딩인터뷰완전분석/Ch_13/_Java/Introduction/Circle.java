package 코딩인터뷰완전분석.Ch_13._Java.Introduction;

public class Circle extends Shape {
    private final double rad = 5;

    public void printMe() {
        System.out.println("I am a circle.");
    }

    public double computeArea() {
        return rad * rad * 3.15;
    }
}
