class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(n > 0) {
            int dig = n % 10;
            n /= 10;
            sum += dig;
            if(dig != 0) sb.append(dig);
        }
        if(sum == 0) return 0;
        return Long.parseLong(sb.reverse().toString()) * sum;
    }
}
