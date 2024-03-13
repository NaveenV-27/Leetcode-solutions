class Solution {
    public int pivotInteger(int n) {
        int fsum = 0, bsum = 0, i = 1, j = n;
        while(i<=j) {
            
            if((fsum == bsum) && (i == j)) {
                return i;
            }
            if(fsum > bsum) {
                bsum += j;
                j--;
            } else {
                fsum += i;
                i++;
            }
        }
        
        return -1;
    }
}
