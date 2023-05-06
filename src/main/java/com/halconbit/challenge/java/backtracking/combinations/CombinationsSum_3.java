/**
 * Find all valid combinations of "k" numbers that sum up to "n"
 * such that the following conditions are "true":
 * 1) Only numbers 1 through 9 are used.
 * 2) Each number is used "at most once".
 * 
 * Return a "list of all possible valid combinations". The list must not
 * contain the same combination twice, and the combinations may be
 * returned in any order.
 */
package com.halconbit.challenge.java.backtracking.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author brayan
 */
public class CombinationsSum_3 {
    private void dfs(List<List<Integer>> list, List<Integer> comb, int targetSum, int size, int start, int currentSum) {
        if(currentSum == targetSum && comb.size() == size) {
            list.add(new ArrayList<>(comb));
            return;
        } else if(currentSum > targetSum) {
            return;
        } else if(comb.size() == size) {
            return;
        }
        
        for(int i = start; i <= 9; i++) {            
            comb.add(i);
            dfs(list, comb, targetSum, size, i + 1, currentSum + i);
            comb.remove(comb.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, new ArrayList<>(), n, k, 1, 0);
        return list;
    }
}
