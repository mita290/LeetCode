class Solution {
    public void bfs(char[][] grid, int i, int j, int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        
        q.add(new int[]{i, j});
        grid[i][j] = '0';

        int[][] dir = {
            {0, -1},
            {-1, 0},
            {1, 0},
            {0, 1}
        };

        while (!q.isEmpty()) {

            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == '1') {
                    grid[nr][nc] = '0';
                    q.add(new int[]{nr, nc});
                }
            }
        }


    }

    /* DFS Approach
    public void dfs(char[][] grid, int i, int j, int row, int col) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j, row, col);
        dfs(grid, i, j - 1, row, col);
        dfs(grid, i + 1, j, row, col);
        dfs(grid, i, j + 1, row, col);
    } */


    public int numIslands(char[][] grid) {
        int ct = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ct++;
                    bfs(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return ct;
    }
}