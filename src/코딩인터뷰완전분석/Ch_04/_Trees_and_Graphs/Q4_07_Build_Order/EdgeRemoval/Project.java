package 코딩인터뷰완전분석.Ch_04._Trees_and_Graphs.Q4_07_Build_Order.EdgeRemoval;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
    private final ArrayList<Project> children = new ArrayList<Project>();
    private final HashMap<String, Project> map = new HashMap<String, Project>();
    private final String name;
    private int dependencies = 0;

    public Project(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void addNeighbor(Project node) {
        if (!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(), node);
            node.incrementDependencies();
        }
    }

    public void incrementDependencies() {
        dependencies++;
    }

    public ArrayList<Project> getChildren() {
        return children;
    }

    public void decrementDependencies() {
        dependencies--;
    }

    public int getNumberDependencies() {
        return dependencies;
    }
}
