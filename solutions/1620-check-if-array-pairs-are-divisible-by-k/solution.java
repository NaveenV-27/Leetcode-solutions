class Solution {
    public boolean canArrange(int[] arr, int k) {
        int freq[] = new int[k];
        int n = arr.length;
        for(int i : arr) {
            if(i%k < 0) freq[((i%k)+k)%k]++;
            else freq[i%k]++;
        }
        if(freq[0] % 2 != 0) return false;
        for(int i=1; i<= k/2; i++) {
            if(freq[i] != freq[k-i]) return false;
        }
        return true;

    }
}
