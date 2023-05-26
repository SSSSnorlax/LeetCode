package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/24 23:20
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class maxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }
        for(int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i][j -1], grid[i -1][j]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
