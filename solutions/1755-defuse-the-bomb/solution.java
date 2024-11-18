class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if(k == 0) return ans;
        int s=0, e=0;
        if(k>0) {
            s = 1;
            e = k;
        } else {
            s = n - Math.abs(k);
            e = n - 1;
        }
        int sum = 0;
        for(int i=s; i<=e; i++) {
            sum += code[i];
        }
        for(int i=0; i<n; i++) {
            ans[i] = sum;
            sum = sum - code[s];
            e = (e+1)%n;
            sum = sum + code[e];
            s = (s+1)%n;
        }
        return ans;
    }
}
