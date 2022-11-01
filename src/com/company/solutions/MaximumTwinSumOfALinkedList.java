package com.company.solutions;

import static com.company.solutions.MaximumTwinSumOfALinkedList.Solution.pairSum;

/**
 * 2130. Maximum Twin Sum of a Linked List
 */
public class MaximumTwinSumOfALinkedList {

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(6);
        ListNode f = new ListNode(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        ListNode current = a;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

        System.out.println(pairSum(a));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {

        public static int pairSum(ListNode head) {

            ListNode secondPointer = head;
            ListNode secondPointerFaster = head;
            ListNode newHead = head;

            while (secondPointerFaster != null) {

                secondPointerFaster = secondPointerFaster.next.next;
                secondPointer = secondPointer.next;

                ListNode newNewHead = new ListNode(secondPointer.val);
                ListNode temp = newHead;
                newHead = newNewHead;
                newHead.next = temp;

            }

            int maxSum = Integer.MIN_VALUE;

            newHead = newHead.next;

            while (secondPointer != null) {
                maxSum = Math.max(maxSum, secondPointer.val + newHead.val);

                secondPointer = secondPointer.next;
                newHead = newHead.next;

            }


            return maxSum;
        }
    }
}
