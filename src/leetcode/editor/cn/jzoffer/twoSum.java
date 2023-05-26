package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 16:26
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int p = 0, q = nums.length - 1;
        while (p < q) {
            while (p < q && nums[p] + nums[q] < target) {
                p++;
            }
            if (nums[p] + nums[q] == target) {
                return new int[]{nums[p], nums[q]};
            }
            q--;
        }
        return new int[0];
    }
}
