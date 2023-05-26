package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 14:43
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class getIntersectionNode {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
