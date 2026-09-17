class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        dfs(image,original,sr,sc,color);
        return image;
    }

    public void dfs(int[][] grid, int original, int sr, int sc, int color) {
        if (sr < 0 ||
                sr > grid.length - 1 ||
                sc < 0 ||
                sc > grid[0].length - 1 ||
                grid[sr][sc] == color) {
            return;
        }
        if (grid[sr][sc] == original) {
            grid[sr][sc] = color;
            dfs(grid,original, sr + 1, sc, color);
            dfs(grid,original, sr - 1, sc, color);
            dfs(grid,original, sr, sc + 1, color);
            dfs(grid,original, sr, sc - 1, color);
        }
    }
}