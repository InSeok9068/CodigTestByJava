package 코딩인터뷰완전분석.Ch_04._Trees_and_Graphs.Q4_02_Minimal_Tree;


import 코딩인터뷰완전분석.CtCILibrary.CtCILibrary.TreeNode;

public class Question {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // We needed this code for other files, so check out the code in the library
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("Root? " + root.data);
        System.out.println("Created BST? " + root.isBST());
        System.out.println("Height: " + root.height());
    }

}
