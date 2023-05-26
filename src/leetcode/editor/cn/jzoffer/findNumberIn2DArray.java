package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/16 13:51
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class findNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) {
                i--;
            } else if(matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
