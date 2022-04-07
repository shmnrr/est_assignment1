package zest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeOneTest {

    @Test
    void isPalindrome() {
        // TESTS FOR PALINDROMEONE CLASS
        PalindromeOne palindromeOne = new PalindromeOne();

        // SPECIFICATION TESTING
        // One sort of boundary could be the ints going below zero
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

        // STRUCTURAL TESTING
        // To cover every branch we need: 1 digit int and >=2 digit int
        assertTrue(palindromeOne.isPalindrome(11));
        assertFalse(palindromeOne.isPalindrome(10));
    }
}