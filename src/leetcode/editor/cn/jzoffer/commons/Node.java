package leetcode.editor.cn.jzoffer.commons;

import java.util.Objects;

/**
 * @Author: Snorlax
 * @Date: 2022/12/12 14:44
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return val == node.val && Objects.equals(next, node.next) && Objects.equals(random, node.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next, random);
    }
}
