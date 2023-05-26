package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/29 21:05
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if ((p.val - root.val) * (q.val - root.val) <= 0) {
                return root;
            } else {
                root = p.val > root.val ? root.right : root.left;
            }
        }
        return root;
    }
}
