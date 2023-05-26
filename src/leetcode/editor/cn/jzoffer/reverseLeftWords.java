package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/13 09:07
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() < 2) {
            return s;
        }
        StringBuilder sb  = new StringBuilder(s.substring(n, s.length()));
        return sb.append(s.substring(0, n)).toString();
    }
}
