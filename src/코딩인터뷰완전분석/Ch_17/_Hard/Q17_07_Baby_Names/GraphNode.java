package 코딩인터뷰완전분석.Ch_17._Hard.Q17_07_Baby_Names;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphNode {
    private final ArrayList<GraphNode> neighbors;
    private final HashMap<String, GraphNode> map;
    private final String name;
    private final int frequency;
    private boolean visited = false;

    public GraphNode(String nm, int freq) {
        name = nm;
        frequency = freq;
        neighbors = new ArrayList<GraphNode>();
        map = new HashMap<String, GraphNode>();
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public boolean addNeighbor(GraphNode node) {
        if (map.containsKey(node.getName())) {
            return false;
        }
        neighbors.add(node);
        map.put(node.getName(), node);
        return true;
    }

    public ArrayList<GraphNode> getNeighbors() {
        return neighbors;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setIsVisited(boolean v) {
        visited = v;
    }
}
