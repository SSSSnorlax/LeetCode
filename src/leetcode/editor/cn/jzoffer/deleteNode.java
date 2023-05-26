package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/25 21:17
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        head = pre;
        ListNode cur = pre.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head.next;
    }
}
