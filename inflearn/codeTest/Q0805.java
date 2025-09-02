package inflearn.codeTest;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q0805 {

    Node root;

    public void DFS(Node root) {

        System.out.print(root.data + " ");

        if (root.lt != null) {
            DFS(root.lt);
        }

        if (root.rt != null) {
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {

        Q0805 tree = new Q0805();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }
}
