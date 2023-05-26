package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/24 12:59
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class numWays {
    private static final int MOD = 1000000007;

    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % MOD;
            a = b;
            b = sum;
        }
        return a;
    }
}
