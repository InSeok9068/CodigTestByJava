package 코딩인터뷰완전분석.Ch_16._Moderate.Q16_24_Pairs_With_Sum;

public class Pair {
    public int first;
    public int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
