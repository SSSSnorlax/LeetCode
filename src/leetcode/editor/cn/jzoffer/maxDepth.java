package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/29 08:37
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class maxDepth {
    int res = 0, depth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        recur(root);
        return res;
    }
    public void recur(TreeNode cur) {
        if (cur == null) {
            return;
        }
        ++depth;
        res = Math.max(res, depth);
        recur(cur.left);
        recur(cur.right);
        --depth;
    }
}
