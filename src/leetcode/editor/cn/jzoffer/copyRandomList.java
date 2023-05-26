package leetcode.editor.cn.jzoffer;

import leetcode.editor.cn.jzoffer.commons.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Snorlax
 * @Date: 2022/12/12 14:45
 * @Version: 1.0
 * @History:
 * @Note:
 */

public class copyRandomList {
    Map<Node, Node> cacheMap = new HashMap<Node, Node>(1000);
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cacheMap.containsKey(head)) {
            Node headNew = new Node(head.val);
            cacheMap.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cacheMap.get(head);
    }
}
