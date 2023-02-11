package AlgorithmsLeetCode_1.BreadthFirstSearch;

import com.sun.source.tree.Tree;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}


public class MergeTwoBinaryTrees_617 {
    public static void main(String[] args) {
        MergeTwoBinaryTrees_617 sol = new MergeTwoBinaryTrees_617();
        sol.mergeTrees(new TreeNode(1, new TreeNode(2), new TreeNode(1)),
                       new TreeNode(1, new TreeNode(2), new TreeNode(1)));
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        TreeNode mergedTree = new TreeNode();
        merge(root1, root2, mergedTree);
        return mergedTree;
    }

    public void merge(TreeNode root1, TreeNode root2, TreeNode mergedTree){
        mergedTree.val = root1.val + root2.val;
        if (root1.left != null || root2.left != null){
            mergedTree.left = new TreeNode();
            if (root1.left != null && root2.left != null)
                merge(root1.left, root2.left, mergedTree.left);
            else if (root1.left != null && root2.left == null){
                merge(root1.left, new TreeNode(0), mergedTree.left);
            } else
                merge(new TreeNode(0), root2.left, mergedTree.left);
        }
        if (root1.right != null || root2.right != null){
            mergedTree.right = new TreeNode();
            if (root1.right != null && root2.right != null)
                merge(root1.right, root2.right, mergedTree.right);
            else if (root1.right != null && root2.right == null){
                merge(root1.right, new TreeNode(0), mergedTree.right);
            } else
                merge(new TreeNode(0), root2.right, mergedTree.right);
        }
    }
}
