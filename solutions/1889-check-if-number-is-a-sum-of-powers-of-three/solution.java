class Solution {
    public boolean checkPowersOfThree(int n) {
        for(int i=16; i>=0; i--) {
            int pow = (int)Math.pow(3, i);
            if(n >= pow) {
                if(Math.floor(n/pow) >= 2) return false;
                n %= pow; 
            }
        }
        return true;
    }
}
