class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int sc = 0, msc = 0;
        int f = 0, e = tokens.length-1;
        while(f <= e) {
            if(power >= tokens[f]) {
                power -= tokens[f];
                sc++;
                f++;
            } else if(sc > 0) {
                power += tokens[e];
                sc--;
                e--;
            } else {
                break;
            }
            msc = Math.max(sc, msc);
        }
        return msc;
    }
}
