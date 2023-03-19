package 코딩인터뷰완전분석.Ch_17._Hard.Q17_17_Multi_Search;

import java.util.ArrayList;

public class Trie {
    private final TrieNode root = new TrieNode();

    public ArrayList<Integer> search(String s) {
        return root.search(s);
    }

    public void insertString(String str, int location) {
        root.insertString(str, location);
    }

    public TrieNode getRoot() {
        return root;
    }
}
