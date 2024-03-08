class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int a[] = new int[max + 1];
        max = 0;
        for(int i=0; i<nums.length; i++) {
            a[nums[i]]++;
            max = Math.max(max, a[nums[i]]);
        }
        int c = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == max) {
                c += a[i];
            }
        }
        return c;
    }
}
