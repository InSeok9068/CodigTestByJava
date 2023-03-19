package 코딩인터뷰완전분석.Ch_13._Java.Q13_06_Object_Reflection;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
}
