class Solution {
    static boolean isSafe(char board[][], int row, int col) {
        for(int r=0; r<board.length; r++) {     //Horizontal
            if(board[r][col] == 'Q') {
                return false;
            }
        }
        for(int c=0; c<board.length; c++) {     //Vertical
            if(board[row][c] == 'Q') {
                return false;
            }
        }
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {    //upleft
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c>=0 && r<board.length; c--, r++) {  //upright
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r>=0; c++, r--) {  //downright
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for(int c=col; c<board.length && r<board.length; c++, r++) {    //downright
            if(board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void saveBoard(char board[][], List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }
    static void helper(char board[][], List<List<String>> allBoards, int col) {
        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for(int row=0; row<board.length; row++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }
}
