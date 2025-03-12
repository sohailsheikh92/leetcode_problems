import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int lastValue = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                lastValue = node.val; // Store the last node value at this level

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(lastValue);
        }
        return result;
    }
}
