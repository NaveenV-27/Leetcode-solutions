class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int res[] = new int[n];
        int e = 0;
        int l = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == pivot) e++;
            if(nums[i] < pivot) l++;
        }
        for(int i=l; i<l+e; i++) {
            res[i] = pivot;
        }
        int i=0;
        int j=l+e;
        for(int k=0; k<n; k++) {
            if(nums[k]<pivot) {
                res[i++] = nums[k];
            } else if(nums[k] > pivot) {
                res[j++] = nums[k];
            }
        }
        return res;
    }
}
