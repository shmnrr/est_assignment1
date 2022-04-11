package zest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeOneTest {

    @Test
    void isPalindromeExamples() {
        PalindromeOne palindromeOne = new PalindromeOne();

        assertTrue(palindromeOne.isPalindrome(121));

        assertFalse(palindromeOne.isPalindrome(-121));

        assertFalse(palindromeOne.isPalindrome(10));
    }

    @Test
    void isPalindromeTest() {
        // CONSTRAINTS: -2^20 > x and x > 2^20 - 1 should throw errors but not implemented
        //assertThrows(IllegalArgumentException.class, () -> palindromeOne.isPalindrome((int)Math.pow(2, 20));
        //assertThrows(IllegalArgumentException.class, () -> palindromeOne.isPalindrome((int)-Math.pow(2, 20) - 1));

        PalindromeOne palindromeOne = new PalindromeOne();

        // One sort of partition could be the ints below zero
        // meaning there is a minus sign at the beginning -> false
        // always false partition: negative numbers
        // cannot identify further clear partitions as this is just what the method does
        // i.e. classify input into palindromes and !palindromes

        // happy case: for every integer with 1 digit -> true
        assertTrue(palindromeOne.isPalindrome(1));
        assertTrue(palindromeOne.isPalindrome(9));

        // always false case: "-" sign at the beginning
        assertTrue(palindromeOne.isPalindrome(0)); // ON POINT
        assertFalse(palindromeOne.isPalindrome(-1)); // OFF POINT

        // To cover every branch we need: 1 digit int and >=2 digit int
        assertTrue(palindromeOne.isPalindrome(11));
        assertFalse(palindromeOne.isPalindrome(10));
    }
}