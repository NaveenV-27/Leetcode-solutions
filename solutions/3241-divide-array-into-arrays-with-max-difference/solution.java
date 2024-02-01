class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int res[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=3) {
            if(nums[i+2] - nums[i] > k) {
                return new int[0][0];
            }
        }
        int n=0;
        for(int i=0;i<nums.length/3; i++) {
            for(int j=0; j<3; j++) {
               res[i][j] = nums[n];
               n++;  
            }
        }
        
        return res;
    }
}
