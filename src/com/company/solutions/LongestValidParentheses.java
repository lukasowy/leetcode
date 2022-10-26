package com.company.solutions;

import java.util.LinkedList;

/**
 * 32. Longest Valid Parentheses
 */
public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int[] isOk = new int[s.length()];
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    isOk[stack.pop()] = 1;
                    isOk[i] = 1;
                }
            }
        }

        int count = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isOk[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }


    public static void main(String[] args) {
        int i = longestValidParentheses("())()()");
        System.out.println(i);
    }
}
