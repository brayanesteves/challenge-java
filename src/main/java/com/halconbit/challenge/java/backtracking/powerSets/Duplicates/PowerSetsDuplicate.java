package com.halconbit.challenge.java.backtracking.powerSets.Duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Equations:
 * TC: O(n * 2^n), SC: O(n)
 * @author Brayan Esteves
 */
public class PowerSetsDuplicate {
    private void dfs(int[] nums, List<List<Integer>> list, List<Integer> sub, int start) {
        list.add(new ArrayList<>(sub));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            sub.add(nums[i]);
            dfs(nums, list, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        dfs(nums, list, new ArrayList<>(), 0);
        return list;
    }
}
