package zest;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
     void combinationSum() {

        CombinationSum cs = new CombinationSum();
        List<List<Integer>> results;

        results = cs.combinationSum(new int[]{2, 3, 6, 7},7);
        assertEquals(2, results.size());

        results = cs.combinationSum(new int[]{6, 7},7);
        assertEquals(1, results.size());

        results = cs.combinationSum(new int[]{8, 9, 99},7);
        assertEquals(0, results.size());
    }

}