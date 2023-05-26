package leetcode.editor.cn.jzoffer;

import java.util.LinkedList;

/**
 * @Author: Snorlax
 * @Date: 2022/12/11 21:39
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class MinStack {
    /** initialize your data structure here. */
    LinkedList<Integer> xStack;
    LinkedList<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
