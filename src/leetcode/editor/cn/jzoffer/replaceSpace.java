package leetcode.editor.cn.jzoffer;

/**
 * @Author: Snorlax
 * @Date: 2022/12/13 08:39
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class replaceSpace {
    public String replaceSpace(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        return s.replace(" ", "%20");
    }
}
