class Solution {
    static final int INF = 1 << 29;

    public int minimumSum(int[][] grid) {
        int H = grid.length, W = grid[0].length;

        int[][] nextRight = new int[H][W];
        int[][] prevLeft  = new int[H][W];
        for (int r = 0; r < H; ++r) {
            int nxt = W;
            for (int c = W - 1; c >= 0; --c) {
                if (grid[r][c] == 1) nxt = c;
                nextRight[r][c] = nxt;
            }
            int prv = -1;
            for (int c = 0; c < W; ++c) {
                if (grid[r][c] == 1) prv = c;
                prevLeft[r][c] = prv;
            }
        }

        int[][] nextDown = new int[W][H];
        int[][] prevUp   = new int[W][H];
        for (int c = 0; c < W; ++c) {
            int nxt = H;
            for (int r = H - 1; r >= 0; --r) {
                if (grid[r][c] == 1) nxt = r;
                nextDown[c][r] = nxt;
            }
            int prv = -1;
            for (int r = 0; r < H; ++r) {
                if (grid[r][c] == 1) prv = r;
                prevUp[c][r] = prv;
            }
        }

        int[][] costCol = new int[W][W];
        {
            boolean[] has = new boolean[W];
            int[] mn = new int[W], mx = new int[W];
            for (int c = 0; c < W; ++c) { mn[c] = H; mx[c] = -1; }
            for (int c = 0; c < W; ++c) {
                for (int r = 0; r < H; ++r) if (grid[r][c] == 1) { mn[c] = Math.min(mn[c], r); mx[c] = Math.max(mx[c], r); }
                if (mn[c] <= mx[c]) has[c] = true;
            }
            for (int L = 0; L < W; ++L) {
                int top = H, bot = -1, left = -1, right = -1; boolean any = false;
                for (int R = L; R < W; ++R) {
                    if (has[R]) {
                        if (!any) left = R;
                        right = R; any = true;
                        top = Math.min(top, mn[R]); bot = Math.max(bot, mx[R]);
                    }
                    costCol[L][R] = any ? (right-left+1)*(bot-top+1) : 1;
                }
            }
        }

        int[][] costRow = new int[H][H];
        {
            boolean[] has = new boolean[H];
            int[] mn = new int[H], mx = new int[H];
            for (int r = 0; r < H; ++r) { mn[r] = W; mx[r] = -1; }
            for (int r = 0; r < H; ++r) {
                for (int c = 0; c < W; ++c) if (grid[r][c] == 1) { mn[r] = Math.min(mn[r], c); mx[r] = Math.max(mx[r], c); }
                if (mn[r] <= mx[r]) has[r] = true;
            }
            for (int T = 0; T < H; ++T) {
                int left = W, right = -1, top = -1, bot = -1; boolean any = false;
                for (int B = T; B < H; ++B) {
                    if (has[B]) {
                        if (!any) top = B;
                        bot = B; any = true;
                        left = Math.min(left, mn[B]); right = Math.max(right, mx[B]);
                    }
                    costRow[T][B] = any ? (right-left+1)*(bot-top+1) : 1;
                }
            }
        }

        int[][] best2H = new int[W][W];
        for (int L = 0; L < W; ++L) {
            for (int R = L; R < W; ++R) {
                int[] pref = new int[H], suf = new int[H];
                boolean any = false; int top = H, bot = -1, left = W, right = -1;
                for (int r = 0; r < H; ++r) {
                    int lp = nextRight[r][L];
                    if (lp <= R) {
                        any = true; if (top == H) top = r; bot = r;
                        left = Math.min(left, lp);
                        right = Math.max(right, prevLeft[r][R]);
                    }
                    pref[r] = any ? (bot-top+1)*(right-left+1) : 1;
                }
                any = false; top = H; bot = -1; left = W; right = -1;
                for (int r = H - 1; r >= 0; --r) {
                    int lp = nextRight[r][L];
                    if (lp <= R) {
                        any = true; if (bot == -1) bot = r; top = r;
                        left = Math.min(left, lp);
                        right = Math.max(right, prevLeft[r][R]);
                    }
                    suf[r] = any ? (bot-top+1)*(right-left+1) : 1;
                }
                int best = INF;
                for (int r = 0; r + 1 < H; ++r) best = Math.min(best, pref[r] + suf[r+1]);
                best2H[L][R] = best;
            }
        }

        int[][] best2V = new int[H][H];
        for (int T = 0; T < H; ++T) {
            for (int B = T; B < H; ++B) {
                int[] pref = new int[W], suf = new int[W];
                boolean any = false; int l = -1, rgt = -1, top = H, bot = -1;
                for (int c = 0; c < W; ++c) {
                    int fr = nextDown[c][T];
                    if (fr <= B) {
                        any = true; if (l == -1) l = c; rgt = c;
                        top = Math.min(top, fr);
                        bot = Math.max(bot, prevUp[c][B]);
                    }
                    pref[c] = any ? (rgt-l+1)*(bot-top+1) : 1;
                }
                any = false; l = -1; rgt = -1; top = H; bot = -1;
                for (int c = W - 1; c >= 0; --c) {
                    int fr = nextDown[c][T];
                    if (fr <= B) {
                        any = true; if (rgt == -1) rgt = c; l = c;
                        top = Math.min(top, fr);
                        bot = Math.max(bot, prevUp[c][B]);
                    }
                    suf[c] = any ? (rgt-l+1)*(bot-top+1) : 1;
                }
                int best = INF;
                for (int c = 0; c + 1 < W; ++c) best = Math.min(best, pref[c] + suf[c+1]);
                best2V[T][B] = best;
            }
        }

        int ans = Math.min(three(costCol, W), three(costRow, H));
        for (int c = 0; c + 1 < W; ++c) {
            ans = Math.min(ans, costCol[0][c] + best2H[c+1][W-1]);
            ans = Math.min(ans, best2H[0][c] + costCol[c+1][W-1]);
        }
        for (int r = 0; r + 1 < H; ++r) {
            ans = Math.min(ans, costRow[0][r] + best2V[r+1][H-1]);
            ans = Math.min(ans, best2V[0][r] + costRow[r+1][H-1]);
        }
        return ans;
    }

    private int three(int[][] cost, int N) {
        int[] dp1 = new int[N];
        for (int i = 0; i < N; ++i) dp1[i] = cost[0][i];
        int[] dp2 = new int[N];
        java.util.Arrays.fill(dp2, INF);
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < i; ++j)
                dp2[i] = Math.min(dp2[i], dp1[j] + cost[j+1][i]);
        int[] dp3 = new int[N];
        java.util.Arrays.fill(dp3, INF);
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < i; ++j)
                if (dp2[j] < INF) dp3[i] = Math.min(dp3[i], dp2[j] + cost[j+1][i]);
        return dp3[N-1];
    }
}
