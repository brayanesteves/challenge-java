/**
 * Letter Combinations of a Phone Number.
 * Given a "string" containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent. Return the answer in
 * "any order".
 * A mapping of digits to letters (just like on the telephone buttons) is given 
 * below. Note that 1 does not map to "any letter".
 * 
 * 
 */
package com.halconbit.challenge.java.backtracking.letterCombinationsOfAPhoneNumber;

import java.util.LinkedList;
import java.util.List;

/**
 * Equations:
 * TC: O(4^n), SC: O(n)
 * @author Brayan Esteves
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if(digits.length() == 0) {
            return list;
        }
        list.add("");
        String[] map = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 0; i < digits.length(); i++) { // "234"
            int index = Character.getNumericValue(digits.charAt(i));
            while(list.peek().length() == i) {
                String tmp = list.remove();
                for(char ch : map[index].toCharArray()) {
                    list.add(tmp + ch);
                }
            }
        }
        return list;
    }
}
