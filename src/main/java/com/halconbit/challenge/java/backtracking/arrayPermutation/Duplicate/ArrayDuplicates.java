package com.halconbit.challenge.java.backtracking.arrayPermutation.Duplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Equations:
 * TC: O(n * n!), SC: O(n)
 * @author Brayan Esteves
 */
public class ArrayDuplicates {
    private void dfs(List<List<Integer>> list, HashMap<Integer, Integer> map, List<Integer> perm, int n) {
        if(perm.size() == n) {
            list.add(new ArrayList<>(perm));
        }
        for(Integer key : map.keySet()) {
            if(map.get(key) > 0) {
                perm.add(key);
                map.put(key, map.get(key) - 1);
                dfs(list, map, perm, n);
                perm.remove(perm.size() - 1);
                map.put(key, map.get(key) + 1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        dfs(list, map, new ArrayList<>(), nums.length);
        return list;
    }
}
