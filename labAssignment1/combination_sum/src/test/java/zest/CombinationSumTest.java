package zest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private static List<Integer> numbers(int... nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            list.add(n);
        }
        return list;
    }
    private static List<ArrayList<Integer>> lists(List<Integer>... lists) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        for(List<Integer> l : lists) {
            list.add((ArrayList<Integer>) l);
        }
        return list;
    }

    // CONSTRAINTS WHICH THE IMPLEMENTATION DOESN'T CHECK FOR
    // 1 <= candidates.length <= 30
    // 1 <= candidates[i] <= 200
    // all elements of candidates are distinct
    // assertThrows(IllegalArgumentException.class, notDistinct())
    // 1 <= target <= 500
    // THEORETICALLY THESE WOULD BE OUR BOUNDARIES:
    // 1, 30 for candidates.length
    // 1, 200 for candidates[i]
    // 1, 500 for target

    @Test
     void combinationSumExamples() {

        CombinationSum cs = new CombinationSum();
        List<List<Integer>> result;

        result = cs.combinationSum(new int[]{2,3,6,7},7);
        assertEquals(2, result.size());
        assertEquals(lists(numbers(2,2,3), numbers(7)), result);

        result = cs.combinationSum(new int[]{2,3,5},8);
        assertEquals(3, result.size());
        assertEquals(lists(numbers(2,2,2,2),numbers(2,3,3),numbers(3,5)), result);

        result = cs.combinationSum(new int[]{2},1);
        assertEquals(0, result.size());
        assertEquals(lists(), result);

    }

    @Test
    void combinationSumTarget() {
        // 1 <= target <= 500

        CombinationSum cs = new CombinationSum();
        List<List<Integer>> result;

        result = cs.combinationSum(new int[]{1,2,3},1);
        assertEquals(1, result.size());
        assertEquals(lists(numbers(1)), result);

        result = cs.combinationSum(new int[]{1,2,3},0);
        assertEquals(1, result.size());
        assertEquals(lists(numbers()), result);

        result = cs.combinationSum(new int[]{1,2,3},-1);
        assertEquals(0, result.size());
        assertEquals(lists(), result);

        result = cs.combinationSum(new int[]{200,250,300},500);
        assertEquals(2, result.size());
        assertEquals(lists(numbers(200,300),numbers(250,250)), result);

        // THIS SHOULD THROW ERROR for target > 500
        // assertThrows(IllegalArgumentException.class, () -> cs.combinationSum(int[], target));
        result = cs.combinationSum(new int[]{200,250,301,251},501);
        assertEquals(2, result.size());
        assertEquals(lists(numbers(200,301),numbers(250,251)), result);

    }

    @Test
    void combinationSumCandidates() {
        // 1 <= candidates.length <= 30

        CombinationSum cs = new CombinationSum();
        List<List<Integer>> result;

        //CHECK FOR BORDER SIZES OF THE ARRAY
        result = cs.combinationSum(new int[]{7},7);
        assertEquals(1, result.size());
        assertEquals(lists(numbers(7)), result);

        result = cs.combinationSum(new int[]{},7);
        assertEquals(0, result.size());
        assertEquals(lists(), result);

        Random random = new Random();
        int[] array30 = random.ints(30, 2,200).toArray();
        result = cs.combinationSum(array30,1);
        assertEquals(0, result.size());
        assertEquals(lists(), result);

        // THIS SHOULD THROW ERROR for array.length > 30
        // assertThrows(IllegalArgumentException.class, () -> cs.combinationSum(int[>30], target));
        int[] array31 = random.ints(31, 2,200).toArray();
        result = cs.combinationSum(array31,1);
        assertEquals(0, result.size());
        assertEquals(lists(), result);

        // CHECK FOR DUPLICATE CANDIDATES ELEMENTS
        // SHOULD THROW ERROR for duplicate candidates
        // assertThrows(IllegalArgumentException.class, () -> cs.combinationSum(int[] {dup, dup ...}, target));
        result = cs.combinationSum(new int[]{7,7},7);
        assertNotEquals(1, result.size());
        assertNotEquals(lists(numbers(7)), result);

        // 1 <= candidates[i] <= 200
        assertThrows(StackOverflowError.class, () -> cs.combinationSum(new int[]{0},1));
        assertThrows(StackOverflowError.class, () -> cs.combinationSum(new int[]{-1},1));
    }

}