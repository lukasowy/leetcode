package com.company.solutions;

/**
 * 1662. Check If Two String Arrays are Equivalent
 */
public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {
        boolean b = arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println(b);
    }
}
