class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int res[] = new int[n];
        int count = 0, map[] = new int[n+1];
        for(int i=0; i<n; i++) {
            if(++map[A[i]] == 2) count++;
            if(++map[B[i]] == 2) count++;
            res[i] = count;

        }
        return res;
    }
}
