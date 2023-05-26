package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/23 08:48
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) &&
                (recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    public boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left) && recur(A.right, B.right);

    }
}
