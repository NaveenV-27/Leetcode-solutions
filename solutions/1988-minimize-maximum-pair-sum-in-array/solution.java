class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0, j=n-1;
        int pairSums[] = new int[n/2];
        while(j>i) {
            pairSums[i] = nums[i] + nums[j];
            i++;
            j--;
        }
        int max = 0;
        for(int sum : pairSums) {
            if(sum > max) max = sum;
        }
        return max;
    }
}
