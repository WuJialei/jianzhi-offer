public class Solution {
    
    private int len;
    private char[] matrix;
    private int rows;
    private int cols;
    private char[] str;
    private int[] dx = {1, -1, 0, 0};
    private int[] dy = {0, 0, 1, -1};
    
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        len = str.length;
        this.matrix = matrix;
        this.rows = rows;
        this.cols = cols;
        this.str = str;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (dfs(i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs (int x, int y, int cnt, boolean[][] visited) {
        if (cnt >= len) {
            return true;
        }
        if (x < 0 || x >= rows || y < 0 || y >= cols || visited[x][y]) {
            return false;
        }
        if (matrix[x*cols + y] != str[cnt]) {
            return false;
        }
        visited[x][y] = true;
        for (int i = 0; i < dx.length; ++i) {
            if (dfs(x+dx[i], y+dy[i], cnt+1, visited)) {
                return true;
            }
        }
        visited[x][y] = false;
        return false;
    }

}
