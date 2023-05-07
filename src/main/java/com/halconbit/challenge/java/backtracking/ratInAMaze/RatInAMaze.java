/**
 * Consider a rat placed at (0, 0) in a square matrix of order N * N, it has to 
 * reach the destination at (N - 1, N - 1). Find all possible paths that the rat 
 * can take to reach from source to destination. The directions in which the rat 
 * can move are 'U'(up), 'D'(down), 'L'(left), 'R'(right). Value 0 at a cell in 
 * the matrix represents that it is blocked and rat cannot move to it while 
 * value 1 at a cell in the matrix represents that rat can be travel through it.
 * Note: In a path, no cell can be visited more than one time. If the source 
 * cell is 0, the rat cannot move to any other cell.
 * 
 * Example 1:
 * N = 4
 * m[][] = {{1, 0, 0, 0}},
 */
package com.halconbit.challenge.java.backtracking.ratInAMaze;

import java.util.ArrayList;

/**
 *
 * @author Brayan Esteves
 */
public class RatInAMaze {
    private void dfs(int[][] matrix, boolean[][] visited, ArrayList<String> res, int n , int r, int c, String currPath) {
        if(r < 0 || r >= n || c < 0 || c >= n || matrix[r][c] == 0 || visited[r][c]) {
            return;
        }
        if(r == n - 1 && c == n - 1) {
            res.add(currPath);
            return;
        }
        visited[r][c] = true;
        // Down, Up, Right, Left
        dfs(matrix, visited, res, n, r + 1, c, currPath + "D");
        dfs(matrix, visited, res, n, r - 1, c, currPath + "U");
        dfs(matrix, visited, res, n, r, c + 1, currPath + "R");
        dfs(matrix, visited, res, n, r - 1, c, currPath + "L");
        
        visited[r][c] = false;
    }
    public ArrayList<String> findPath(int[][] m, int n) {
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> res = new ArrayList<>();
        dfs(m, visited, res, n, 0, 0, "");
        return res;
    }
}
