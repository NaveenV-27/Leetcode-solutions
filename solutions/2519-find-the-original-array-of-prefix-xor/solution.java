class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length <= 1) {
            return pref;
        }
        int n = pref.length;
        int og[] = new int[n];
        og[0] = pref[0];
        for(int i=1; i<n; i++) {
            og[i] = pref[i] ^ pref[i-1];
        }
        return og;
    }
}
