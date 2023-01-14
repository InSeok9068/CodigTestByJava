package 예시코드;

public class 이진트리 {
    public static void main(String[] args) {

    }
}

class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (value < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.println(localRoot.data);
            inOrder(localRoot.right);
        }
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.data);
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.println(localRoot.data);
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current.data != key) {
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}