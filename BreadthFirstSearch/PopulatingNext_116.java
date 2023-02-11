package AlgorithmsLeetCode_1.BreadthFirstSearch;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulatingNext_116 {
    public Node connect(Node root) {
        if (root == null)
            return null;
        if (root.left != null)
            nextNode(root.left, root.right);
        return root;
    }

    public void nextNode(Node node, Node next){
        node.next = next;
        if (node.left != null) nextNode(node.left, node.right);
        if (node.right != null) nextNode(node.right, next.left);
    }
}
