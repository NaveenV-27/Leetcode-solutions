class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        for(int i=0; i <= n/2; i++) {
            if(i != n-i-1) {
                arr[i] = i+1;
                arr[n-i-1] = -(i+1);
            } 
        }
        return arr;
    }
}
