class Solution {
    public int getLucky(String s, int k) {
        int val = 0;
        for(char ch: s.toCharArray()) {
            int num = ch-'a'+1;
            while(num > 0) {
                val += num%10;
                num /= 10;
            }
        }
        while(k-- > 1) {
            int sum = 0;
            while(val > 0) {
                sum += val%10;
                val /= 10;
            }
            val = sum;
        }
        return val;

    }
}
