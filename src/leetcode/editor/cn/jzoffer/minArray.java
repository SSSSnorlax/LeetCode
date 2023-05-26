package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/16 17:14
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class minArray {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
