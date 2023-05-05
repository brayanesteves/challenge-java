package com.halconbit.challenge.java.backtracking.arrayPermutation.Unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Equations:
 * TC: O(n * log n) + O(n * n!), SC: O(n)
 * @author Brayan Esteves
 */
public class Unique {
    private void dfs(int[] nums, List<List<Integer>> list, List<Integer> permute) {
        if(permute.size() == nums.length) {
            list.add(new ArrayList<>(permute));
        }
        for(int i = 0; i < nums.length; i++) {
            if(permute.contains(nums[i])) {
                continue;
            }
            permute.add(nums[i]);
            dfs(nums, list, permute);
            permute.remove(permute.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        dfs(nums, list, new ArrayList<>());
        return list;
    }
}
