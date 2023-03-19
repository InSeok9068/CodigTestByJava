package 코딩인터뷰완전분석.Ch_09._Scalability_and_Memory_Limits.Q9_05_Cache;

public class Node {
    public Node prev;
    public Node next;
    public String[] results;
    public String query;

    public Node(String q, String[] res) {
        results = res;
        query = q;
    }
}
