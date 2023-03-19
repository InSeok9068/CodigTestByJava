package 코딩인터뷰완전분석.Ch_16._Moderate.Q16_15_Master_Mind;

public class Result {
    public int hits;
    public int pseudoHits;

    public Result(int h, int p) {
        hits = h;
        pseudoHits = p;
    }

    @Override
    public String toString() {
        return "Result [hits=" + hits + ", pseudoHits=" + pseudoHits + "]";
    }
}
