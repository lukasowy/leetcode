package com.company.solutions.graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeNode {

    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println("================================================");
        depthFirstValues(a);

        System.out.println("================================================");
        breadthFirstValues(a);
    }

    public static void depthFirstValues(TreeNode node) {
        if (node == null) return;

        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode currentTreeNode = stack.pop();
            System.out.println(currentTreeNode.value);

            if (currentTreeNode.left != null) {
                stack.push(currentTreeNode.left);
            }
            if (currentTreeNode.right != null) {
                stack.push(currentTreeNode.right);
            }
        }
    }

    public static void breadthFirstValues(TreeNode node) {
        if (node == null) {
            return;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {

            TreeNode current = queue.pollFirst();
            System.out.println(current.value);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }

        }
    }

}
