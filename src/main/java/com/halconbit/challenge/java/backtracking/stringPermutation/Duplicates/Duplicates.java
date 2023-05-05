package com.halconbit.challenge.java.backtracking.stringPermutation.Duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Brayan Esteves
 */
public class Duplicates {
    private void dfs(String str, String perm, List<String> list) {
        if(str.length() == 0) {
            list.add(perm);
        }
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Current character
            if(!set.contains(ch)) {
                String tmp = str.substring(0, i) + str.substring(i + 1);
                dfs(tmp, perm + ch, list);
            }
            set.add(ch);
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
