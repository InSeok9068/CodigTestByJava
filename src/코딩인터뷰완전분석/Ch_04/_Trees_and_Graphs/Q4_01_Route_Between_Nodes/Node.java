package 코딩인터뷰완전분석.Ch_04._Trees_and_Graphs.Q4_01_Route_Between_Nodes;

class Node {
    private final Node[] adjacent;
    private final String vertex;
    public int adjacentCount;
    public Question.State state;

    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
