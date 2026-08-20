class Solution {
    public void dfs(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j, row, col);
        dfs(grid, i, j - 1, row, col);
        dfs(grid, i + 1, j, row, col);
        dfs(grid, i, j + 1, row, col);
    }


    public int numIslands(char[][] grid) {
        int ct = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ct++;
                    dfs(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return ct;
    }
}