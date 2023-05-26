package leetcode.editor.cn.jzoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Snorlax
 * @Date: 2022/12/28 16:34
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class isStraight {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }

    public static void main(String[] args) {
        isStraight t = new isStraight();
        t.isStraight(new int[]{0,0,1,2,5});
    }
}
