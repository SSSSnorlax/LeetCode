package leetcode.editor.cn.jzoffer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: Snorlax
 * @Date: 2022/12/28 14:24
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class minNumber {
    public String minNumber(int[] nums) {
        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //字典序列小的放在堆顶
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        for (int num : nums) {
            queue.add("" + num);
        }
        StringBuilder res = new StringBuilder();
        while (! queue.isEmpty()){
            res.append(queue.poll());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        minNumber t = new minNumber();
        System.out.println(t.minNumber(new int[]{10,2,3,33,34,7,91,88,100,0}));
    }
}
