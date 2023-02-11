package AlgorithmsLeetCode_1.BreadthFirstSearch;

import java.util.Objects;

public class FindACorrespondingNode_1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null)
            return null;
        return nextNode1(original, target);
    }

    public TreeNode nextNode1(TreeNode node, TreeNode target){
        if(Objects.equals(node, target)) return node;
        if (node.left != null) nextNode1(node.left, target);
        if (node.right != null) nextNode1(node.right, target);
        return node;
    }
}
