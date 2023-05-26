package leetcode.editor.cn.datastructure;

/**
 * @Author: Snorlax
 * @Date: 2022/12/23 12:03
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
