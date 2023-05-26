package leetcode.editor.cn.jzoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Snorlax
 * @Date: 2022/12/14 09:53
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class missingNumber {

    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
