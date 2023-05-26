package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Snorlax
 * @Date: 2022/12/28 11:12
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class kthLargest {
    ArrayList<Integer> res = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        recur(root);
        return res.get(res.size() - k);
    }

    public void recur(TreeNode cur) {
        if (cur == null) {
            return;
        }
        recur(cur.left);
        res.add(cur.val);
        recur(cur.right);
    }
}
