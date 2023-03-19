package 코딩인터뷰완전분석.Ch_13._Java.Introduction;

public class Square extends Shape {
    private final double len = 5;

    public void printMe() {
        System.out.println("I am a square.");
    }

    public double computeArea() {
        return len * len;
    }
}
