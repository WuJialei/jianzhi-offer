public class Solution {
    
    boolean[][] visited;
    int rows;
    int cols;
    int th;
    int ans;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    
    public boolean dfs (int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || visited[x][y]) {
            return false;
        }
        visited[x][y] = true;
        int temp = 0;
        int tX = x;
        int tY = y;
        while (tX > 0) {
            temp += tX % 10;
            tX /= 10;
        }
        while (tY > 0) {
            temp += tY % 10;
            tY /= 10;
        }
        if (temp > th) {
            return false;
        }
        ++ans;
        for (int t = 0; t < dx.length; ++t) {
            dfs(x+dx[t], y+dy[t]);
        }
        return true;
    }
    
    
    
    public int movingCount(int threshold, int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        ans = 0;
        visited = new boolean[rows][cols];
        th = threshold;
        dfs(0, 0);
        return ans;
    }
}
