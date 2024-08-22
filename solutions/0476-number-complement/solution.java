class Solution {
    public int findComplement(int num) {
        int cnt = 0, ans = num;
        while(num > 0) {
            cnt++;
            num >>= 1;
        }
        int n = (1<<cnt)-1;
        return ans ^ n;
    }
}
