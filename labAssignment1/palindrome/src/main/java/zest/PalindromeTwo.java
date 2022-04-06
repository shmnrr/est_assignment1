package zest;

/**
 * Solution inspired by: https://leetcode.com/problems/palindrome-number/discuss/5317/9-ms-JAVA-Beats-99.5-java-solutions-easy-to-understand
 */
public class PalindromeTwo {

    static int v;

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;
        if (x < 100 && x % 11 == 0) return true;
        if (x < 1000 && ((x / 100) * 10 + x % 10) % 11 == 0) return true;

        v = x % 10;
        x = x / 10;
        while (x - v > 0) {
            v = v * 10 + x % 10;
            x /= 10;
        }
        if (v > x) {
            v /= 10;
        }
        return v == x;
    }
}
