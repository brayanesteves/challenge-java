package com.halconbit.challenge.java;

import com.halconbit.challenge.java.backtracking.stringPermutation.Duplicates.Duplicates;
import com.halconbit.challenge.java.backtracking.stringPermutation.NoDuplicates.NoDuplicates;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brayan Esteves
 */
public class index {
    
    
    public static void main(String[] args) {
        System.out.println("NO DUPLICATES");
        System.out.println("================");
        NoDuplicates noDuplicates = new NoDuplicates();
        String str = "abc";
        List<String> listNoDuplicates = new ArrayList<>();
        listNoDuplicates = noDuplicates.find_permutation(str);
        
        for(String s : listNoDuplicates) {
            System.out.println(s);
        }
        System.out.println("================");
        System.out.println("DUPLICATES");
        System.out.println("================");
    
        Duplicates duplicates = new Duplicates();
        String strDuplicates = "abcc";
        List<String> listDuplicates = new ArrayList<>();
        listDuplicates = noDuplicates.find_permutation(strDuplicates);
        
        for(String s : listDuplicates) {
            System.out.println(s);
        }
        System.out.println("================");
    }
    
}
