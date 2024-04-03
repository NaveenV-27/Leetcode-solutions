class Solution {
    static boolean backtrack(char[][] board, String word, int i, int j, boolean[][] visited, int idx) {
        if(idx == word.length()) {
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(idx)) {
            return false;
        }
        visited[i][j] = true;
        if(backtrack(board, word, i+1, j, visited, idx+1) || backtrack(board, word, i, j+1, visited, idx+1) || backtrack(board, word, i-1, j, visited, idx+1) || backtrack(board, word, i, j-1, visited, idx+1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }   
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean visited[][] = new boolean[m][n];
        boolean result = false;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == word.charAt(0)) {
                    result = backtrack(board, word, i, j, visited, 0);
                    if(result) return true;
                }
            }
        }
        return false;
    }
}
