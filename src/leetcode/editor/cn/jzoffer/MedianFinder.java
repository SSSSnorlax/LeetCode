package leetcode.editor.cn.jzoffer;

import java.util.*;

/**
 * @Author: Snorlax
 * @Date: 2022/12/28 22:33
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class MedianFinder {
    Queue<Integer> A, B;
    public MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (A.size() == B.size()) {
            B.offer(num);
            A.offer(B.poll());
        } else {
            A.offer(num);
            B.offer(A.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}
