package com.company.solutions;

import java.util.LinkedList;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class MinimumRemoveToMakeValidParentheses {
    public static String minRemoveToMakeValid(String s) {
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

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                if (isOk[i] == 1) {
                    answer.append(s.charAt(i));
                }
            } else {
                answer.append(s.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String s = minRemoveToMakeValid("lee(t(c)o)de)");
        System.out.println(s);
    }
}
