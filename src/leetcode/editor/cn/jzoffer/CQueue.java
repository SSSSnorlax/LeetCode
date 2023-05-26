package leetcode.editor.cn.jzoffer;

import java.util.LinkedList;

/**
 * @Author: Snorlax
 * @Date: 2022/12/11 17:16
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class CQueue {
    public LinkedList<Integer> inStack;
    public LinkedList<Integer> outStack;
    public CQueue() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if(!outStack.isEmpty()) {
            return outStack.pop();
        }
        if(inStack.isEmpty()) {
            return -1;
        }
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        return outStack.pop();
    }
}
