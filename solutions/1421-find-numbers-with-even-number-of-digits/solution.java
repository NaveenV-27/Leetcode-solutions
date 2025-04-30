class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(!(i <= 9 || (i > 99 && i <= 999) || (i > 9999 && i<= 99999))) {
                count++;
            }
        }
        return count;
    }
}
