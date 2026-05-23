class Solution {
    public int minimumSwaps(int[] arr) {
        int n = arr.length;
        // int last = n-1;
        // while(arr[last] == 0) {
        //     last--;
        // }
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) count++;
        }
        int ops = count;
        for(int i=n-1; i>=0 && i>n-count-1; i--){
            if(arr[i] == 0) ops--;
        }
        return ops;
    }
}
