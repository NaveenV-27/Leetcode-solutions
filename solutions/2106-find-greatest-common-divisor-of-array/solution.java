class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i : nums) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        // System.out.println(min + ", " + max);
        for(int i=min; i>=1; i--) {
            if(min % i == 0 && max % i == 0) return i;
        } 
        return 1;
    }
}
