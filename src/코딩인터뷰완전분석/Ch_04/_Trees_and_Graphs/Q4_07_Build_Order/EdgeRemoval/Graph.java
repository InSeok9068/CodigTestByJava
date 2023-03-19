package 코딩인터뷰완전분석.Ch_04._Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private final ArrayList<Project> nodes = new ArrayList<Project>();
    private final HashMap<String, Project> map = new HashMap<String, Project>();

    public Project getOrCreateNode(String name) {
        if (!map.containsKey(name)) {
            Project node = new Project(name);
            nodes.add(node);
            map.put(name, node);
        }

        return map.get(name);
    }

    public void addEdge(String startName, String endName) {
        Project start = getOrCreateNode(startName);
        Project end = getOrCreateNode(endName);
        start.addNeighbor(end);
    }

    public ArrayList<Project> getNodes() {
        return nodes;
    }
}
