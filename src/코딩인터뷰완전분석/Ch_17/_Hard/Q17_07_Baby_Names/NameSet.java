package 코딩인터뷰완전분석.Ch_17._Hard.Q17_07_Baby_Names;

import java.util.HashSet;
import java.util.Set;

public class NameSet {
    private final Set<String> names = new HashSet<String>();
    private final String rootName;
    private int frequency = 0;

    public NameSet(String name, int freq) {
        names.add(name);
        frequency = freq;
        rootName = name;
    }

    public Set<String> getNames() {
        return names;
    }

    public String getRootName() {
        return rootName;
    }

    public void copyNamesWithFrequency(Set<String> more, int freq) {
        names.addAll(more);
        frequency += freq;
    }

    public int getFrequency() {
        return frequency;
    }

    public int size() {
        return names.size();
    }
}
