class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        int prefix = 0;
        int sol = 0;
        for(int i : nums) {
            if(i==0) {
                // int suff = (sum - prefix);
                if(prefix == (sum - prefix)) {
                    sol += 2;
                } else if(Math.abs(prefix - (sum - prefix)) == 1) {
                    sol += 1;
                } 
            }
            prefix += i;
        }
        return sol;
    }
}
