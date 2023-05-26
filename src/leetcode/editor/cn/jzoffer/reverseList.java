package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Snorlax
 * @Date: 2022/12/12 11:25
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
