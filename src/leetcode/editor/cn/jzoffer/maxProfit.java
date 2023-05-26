package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/24 21:14
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class maxProfit {
    public static int maxProfit(int[] prices) {
        int ans = 0,profit = 0;
        if (prices == null || prices.length < 2) {
            return ans;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] <= prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
                ans = Math.max(ans, profit);
            } else {
                ans = Math.max(ans, profit);
                profit += prices[i + 1] - prices[i];
                if (profit < 0) {
                    profit = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2}));
    }
}
