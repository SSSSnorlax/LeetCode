package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Snorlax
 * @Date: 2022/12/27 09:58
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class pathSum {
    LinkedList<List<Integer>> ans = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return ans;
    }

    public void recur(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            ans.add(new LinkedList<>(path));
        }
        recur(root.left, target);
        recur(root.right, target);
        path.removeLast();
    }
}
