package org.xjh;

public class StringPattern {

    /**
     * String Brute Force Match Algorithm
     *
     * @param pattern the pattern to match
     * @param text    the text to match against
     * @return lastIndex of the first character of the match, or -1 if no match
     * @implNote This is a brute force algorithm that runs in O(n*m) time.
     */
    public static int bruteForceMatch(String pattern, String text) {
        int n = text.length();
        int m = pattern.length();
        int i;
        int j;
        for (i = n - 1; i >= m - 1; i--) {
            for (j = m - 1; j >= 0; j--) {
                if (text.charAt(i - (m - 1 - j)) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j < 0) {
                return i - m + 1;
            }
        }
        return -1;
    }
}
