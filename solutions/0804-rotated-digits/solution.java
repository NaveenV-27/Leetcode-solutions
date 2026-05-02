class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(isGood(i)) {
                // System.out.println(i);
                count++;
            }
        }
        return count;
    }
    private boolean isGood(int n) {
        int dup = n;
        int res = 0;
        if(n < 10) {
            int rot = rotatedDig(n);
            return rot != -1 && rot != n;
        }
        boolean flag = false;
        while(dup > 0) {
            int dig = dup % 10;
            int rot = rotatedDig(dig);
            // System.out.println(dig + " -> " + rot);
            if(rot == -1) return false;
            else if(rot != dig) flag = true;
            dup /= 10;
        }
        return flag;

    }
    private int rotatedDig(int n) {
        if(n == 0 || n == 1 || n == 8) return n;
        else if(n == 2) return 5;
        else if(n == 5) return 2;
        else if(n == 6) return 9;
        else if(n == 9) return 6;
        else return -1;
    }
}
