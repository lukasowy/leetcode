package com.company.solutions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * 589. N-ary Tree Preorder Traversal
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();

        if (root == null) return res;

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            res.add(node.val);
            Collections.reverse(node.children);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return res;
    }
}
