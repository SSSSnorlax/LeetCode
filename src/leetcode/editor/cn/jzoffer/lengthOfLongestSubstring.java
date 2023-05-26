package leetcode.editor.cn.jzoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Snorlax
 * @Date: 2022/12/25 15:20
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int rk = -1, ans = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);

        }
        return ans;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring t = new lengthOfLongestSubstring();
        System.out.println(t.lengthOfLongestSubstring("dvdf"));
    }
}
