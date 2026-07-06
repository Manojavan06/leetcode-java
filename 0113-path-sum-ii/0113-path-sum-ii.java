/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        dfs(root, targetSum, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode node, int sum, List<Integer> path) {

        if (node == null)
            return;

        path.add(node.val);

        if (node.left == null &&
            node.right == null &&
            sum == node.val) {

            result.add(new ArrayList<>(path));
        } else {

            dfs(node.left, sum - node.val, path);
            dfs(node.right, sum - node.val, path);
        }

        path.remove(path.size() - 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna