class Solution {
    public int numSub(String s) {
        long count = 0, mod = 1000000007;
        for(int i=0; i<s.length(); i++) {
            long ones = 0;
            while(i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            count += (ones * (ones+1)/2) % mod;
        }
        return (int)count;
    }
}
