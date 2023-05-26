package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.ListNode;

import java.util.Stack;

/**
 * @Author: Snorlax
 * @Date: 2022/12/12 10:45
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
}
