package leetcode.editor.cn.jzoffer;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: Snorlax
 * @Date: 2022/12/28 20:44
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == arr.length) {
            return arr;
        }
        Queue<Integer> min = new PriorityQueue<>();
        int[] res = new int[k];
        for (int n :
                arr) {
            min.offer(n);
        }
        for (int i = 0; i < k; i++) {
            res[i] = min.poll();
        }
        return res;
    }
}
