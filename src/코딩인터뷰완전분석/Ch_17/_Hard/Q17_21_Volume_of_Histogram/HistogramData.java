package 코딩인터뷰완전분석.Ch_17._Hard.Q17_21_Volume_of_Histogram;

public class HistogramData {

    private final int height;
    private int leftMaxIndex = -1;
    private int rightMaxIndex = -1;

    public HistogramData(int v) {
        height = v;
    }

    public int getHeight() {
        return height;
    }

    public int getLeftMaxIndex() {
        return leftMaxIndex;
    }

    public void setLeftMaxIndex(int idx) {
        leftMaxIndex = idx;
    }

    public int getRightMaxIndex() {
        return rightMaxIndex;
    }

    public void setRightMaxIndex(int idx) {
        rightMaxIndex = idx;
    }

}
