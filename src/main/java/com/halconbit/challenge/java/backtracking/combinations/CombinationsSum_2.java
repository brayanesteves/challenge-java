package com.halconbit.challenge.java.backtracking.combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Equations:
 * TC: O(2^n) + O(n log n), SC: O(n)
 * @author Brayan Esteves
 */
public class CombinationsSum_2 {
    private void dfs(int[] nums, List<List<Integer>> list, List<Integer> comb, int targetSum, int currentSum, int start) {
        if(currentSum == targetSum) {
            list.add(new ArrayList<>(comb));
            return;
        } else if(currentSum > targetSum) {
            return;
        }
        
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            comb.add(nums[i]);
            dfs(nums, list, comb, targetSum, currentSum + nums[i], i + 1);
            comb.remove(comb.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, list, new ArrayList<>(), target, 0, 0);
        return list;
    }
}
