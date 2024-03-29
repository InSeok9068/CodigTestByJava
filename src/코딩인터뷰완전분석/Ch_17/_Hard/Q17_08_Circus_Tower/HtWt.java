package 코딩인터뷰완전분석.Ch_17._Hard.Q17_08_Circus_Tower;

public class HtWt implements Comparable<HtWt> {
    private final int height;
    private final int weight;

    public HtWt(int h, int w) {
        height = h;
        weight = w;
    }

    public int compareTo(HtWt second) {
        if (this.height != second.height) {
            return ((Integer) this.height).compareTo(second.height);
        } else {
            return ((Integer) this.weight).compareTo(second.weight);
        }
    }

    public String toString() {
        return "(" + height + ", " + weight + ")";
    }

    /* Returns true if "this" should be lined up before "other". Note
     * that it's possible that this.isBefore(other) and
     * other.isBefore(this) are both false. This is different from the
     * compareTo method, where if a < b then b > a. */
    public boolean isBefore(HtWt other) {
        return height < other.height && weight < other.weight;
    }
}
