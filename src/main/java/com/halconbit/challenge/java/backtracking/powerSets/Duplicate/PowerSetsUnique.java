package com.halconbit.challenge.java.backtracking.powerSets.Duplicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Equations:
 * O(n * 2^n), O(n)
 * @author Brayan Esteves
 */
public class PowerSetsUnique {
    private void dfs(int[] nums, List<List<Integer>> list, List<Integer> sub, int start) {
        list.add(new ArrayList<>(sub));
        for(int i = start; i < nums.length; i++) {
            sub.add(nums[i]);
            dfs(nums, list, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(nums, list, new ArrayList<>(), 0);
        return list;
    }
}
