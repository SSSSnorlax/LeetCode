package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 10:59
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(Integer.MIN_VALUE);
        ListNode cur = ans;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return ans.next;
    }
}
