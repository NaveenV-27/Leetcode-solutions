class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int curr = 1;
        for(int i=1; i<n; i++) {
            if(Math.abs(arr[i]-curr)>1) {
                arr[i] = curr + 1;
            }
            curr = arr[i];
        }
        return curr;
    }
}
