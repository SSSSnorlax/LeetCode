package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/27 15:06
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class treeToDoublyList {
    TreeNode pre, head;
    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) {
            return null;
        }
        recur(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void recur(TreeNode cur) {
        if (cur == null) {
            return;
        }
        recur(cur.left);
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        recur(cur.right);
    }
}
