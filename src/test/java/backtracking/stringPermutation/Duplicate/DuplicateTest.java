package backtracking.stringPermutation.Duplicate;

import com.halconbit.challenge.java.backtracking.stringPermutation.Duplicates.Duplicates;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

class DuplicatesTest {

    @Test
    public void testFindPermutationWithDuplicates() {
        Duplicates duplicates = new Duplicates();

        String input = "abca";
        List<String> expectedOutput = Arrays.asList("aabc", "aacb", "abac", "abca", "acab", "acba", "baac", "baca", "bcaa", "caab", "caba", "cbaa");
        List<String> actualOutput = duplicates.find_permutation(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindPermutationWithoutDuplicates() {
        Duplicates duplicates = new Duplicates();

        String input = "abc";
        List<String> expectedOutput = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        List<String> actualOutput = duplicates.find_permutation(input);

        assertEquals(expectedOutput, actualOutput);
    }
}