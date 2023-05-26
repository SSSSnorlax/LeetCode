package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: Snorlax
 * @Date: 2022/12/29 09:57
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = recur(root.left);
        if(left == -1) {
            return -1;
        }
        int right = recur(root.right);
        if(right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
