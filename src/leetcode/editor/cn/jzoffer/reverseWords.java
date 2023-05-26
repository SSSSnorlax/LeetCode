package leetcode.editor.cn.jzoffer;

import java.util.*;

/**
 * @Author: Snorlax
 * @Date: 2022/12/26 16:43
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class reverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
