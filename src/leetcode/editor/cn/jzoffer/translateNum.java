package leetcode.editor.cn.jzoffer;

import com.sun.deploy.util.StringUtils;

/**
 * @Author: Snorlax
 * @Date: 2022/12/25 12:48
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class translateNum {
    public int translateNum(int num) {
        String nums = Integer.toString(num);
        int a = 1, b = 1;
        for (int i = 1; i < nums.length(); i++) {
            String temp = nums.substring(i - 1, i + 1);
            int c = temp.compareTo("25") <= 0 && temp.compareTo("10") >= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }

    public static void main(String[] args) {
        translateNum t = new translateNum();
        System.out.println(t.translateNum(624));
    }
}
