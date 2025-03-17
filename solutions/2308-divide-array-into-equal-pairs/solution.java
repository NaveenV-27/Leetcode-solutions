class Solution {
    public boolean divideArray(int[] nums) {
        int map[] = new int[500];
        for(int i:nums) {
            map[i-1]++;
        }
        for(int i=0; i<500; i++) {
            if(map[i]%2!=0) {
                return false;
            }
        }
        return true;
    }
}
