package zest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTwoTest {

    @Test
    void isPalindrome() {
        // CONSTRAINTS: -2^20 > x and x > 2^20 - 1 should throw errors but not implemented
        //assertThrows(IllegalArgumentException.class, () -> palindromeOne.isPalindrome((int)Math.pow(2, 20));
        //assertThrows(IllegalArgumentException.class, () -> palindromeOne.isPalindrome((int)-Math.pow(2, 20) - 1));

        PalindromeTwo palindromeTwo = new PalindromeTwo();

        // on-points: 0, 10
        assertFalse(palindromeTwo.isPalindrome(-1));
        assertTrue(palindromeTwo.isPalindrome(0));

        assertTrue(palindromeTwo.isPalindrome(9));
        assertFalse(palindromeTwo.isPalindrome(10));

        assertTrue(palindromeTwo.isPalindrome(11));
        assertTrue(palindromeTwo.isPalindrome(99));
        assertTrue(palindromeTwo.isPalindrome(999));
        assertTrue(palindromeTwo.isPalindrome(9999));
        assertTrue(palindromeTwo.isPalindrome(111));
        assertTrue(palindromeTwo.isPalindrome(1001));
        assertTrue(palindromeTwo.isPalindrome(11111));
        assertTrue(palindromeTwo.isPalindrome(111111));
        assertTrue(palindromeTwo.isPalindrome(1000001));

        assertFalse(palindromeTwo.isPalindrome(21));

        assertFalse(palindromeTwo.isPalindrome(211));
        assertFalse(palindromeTwo.isPalindrome(2211));
        assertFalse(palindromeTwo.isPalindrome(22211));
        assertFalse(palindromeTwo.isPalindrome(222211));
    }
}