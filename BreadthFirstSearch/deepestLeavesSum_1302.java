package AlgorithmsLeetCode_1.BreadthFirstSearch;

public class deepestLeavesSum_1302 {
    int sum = 0;
    int deep = 0;

    public int deepestLeavesSum(TreeNode root) {
        deep = depth(root);
        sumOfDeepest(root, 1);
        return sum;
    }

    public int depth(TreeNode root){
        if (root == null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }

    public void sumOfDeepest(TreeNode root, int cur){
        if (root != null){
            if(cur == deep) sum += root.val;
            sumOfDeepest(root.left, cur+1);
            sumOfDeepest(root.right, cur+1);
        }
    }
}
