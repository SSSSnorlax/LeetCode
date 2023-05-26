package leetcode.editor.cn.jzoffer;

import java.util.*;

/**
 * @Author: Snorlax
 * @Date: 2022/12/14 08:48
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
