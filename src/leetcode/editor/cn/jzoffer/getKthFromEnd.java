package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

import java.util.Stack;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 09:13
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        getKthFromEnd t = new getKthFromEnd();
        System.out.println(t.getKthFromEnd(head, 2).val);
    }
}
