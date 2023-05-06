/**
 * Given "n" pairs of parentheses, write a function to 
 * "generate all combinations of well-formed parentheses".
 * Input: n = 3
 * Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
 */
package com.halconbit.challenge.java.backtracking.generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brayan Eseteves
 */
public class GenerateParentheses {
    private void dfs(List<String> list, int max, String str, int open, int close) {
        if(max * 2 == str.length()) {
            list.add(str);
            return;
        }
        if(open < max) {
            dfs(list, max, str + "(", open + 1, close);
        }
        if(close < open) {
            dfs(list, max, str + ")", open, close + 1);
        }
    }
    public List<String> generateParentheses(int n) {
        List<String> list = new ArrayList<>();
        dfs(list, n, "", 0, 0);
        return list;
    }
}
