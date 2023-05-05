package com.halconbit.challenge.java;

import com.halconbit.challenge.java.backtracking.arrayPermutation.Duplicate.ArrayDuplicates;
import com.halconbit.challenge.java.backtracking.arrayPermutation.Unique.Unique;
import com.halconbit.challenge.java.backtracking.powerSets.Duplicates.PowerSetsDuplicate;
import com.halconbit.challenge.java.backtracking.powerSets.Unique.PowerSetsUnique;
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
        
        NoDuplicates       noDuplicates       = new NoDuplicates();
        Duplicates         duplicates         = new Duplicates();
        Unique             unique             = new Unique();
        ArrayDuplicates    arrayUnique        = new ArrayDuplicates();
        PowerSetsUnique    powerSetsUnique    = new PowerSetsUnique();
        PowerSetsDuplicate powerSetsDuplicate = new PowerSetsDuplicate();
        
        String str                     = "";
        int[] numsA                    = {1, 2, 3};
        int[] numsB                    = {1, 1, 2};
        int[] numsC                    = {1, 2, 3};
        int[] numsD                    = {1, 2, 2};
        List<String> list              = new ArrayList<>();
        List<List<Integer>> listToList = new ArrayList<>();
        
        System.out.println("NO DUPLICATES");
        System.out.println("================");
        
        str  = "abc";        
        list = noDuplicates.find_permutation(str);
        
        for(String s : list) {
            System.out.println(s);
        }
        System.out.println("================");
        System.out.println("DUPLICATES");
    
        
        str = "abcc";
        list = noDuplicates.find_permutation(str);
        
        for(String s : list) {
            System.out.println(s);
        }
        System.out.println("================");        
        System.out.println("ARRAY PERMUTATIONS - UNIQUE");
                
        listToList = unique.permute(numsA);
        for(int i = 0; i < listToList.size(); i++) {
            System.out.println(listToList.get(i));
        }
        
        System.out.println("================");        
        System.out.println("ARRAY PERMUTATIONS - DUPLICATE UNIQUE");
        
        listToList = arrayUnique.permuteUnique(numsB);
        for(int i = 0; i < listToList.size(); i++) {
            System.out.println(listToList.get(i));
        }
        
        System.out.println("================");        
        System.out.println("POWER SETS - DUPLICATE UNIQUE");
        
        listToList = powerSetsUnique.subsets(numsC);
        for(int i = 0; i < listToList.size(); i++) {
            System.out.println(listToList.get(i));
        }
        
        System.out.println("================");        
        System.out.println("POWER SETS - DUPLICATES");
        
        listToList = powerSetsDuplicate.subsetsWithDup(numsD);
        for(int i = 0; i < listToList.size(); i++) {
            System.out.println(listToList.get(i));
        }
    }
    
}
