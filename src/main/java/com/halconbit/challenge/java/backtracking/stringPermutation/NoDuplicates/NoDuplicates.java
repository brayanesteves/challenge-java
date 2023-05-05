package com.halconbit.challenge.java.backtracking.stringPermutation.NoDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class NoDuplicates {
    
    private void dfs(String str, String perm, List<String> list) {
        if(str.length() == 0) {
            list.add(perm);
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Current character
            String tmp = str.substring(0, i) + str.substring(i + 1);
            dfs(tmp, perm + ch, list);            
        }
    }
    
    public List<String> find_permutation(String string) {
        char[] arr = string.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        
        List<String> list = new ArrayList<>();
        dfs(str, "", list);
        return list;
    }
    
    
}
