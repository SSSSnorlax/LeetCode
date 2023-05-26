package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 16:02
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class exchange {
    public int[] exchange(int[] nums) {
        int p = 0, q = nums.length - 1, temp;
        while (p < q) {
            while (p < q && (nums[p] & 1) == 1) {
                p++;
            }
            while (p < q && (nums[q] & 1) == 0) {
                q--;
            }
            temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
        return nums;
    }
}
