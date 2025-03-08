class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for(int i=0; i<k; i++) {
            if(blocks.charAt(i) == 'B') {
                count++;
            }
        }
        if(count >= k) return 0;
        int max = count;
        int l=0, r=k;
        while(r<blocks.length()) {
            if(blocks.charAt(l) == 'B') {
                count--;
            }
            if(blocks.charAt(r) == 'B') {
                count++;
            }
            max = Math.max(max, count);
            l++;
            r++;
        }
        return k-max;
    }
}
