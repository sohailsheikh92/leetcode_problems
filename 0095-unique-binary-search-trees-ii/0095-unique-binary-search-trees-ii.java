import java.util.*;

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

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateTrees(1, n);
    }
    
    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        
        // Base case: if start > end, add null (empty subtree)
        if (start > end) {
            result.add(null);
            return result;
        }
        
        // For each value i as the root
        for (int i = start; i <= end; i++) {
            // Generate all possible left subtrees
            List<TreeNode> leftTrees = generateTrees(start, i - 1);
            // Generate all possible right subtrees
            List<TreeNode> rightTrees = generateTrees(i + 1, end);
            
            // Combine each left and right subtree with root i
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}