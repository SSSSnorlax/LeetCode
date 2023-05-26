package leetcode.editor.cn.jzoffer.commons;

/**
 * @Author: Snorlax
 * @Date: 2022/12/22 19:17
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

