package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

import java.util.*;

/**
 * @Author: Snorlax
 * @Date: 2022/12/23 21:18
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judge(root.left, root.right);

    }

    public boolean judge(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return A == B;
        }
        return A.val == B.val && judge(A.left, B.right) && judge(A.right, B.left);
    }
}
