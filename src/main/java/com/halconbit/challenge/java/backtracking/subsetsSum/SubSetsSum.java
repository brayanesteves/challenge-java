package com.halconbit.challenge.java.backtracking.subsetsSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Equations:
 * TC: O(2^n), SC: O(n) + O(2^n)
 * @author Brayan Esteves
 */
public class SubSetsSum {
    private int sum(List<Integer> list) {
        int sum = 0;
        for(Integer i : list) {
            sum += 1;
        }
        return sum;
    }
    private void dfs(int[] nums, List<Integer> sub, List<Integer> ans, int start) {
        ans.add(sum(sub));
        //list.add(new ArrayList<>(sub));
        for(int i = start; i < nums.length; i++) {
            sub.add(nums[i]);
            //dfs(nums, list, sub, ans, i +1);
            sub.remove(sub.size() - 1);
        }
    }
    
    private void dfs(ArrayList<Integer> arr, ArrayList<Integer> list, int sum, int index) {
        if(index == arr.size()) {
            list.add(sum);
            return;
        }
        dfs(arr, list, sum + arr.get(index), index + 1);
        dfs(arr, list, sum, index + 1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        dfs(nums, new ArrayList<>(), ans, 0);
        Collections.sort(ans);
        for(Integer i : ans) {
            System.out.println(i);
        }
        return list;
    }
    
    public ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(arr, list, 0, 0);        
        return list;
    }
}
