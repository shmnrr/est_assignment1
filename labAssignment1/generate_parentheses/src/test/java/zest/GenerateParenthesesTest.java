package zest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.asList;

class GenerateParenthesesTest {

    private static List<String> array(String... par) {
        List<String> array = new ArrayList<>();
        for(String s : par) {
            array.add(s);
        }
        return array;
    }

    @Test
    void generateParenthesesExamples() {

        GenerateParentheses generateParentheses = new GenerateParentheses();

        assertEquals(array("((()))","(()())","(())()","()(())","()()()"), generateParentheses.generateParentheses(3));

        assertEquals(array("()"), generateParentheses.generateParentheses(1));
    }

    @Test
    void generateParenthesesPairs() {

        GenerateParentheses generateParentheses = new GenerateParentheses();

        // CONSTRAINTS: 1 <= n <= 8
        assertEquals(array("()"), generateParentheses.generateParentheses(1));
        assertEquals(1430, generateParentheses.generateParentheses(8).size());


        // SHOULD THROW ILLEGAL ARGUMENT ERROR for n<1 and n>8

        // assertThrows(IllegalArgumentException.class, () -> generateParentheses.generateParentheses(0));
        assertEquals(array(""), generateParentheses.generateParentheses(0));

        // assertThrows(IllegalArgumentException.class, () -> generateParentheses.generateParentheses(9));
        assertEquals(4862, generateParentheses.generateParentheses(9).size());

        // Check for negative values
        assertThrows(NegativeArraySizeException.class, () -> generateParentheses.generateParentheses(-1));
    }

}