class Solution {
    private class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Pair pre[][] = new Pair[m][n];
        if(grid[0][0] == 'X') {
            pre[0][0] = new Pair(1, 0);
        } else if(grid[0][0] == 'Y') {
            pre[0][0] = new Pair(0, 1);
        } else {
            pre[0][0] = new Pair(0, 0);
        }
        int count = 0;
        for(int i=1; i<n; i++) {
            Pair p = pre[0][i-1];
            if(grid[0][i] == 'X') {
                if((p.x + 1) > 0 && (p.x + 1) == p.y) count++;
                pre[0][i] = new Pair(p.x + 1, p.y);
            } else if(grid[0][i] == 'Y') {
                if(p.x > 0 && p.x == (p.y + 1)) count++;
                pre[0][i] = new Pair(p.x, p.y + 1);
            } else {
                if(p.x > 0 && (p.x) == p.y) count++;
                pre[0][i] = new Pair(p.x, p.y);
            }
        }

        for(int i=1; i<m; i++) {
            int xc = 0;
            int yc = 0;
            for(int j=0; j<n; j++) {
                Pair p = pre[i-1][j];
                if(grid[i][j] == 'X') {
                    xc++;
                } else if(grid[i][j] == 'Y') {
                    yc++;
                }
                if((p.x + xc) > 0 && (p.x + xc) == (p.y + yc)) count++;
                pre[i][j] = new Pair(xc + p.x, yc + p.y);
            }
        }
        // for(int i=0; i<m; i++) {
        //     for(int j=0; j<n; j++) {
        //         Pair p = pre[i][j];
        //         // System.out.print(p.x + "," + p.y + " ");
        //         if(p.x > 0 && p.x == p.y) count++;
        //     }
        //     // System.out.println();
        // }
        return count;
    }
}
