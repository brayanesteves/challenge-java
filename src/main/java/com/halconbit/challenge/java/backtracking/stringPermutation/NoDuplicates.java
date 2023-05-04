package com.halconbit.challenge.java.backtracking.stringPermutation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class NoDuplicates {
    
    public static void dfs(String str, String perm, List<String> list) {
        if(str.length() == 0) {
            list.add(perm);
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Current character
            String tmp = str.substring(0, i) + str.substring(i + 1);
            dfs(tmp, perm + ch, list);            
        }
    }
   
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        dfs(str, "", list);
        
        for(String s : list) {
            System.out.println(s);
        }
    }
    
}
