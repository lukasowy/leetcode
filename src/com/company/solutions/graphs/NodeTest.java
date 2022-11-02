package com.company.solutions.graphs;

public class NodeTest {
    public static void main(String[] args) {
        Node a = new Node(new Vertex("A"));
        Node b = new Node(new Vertex("B"));
        Node c = new Node(new Vertex("C"));
        Node d = new Node(new Vertex("D"));
        Node e = new Node(new Vertex("E"));
        Node f = new Node(new Vertex("F"));
        Node g = new Node(new Vertex("G"));

        a.setNextNode(b);
        b.setNextNode(c);
        c.setNextNode(d);
        d.setNextNode(e);
        e.setNextNode(f);
        f.setNextNode(g);

        printNodes(a);
        System.out.println("==============================");
        printRecursivelyNodes(a);

        System.out.println("==============================");
        printRecursivelyNodes(reverseNodeList(a));
    }

    private static void printNodes(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.getData());
            current = current.getNextNode();
        }
    }

    private static void printRecursivelyNodes(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data.getData());
        printRecursivelyNodes(head.getNextNode());
    }

    private static Node reverseNodeList(Node head) {
        Node previous = null;
        Node current = head;
        Node leader;

        while (current != null) {
            leader = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = leader;
        }

        return previous;
    }
}
