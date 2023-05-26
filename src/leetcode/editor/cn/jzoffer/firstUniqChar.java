package leetcode.editor.cn.jzoffer;

import java.util.*;

/**
 * @Author: Snorlax
 * @Date: 2022/12/22 18:13
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class firstUniqChar {
    public char firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return ' ';
        }
        Map<Character, Integer> lMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (lMap.containsKey(s.charAt(i))) {
                lMap.replace(s.charAt(i), -1);
            } else {
                lMap.put(s.charAt(i), 1);
            }
        }
        for (Character c :
                lMap.keySet()) {
            if (lMap.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }
}
