class Solution {
    public int binaryGap(int n) {
        if(Integer.bitCount(n) < 2) return 0;
        String bin = Integer.toBinaryString(n);
        int last = -1, max = 0;
        for(int i=0; i<bin.length(); i++) {
            if(bin.charAt(i) == '1') {
                if(last != -1) max = Math.max(max, i - last);
                last = i;
            }
        }
        return max;
    }
}
