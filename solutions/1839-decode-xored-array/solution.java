class Solution {
    public int[] decode(int[] enc, int first) {
        int n = enc.length;
        int og[] = new int[n+1];
        og[0] = first;
        for(int i=0; i<n; i++) {
            og[i+1] = og[i] ^ enc[i];
        }
        return og;
    }
}
