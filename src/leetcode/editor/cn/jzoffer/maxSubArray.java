package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/24 21:56
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = Math.max(nums[i], 0);
            }
        }
        return ans;
    }
}
