class Solution {
    public boolean consecutiveSetBits(int n) {
        int count = 0;
        boolean lastSet = false;
        while(n > 0) {
            if((n & 1) == 1) {
                if(lastSet) {
                    count++;
                } else {
                    lastSet = true;
                }
            } else {
                lastSet = false;
            }
            n >>= 1;
        }
        return count == 1;
        
    }
}
