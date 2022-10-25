package com.company.solutions;

import java.util.ArrayList;

/**
 * 71. Simplify Path
 */
public class SimplifyPath {
    public static String simplifyPath(String path) {

        ArrayList<String> stack = new ArrayList<>();
        for (String directory : path.replaceFirst("/", "").split("/")) {
            if (directory.equals("")) {
                continue;
            } else if (directory.equals(".")) {
                continue;
            } else if (directory.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                } else {
                    continue;
                }
            } else {
                stack.add(directory);
            }
        }
        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        String s = simplifyPath("/../");
        System.out.println(s);
    }
}
